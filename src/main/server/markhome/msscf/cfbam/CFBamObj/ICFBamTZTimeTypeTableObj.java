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

public interface ICFBamTZTimeTypeTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new TZTimeType instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamTZTimeTypeObj newInstance();

	/**
	 *	Instantiate a new TZTimeType edition of the specified TZTimeType instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamTZTimeTypeEditObj newEditInstance( ICFBamTZTimeTypeObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamTZTimeTypeObj realiseTZTimeType( ICFBamTZTimeTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamTZTimeTypeObj createTZTimeType( ICFBamTZTimeTypeObj Obj );

	/**
	 *	Read a TZTimeType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TZTimeType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamTZTimeTypeObj readTZTimeType( CFBamValuePKey pkey );

	/**
	 *	Read a TZTimeType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TZTimeType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamTZTimeTypeObj readTZTimeType( CFBamValuePKey pkey,
		boolean forceRead );

	ICFBamTZTimeTypeObj readCachedTZTimeType( CFBamValuePKey pkey );

	public void reallyDeepDisposeTZTimeType( ICFBamTZTimeTypeObj obj );

	void deepDisposeTZTimeType( CFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamTZTimeTypeObj lockTZTimeType( CFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the TZTimeType-derived instances in the database.
	 *
	 *	@return	List of ICFBamTZTimeTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamTZTimeTypeObj> readAllTZTimeType();

	/**
	 *	Return a sorted map of all the TZTimeType-derived instances in the database.
	 *
	 *	@return	List of ICFBamTZTimeTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamTZTimeTypeObj> readAllTZTimeType( boolean forceRead );

	List<ICFBamTZTimeTypeObj> readCachedAllTZTimeType();

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamTZTimeTypeObj readTZTimeTypeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamTZTimeTypeObj readTZTimeTypeByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamTZTimeTypeObj readTZTimeTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamTZTimeTypeObj readTZTimeTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZTimeTypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZTimeTypeObj> readTZTimeTypeByValTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamTZTimeTypeObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZTimeTypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZTimeTypeObj> readTZTimeTypeByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZTimeTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZTimeTypeObj> readTZTimeTypeByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamTZTimeTypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZTimeTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZTimeTypeObj> readTZTimeTypeByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZTimeTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZTimeTypeObj> readTZTimeTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamTZTimeTypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZTimeTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZTimeTypeObj> readTZTimeTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZTimeTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZTimeTypeObj> readTZTimeTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamTZTimeTypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZTimeTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZTimeTypeObj> readTZTimeTypeByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZTimeTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZTimeTypeObj> readTZTimeTypeByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamTZTimeTypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZTimeTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZTimeTypeObj> readTZTimeTypeByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZTimeTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZTimeTypeObj> readTZTimeTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of CFBamTZTimeTypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZTimeTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZTimeTypeObj> readTZTimeTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZTimeTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZTimeTypeObj> readTZTimeTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of CFBamTZTimeTypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZTimeTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZTimeTypeObj> readTZTimeTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamTZTimeTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZTimeTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZTimeTypeObj> readTZTimeTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Get the map of CFBamTZTimeTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZTimeTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZTimeTypeObj> readTZTimeTypeBySchemaIdx( long TenantId,
		long SchemaDefId,
		boolean forceRead );

	ICFBamTZTimeTypeObj readCachedTZTimeTypeByIdIdx( long TenantId,
		long Id );

	ICFBamTZTimeTypeObj readCachedTZTimeTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<ICFBamTZTimeTypeObj> readCachedTZTimeTypeByValTentIdx( long TenantId );

	List<ICFBamTZTimeTypeObj> readCachedTZTimeTypeByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamTZTimeTypeObj> readCachedTZTimeTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamTZTimeTypeObj> readCachedTZTimeTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamTZTimeTypeObj> readCachedTZTimeTypeByNextIdx( Long NextTenantId,
		Long NextId );

	List<ICFBamTZTimeTypeObj> readCachedTZTimeTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<ICFBamTZTimeTypeObj> readCachedTZTimeTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<ICFBamTZTimeTypeObj> readCachedTZTimeTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	void deepDisposeTZTimeTypeByIdIdx( long TenantId,
		long Id );

	void deepDisposeTZTimeTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeTZTimeTypeByValTentIdx( long TenantId );

	void deepDisposeTZTimeTypeByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeTZTimeTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeTZTimeTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeTZTimeTypeByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeTZTimeTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeTZTimeTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeTZTimeTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Internal use only.
	 */
	ICFBamTZTimeTypeObj updateTZTimeType( ICFBamTZTimeTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTZTimeType( ICFBamTZTimeTypeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TZTimeType key attribute of the instance generating the id.
	 */
	void deleteTZTimeTypeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TZTimeType key attribute of the instance generating the id.
	 */
	void deleteTZTimeTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZTimeType key attribute of the instance generating the id.
	 */
	void deleteTZTimeTypeByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimeType key attribute of the instance generating the id.
	 */
	void deleteTZTimeTypeByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TZTimeType key attribute of the instance generating the id.
	 */
	void deleteTZTimeTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZTimeType key attribute of the instance generating the id.
	 */
	void deleteTZTimeTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZTimeType key attribute of the instance generating the id.
	 */
	void deleteTZTimeTypeByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZTimeType key attribute of the instance generating the id.
	 */
	void deleteTZTimeTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZTimeType key attribute of the instance generating the id.
	 */
	void deleteTZTimeTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The TZTimeType key attribute of the instance generating the id.
	 */
	void deleteTZTimeTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Move the CFBamTZTimeTypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamTZTimeTypeObj refreshed cache instance.
	 */
	ICFBamTZTimeTypeObj moveUpTZTimeType( ICFBamTZTimeTypeObj Obj );

	/**
	 *	Move the CFBamTZTimeTypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamTZTimeTypeObj refreshed cache instance.
	 */
	ICFBamTZTimeTypeObj moveDownTZTimeType( ICFBamTZTimeTypeObj Obj );
}
