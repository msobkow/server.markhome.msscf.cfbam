// Description: Java 11 Table Object interface for CFBam.

/*
 *	server.markhome.msscf.CFBam
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfbam.CFBamObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfint.CFInt.*;
import server.markhome.msscf.cfsec.CFSecObj.*;
import server.markhome.msscf.cfint.CFIntObj.*;
import server.markhome.msscf.cfbam.CFBam.*;

public interface ICFBamId32GenTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new Id32Gen instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamId32GenObj newInstance();

	/**
	 *	Instantiate a new Id32Gen edition of the specified Id32Gen instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamId32GenEditObj newEditInstance( ICFBamId32GenObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamId32GenObj realiseId32Gen( ICFBamId32GenObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamId32GenObj createId32Gen( ICFBamId32GenObj Obj );

	/**
	 *	Read a Id32Gen-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Id32Gen-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamId32GenObj readId32Gen( CFBamValuePKey pkey );

	/**
	 *	Read a Id32Gen-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Id32Gen-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamId32GenObj readId32Gen( CFBamValuePKey pkey,
		boolean forceRead );

	ICFBamId32GenObj readCachedId32Gen( CFBamValuePKey pkey );

	public void reallyDeepDisposeId32Gen( ICFBamId32GenObj obj );

	void deepDisposeId32Gen( CFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamId32GenObj lockId32Gen( CFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the Id32Gen-derived instances in the database.
	 *
	 *	@return	List of ICFBamId32GenObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamId32GenObj> readAllId32Gen();

	/**
	 *	Return a sorted map of all the Id32Gen-derived instances in the database.
	 *
	 *	@return	List of ICFBamId32GenObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamId32GenObj> readAllId32Gen( boolean forceRead );

	List<ICFBamId32GenObj> readCachedAllId32Gen();

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamId32GenObj readId32GenByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamId32GenObj readId32GenByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamId32GenObj readId32GenByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamId32GenObj readId32GenByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamId32GenObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamId32GenObj> readId32GenByValTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamId32GenObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamId32GenObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamId32GenObj> readId32GenByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamId32GenObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamId32GenObj> readId32GenByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamId32GenObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamId32GenObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamId32GenObj> readId32GenByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamId32GenObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamId32GenObj> readId32GenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamId32GenObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamId32GenObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamId32GenObj> readId32GenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamId32GenObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamId32GenObj> readId32GenByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamId32GenObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamId32GenObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamId32GenObj> readId32GenByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamId32GenObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamId32GenObj> readId32GenByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamId32GenObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamId32GenObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamId32GenObj> readId32GenByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamId32GenObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamId32GenObj> readId32GenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of CFBamId32GenObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamId32GenObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamId32GenObj> readId32GenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamId32GenObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamId32GenObj> readId32GenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of CFBamId32GenObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamId32GenObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamId32GenObj> readId32GenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamInt32TypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamId32GenObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamId32GenObj> readId32GenBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Get the map of CFBamId32GenObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamId32GenObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamId32GenObj> readId32GenBySchemaIdx( long TenantId,
		long SchemaDefId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamId32GenObj instances sorted by their primary keys for the duplicate DispIdx key.
	 *
	 *	@param	argDispenserTenantId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDispenserId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamId32GenObj cached instances sorted by their primary keys for the duplicate DispIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamId32GenObj> readId32GenByDispIdx( Long DispenserTenantId,
		Long DispenserId );

	/**
	 *	Get the map of CFBamId32GenObj instances sorted by their primary keys for the duplicate DispIdx key.
	 *
	 *	@param	argDispenserTenantId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDispenserId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamId32GenObj cached instances sorted by their primary keys for the duplicate DispIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamId32GenObj> readId32GenByDispIdx( Long DispenserTenantId,
		Long DispenserId,
		boolean forceRead );

	ICFBamId32GenObj readCachedId32GenByIdIdx( long TenantId,
		long Id );

	ICFBamId32GenObj readCachedId32GenByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<ICFBamId32GenObj> readCachedId32GenByValTentIdx( long TenantId );

	List<ICFBamId32GenObj> readCachedId32GenByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamId32GenObj> readCachedId32GenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamId32GenObj> readCachedId32GenByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamId32GenObj> readCachedId32GenByNextIdx( Long NextTenantId,
		Long NextId );

	List<ICFBamId32GenObj> readCachedId32GenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<ICFBamId32GenObj> readCachedId32GenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<ICFBamId32GenObj> readCachedId32GenBySchemaIdx( long TenantId,
		long SchemaDefId );

	List<ICFBamId32GenObj> readCachedId32GenByDispIdx( Long DispenserTenantId,
		Long DispenserId );

	void deepDisposeId32GenByIdIdx( long TenantId,
		long Id );

	void deepDisposeId32GenByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeId32GenByValTentIdx( long TenantId );

	void deepDisposeId32GenByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeId32GenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeId32GenByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeId32GenByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeId32GenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeId32GenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeId32GenBySchemaIdx( long TenantId,
		long SchemaDefId );

	void deepDisposeId32GenByDispIdx( Long DispenserTenantId,
		Long DispenserId );

	/**
	 *	Internal use only.
	 */
	ICFBamId32GenObj updateId32Gen( ICFBamId32GenObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteId32Gen( ICFBamId32GenObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Id32Gen key attribute of the instance generating the id.
	 */
	void deleteId32GenByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Id32Gen key attribute of the instance generating the id.
	 */
	void deleteId32GenByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Id32Gen key attribute of the instance generating the id.
	 */
	void deleteId32GenByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Id32Gen key attribute of the instance generating the id.
	 */
	void deleteId32GenByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Id32Gen key attribute of the instance generating the id.
	 */
	void deleteId32GenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Id32Gen key attribute of the instance generating the id.
	 */
	void deleteId32GenByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Id32Gen key attribute of the instance generating the id.
	 */
	void deleteId32GenByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Id32Gen key attribute of the instance generating the id.
	 */
	void deleteId32GenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Id32Gen key attribute of the instance generating the id.
	 */
	void deleteId32GenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The Id32Gen key attribute of the instance generating the id.
	 */
	void deleteId32GenBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDispenserTenantId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDispenserId	The Id32Gen key attribute of the instance generating the id.
	 */
	void deleteId32GenByDispIdx( Long DispenserTenantId,
		Long DispenserId );

	/**
	 *	Move the CFBamId32GenObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamId32GenObj refreshed cache instance.
	 */
	ICFBamId32GenObj moveUpId32Gen( ICFBamId32GenObj Obj );

	/**
	 *	Move the CFBamId32GenObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamId32GenObj refreshed cache instance.
	 */
	ICFBamId32GenObj moveDownId32Gen( ICFBamId32GenObj Obj );
}
