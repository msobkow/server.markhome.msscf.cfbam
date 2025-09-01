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

public interface ICFBamInt16TypeTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new Int16Type instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamInt16TypeObj newInstance();

	/**
	 *	Instantiate a new Int16Type edition of the specified Int16Type instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamInt16TypeEditObj newEditInstance( ICFBamInt16TypeObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamInt16TypeObj realiseInt16Type( ICFBamInt16TypeObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamInt16TypeObj createInt16Type( ICFBamInt16TypeObj Obj );

	/**
	 *	Read a Int16Type-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Int16Type-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamInt16TypeObj readInt16Type( CFBamValuePKey pkey );

	/**
	 *	Read a Int16Type-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Int16Type-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamInt16TypeObj readInt16Type( CFBamValuePKey pkey,
		boolean forceRead );

	ICFBamInt16TypeObj readCachedInt16Type( CFBamValuePKey pkey );

	public void reallyDeepDisposeInt16Type( ICFBamInt16TypeObj obj );

	void deepDisposeInt16Type( CFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamInt16TypeObj lockInt16Type( CFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the Int16Type-derived instances in the database.
	 *
	 *	@return	List of ICFBamInt16TypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamInt16TypeObj> readAllInt16Type();

	/**
	 *	Return a sorted map of all the Int16Type-derived instances in the database.
	 *
	 *	@return	List of ICFBamInt16TypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamInt16TypeObj> readAllInt16Type( boolean forceRead );

	List<ICFBamInt16TypeObj> readCachedAllInt16Type();

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamInt16TypeObj readInt16TypeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamInt16TypeObj readInt16TypeByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamInt16TypeObj readInt16TypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamInt16TypeObj readInt16TypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt16TypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt16TypeObj> readInt16TypeByValTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamInt16TypeObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt16TypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt16TypeObj> readInt16TypeByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt16TypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt16TypeObj> readInt16TypeByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamInt16TypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt16TypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt16TypeObj> readInt16TypeByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt16TypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt16TypeObj> readInt16TypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamInt16TypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt16TypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt16TypeObj> readInt16TypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt16TypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt16TypeObj> readInt16TypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamInt16TypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt16TypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt16TypeObj> readInt16TypeByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt16TypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt16TypeObj> readInt16TypeByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamInt16TypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt16TypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt16TypeObj> readInt16TypeByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt16TypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt16TypeObj> readInt16TypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of CFBamInt16TypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt16TypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt16TypeObj> readInt16TypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt16TypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt16TypeObj> readInt16TypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of CFBamInt16TypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt16TypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt16TypeObj> readInt16TypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamInt16TypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt16TypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt16TypeObj> readInt16TypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Get the map of CFBamInt16TypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt16TypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt16TypeObj> readInt16TypeBySchemaIdx( long TenantId,
		long SchemaDefId,
		boolean forceRead );

	ICFBamInt16TypeObj readCachedInt16TypeByIdIdx( long TenantId,
		long Id );

	ICFBamInt16TypeObj readCachedInt16TypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<ICFBamInt16TypeObj> readCachedInt16TypeByValTentIdx( long TenantId );

	List<ICFBamInt16TypeObj> readCachedInt16TypeByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamInt16TypeObj> readCachedInt16TypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamInt16TypeObj> readCachedInt16TypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamInt16TypeObj> readCachedInt16TypeByNextIdx( Long NextTenantId,
		Long NextId );

	List<ICFBamInt16TypeObj> readCachedInt16TypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<ICFBamInt16TypeObj> readCachedInt16TypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<ICFBamInt16TypeObj> readCachedInt16TypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	void deepDisposeInt16TypeByIdIdx( long TenantId,
		long Id );

	void deepDisposeInt16TypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeInt16TypeByValTentIdx( long TenantId );

	void deepDisposeInt16TypeByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeInt16TypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeInt16TypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeInt16TypeByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeInt16TypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeInt16TypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeInt16TypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Internal use only.
	 */
	ICFBamInt16TypeObj updateInt16Type( ICFBamInt16TypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteInt16Type( ICFBamInt16TypeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Int16Type key attribute of the instance generating the id.
	 */
	void deleteInt16TypeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Int16Type key attribute of the instance generating the id.
	 */
	void deleteInt16TypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int16Type key attribute of the instance generating the id.
	 */
	void deleteInt16TypeByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int16Type key attribute of the instance generating the id.
	 */
	void deleteInt16TypeByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Int16Type key attribute of the instance generating the id.
	 */
	void deleteInt16TypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Int16Type key attribute of the instance generating the id.
	 */
	void deleteInt16TypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Int16Type key attribute of the instance generating the id.
	 */
	void deleteInt16TypeByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Int16Type key attribute of the instance generating the id.
	 */
	void deleteInt16TypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Int16Type key attribute of the instance generating the id.
	 */
	void deleteInt16TypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The Int16Type key attribute of the instance generating the id.
	 */
	void deleteInt16TypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Move the CFBamInt16TypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamInt16TypeObj refreshed cache instance.
	 */
	ICFBamInt16TypeObj moveUpInt16Type( ICFBamInt16TypeObj Obj );

	/**
	 *	Move the CFBamInt16TypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamInt16TypeObj refreshed cache instance.
	 */
	ICFBamInt16TypeObj moveDownInt16Type( ICFBamInt16TypeObj Obj );
}
