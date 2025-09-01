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

public interface ICFBamTZDateTypeTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new TZDateType instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamTZDateTypeObj newInstance();

	/**
	 *	Instantiate a new TZDateType edition of the specified TZDateType instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamTZDateTypeEditObj newEditInstance( ICFBamTZDateTypeObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamTZDateTypeObj realiseTZDateType( ICFBamTZDateTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamTZDateTypeObj createTZDateType( ICFBamTZDateTypeObj Obj );

	/**
	 *	Read a TZDateType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TZDateType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamTZDateTypeObj readTZDateType( CFBamValuePKey pkey );

	/**
	 *	Read a TZDateType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TZDateType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamTZDateTypeObj readTZDateType( CFBamValuePKey pkey,
		boolean forceRead );

	ICFBamTZDateTypeObj readCachedTZDateType( CFBamValuePKey pkey );

	public void reallyDeepDisposeTZDateType( ICFBamTZDateTypeObj obj );

	void deepDisposeTZDateType( CFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamTZDateTypeObj lockTZDateType( CFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the TZDateType-derived instances in the database.
	 *
	 *	@return	List of ICFBamTZDateTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamTZDateTypeObj> readAllTZDateType();

	/**
	 *	Return a sorted map of all the TZDateType-derived instances in the database.
	 *
	 *	@return	List of ICFBamTZDateTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamTZDateTypeObj> readAllTZDateType( boolean forceRead );

	List<ICFBamTZDateTypeObj> readCachedAllTZDateType();

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamTZDateTypeObj readTZDateTypeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamTZDateTypeObj readTZDateTypeByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamTZDateTypeObj readTZDateTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamTZDateTypeObj readTZDateTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZDateTypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZDateTypeObj> readTZDateTypeByValTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamTZDateTypeObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZDateTypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZDateTypeObj> readTZDateTypeByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZDateTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZDateTypeObj> readTZDateTypeByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamTZDateTypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZDateTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZDateTypeObj> readTZDateTypeByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZDateTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZDateTypeObj> readTZDateTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamTZDateTypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZDateTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZDateTypeObj> readTZDateTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZDateTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZDateTypeObj> readTZDateTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamTZDateTypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZDateTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZDateTypeObj> readTZDateTypeByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZDateTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZDateTypeObj> readTZDateTypeByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamTZDateTypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZDateTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZDateTypeObj> readTZDateTypeByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZDateTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZDateTypeObj> readTZDateTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of CFBamTZDateTypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZDateTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZDateTypeObj> readTZDateTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZDateTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZDateTypeObj> readTZDateTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of CFBamTZDateTypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZDateTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZDateTypeObj> readTZDateTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamTZDateTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZDateTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZDateTypeObj> readTZDateTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Get the map of CFBamTZDateTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZDateTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZDateTypeObj> readTZDateTypeBySchemaIdx( long TenantId,
		long SchemaDefId,
		boolean forceRead );

	ICFBamTZDateTypeObj readCachedTZDateTypeByIdIdx( long TenantId,
		long Id );

	ICFBamTZDateTypeObj readCachedTZDateTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<ICFBamTZDateTypeObj> readCachedTZDateTypeByValTentIdx( long TenantId );

	List<ICFBamTZDateTypeObj> readCachedTZDateTypeByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamTZDateTypeObj> readCachedTZDateTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamTZDateTypeObj> readCachedTZDateTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamTZDateTypeObj> readCachedTZDateTypeByNextIdx( Long NextTenantId,
		Long NextId );

	List<ICFBamTZDateTypeObj> readCachedTZDateTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<ICFBamTZDateTypeObj> readCachedTZDateTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<ICFBamTZDateTypeObj> readCachedTZDateTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	void deepDisposeTZDateTypeByIdIdx( long TenantId,
		long Id );

	void deepDisposeTZDateTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeTZDateTypeByValTentIdx( long TenantId );

	void deepDisposeTZDateTypeByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeTZDateTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeTZDateTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeTZDateTypeByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeTZDateTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeTZDateTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeTZDateTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Internal use only.
	 */
	ICFBamTZDateTypeObj updateTZDateType( ICFBamTZDateTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTZDateType( ICFBamTZDateTypeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TZDateType key attribute of the instance generating the id.
	 */
	void deleteTZDateTypeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TZDateType key attribute of the instance generating the id.
	 */
	void deleteTZDateTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZDateType key attribute of the instance generating the id.
	 */
	void deleteTZDateTypeByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateType key attribute of the instance generating the id.
	 */
	void deleteTZDateTypeByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TZDateType key attribute of the instance generating the id.
	 */
	void deleteTZDateTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZDateType key attribute of the instance generating the id.
	 */
	void deleteTZDateTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZDateType key attribute of the instance generating the id.
	 */
	void deleteTZDateTypeByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZDateType key attribute of the instance generating the id.
	 */
	void deleteTZDateTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZDateType key attribute of the instance generating the id.
	 */
	void deleteTZDateTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The TZDateType key attribute of the instance generating the id.
	 */
	void deleteTZDateTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Move the CFBamTZDateTypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamTZDateTypeObj refreshed cache instance.
	 */
	ICFBamTZDateTypeObj moveUpTZDateType( ICFBamTZDateTypeObj Obj );

	/**
	 *	Move the CFBamTZDateTypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamTZDateTypeObj refreshed cache instance.
	 */
	ICFBamTZDateTypeObj moveDownTZDateType( ICFBamTZDateTypeObj Obj );
}
