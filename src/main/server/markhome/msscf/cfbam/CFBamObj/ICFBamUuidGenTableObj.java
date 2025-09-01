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

public interface ICFBamUuidGenTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new UuidGen instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamUuidGenObj newInstance();

	/**
	 *	Instantiate a new UuidGen edition of the specified UuidGen instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamUuidGenEditObj newEditInstance( ICFBamUuidGenObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamUuidGenObj realiseUuidGen( ICFBamUuidGenObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamUuidGenObj createUuidGen( ICFBamUuidGenObj Obj );

	/**
	 *	Read a UuidGen-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The UuidGen-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamUuidGenObj readUuidGen( CFBamValuePKey pkey );

	/**
	 *	Read a UuidGen-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The UuidGen-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamUuidGenObj readUuidGen( CFBamValuePKey pkey,
		boolean forceRead );

	ICFBamUuidGenObj readCachedUuidGen( CFBamValuePKey pkey );

	public void reallyDeepDisposeUuidGen( ICFBamUuidGenObj obj );

	void deepDisposeUuidGen( CFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamUuidGenObj lockUuidGen( CFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the UuidGen-derived instances in the database.
	 *
	 *	@return	List of ICFBamUuidGenObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamUuidGenObj> readAllUuidGen();

	/**
	 *	Return a sorted map of all the UuidGen-derived instances in the database.
	 *
	 *	@return	List of ICFBamUuidGenObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamUuidGenObj> readAllUuidGen( boolean forceRead );

	List<ICFBamUuidGenObj> readCachedAllUuidGen();

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamUuidGenObj readUuidGenByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamUuidGenObj readUuidGenByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argName	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamUuidGenObj readUuidGenByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argName	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamUuidGenObj readUuidGenByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuidGenObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuidGenObj> readUuidGenByValTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamUuidGenObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuidGenObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuidGenObj> readUuidGenByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuidGenObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuidGenObj> readUuidGenByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamUuidGenObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuidGenObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuidGenObj> readUuidGenByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuidGenObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuidGenObj> readUuidGenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamUuidGenObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuidGenObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuidGenObj> readUuidGenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuidGenObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuidGenObj> readUuidGenByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamUuidGenObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuidGenObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuidGenObj> readUuidGenByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuidGenObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuidGenObj> readUuidGenByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamUuidGenObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuidGenObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuidGenObj> readUuidGenByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuidGenObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuidGenObj> readUuidGenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of CFBamUuidGenObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuidGenObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuidGenObj> readUuidGenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuidGenObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuidGenObj> readUuidGenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of CFBamUuidGenObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuidGenObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuidGenObj> readUuidGenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamUuidTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuidGenObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuidGenObj> readUuidGenBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Get the map of CFBamUuidGenObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuidGenObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuidGenObj> readUuidGenBySchemaIdx( long TenantId,
		long SchemaDefId,
		boolean forceRead );

	ICFBamUuidGenObj readCachedUuidGenByIdIdx( long TenantId,
		long Id );

	ICFBamUuidGenObj readCachedUuidGenByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<ICFBamUuidGenObj> readCachedUuidGenByValTentIdx( long TenantId );

	List<ICFBamUuidGenObj> readCachedUuidGenByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamUuidGenObj> readCachedUuidGenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamUuidGenObj> readCachedUuidGenByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamUuidGenObj> readCachedUuidGenByNextIdx( Long NextTenantId,
		Long NextId );

	List<ICFBamUuidGenObj> readCachedUuidGenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<ICFBamUuidGenObj> readCachedUuidGenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<ICFBamUuidGenObj> readCachedUuidGenBySchemaIdx( long TenantId,
		long SchemaDefId );

	void deepDisposeUuidGenByIdIdx( long TenantId,
		long Id );

	void deepDisposeUuidGenByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeUuidGenByValTentIdx( long TenantId );

	void deepDisposeUuidGenByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeUuidGenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeUuidGenByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeUuidGenByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeUuidGenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeUuidGenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeUuidGenBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Internal use only.
	 */
	ICFBamUuidGenObj updateUuidGen( ICFBamUuidGenObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteUuidGen( ICFBamUuidGenObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argId	The UuidGen key attribute of the instance generating the id.
	 */
	void deleteUuidGenByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argName	The UuidGen key attribute of the instance generating the id.
	 */
	void deleteUuidGenByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UuidGen key attribute of the instance generating the id.
	 */
	void deleteUuidGenByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidGen key attribute of the instance generating the id.
	 */
	void deleteUuidGenByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The UuidGen key attribute of the instance generating the id.
	 */
	void deleteUuidGenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UuidGen key attribute of the instance generating the id.
	 */
	void deleteUuidGenByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UuidGen key attribute of the instance generating the id.
	 */
	void deleteUuidGenByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UuidGen key attribute of the instance generating the id.
	 */
	void deleteUuidGenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UuidGen key attribute of the instance generating the id.
	 */
	void deleteUuidGenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The UuidGen key attribute of the instance generating the id.
	 */
	void deleteUuidGenBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Move the CFBamUuidGenObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamUuidGenObj refreshed cache instance.
	 */
	ICFBamUuidGenObj moveUpUuidGen( ICFBamUuidGenObj Obj );

	/**
	 *	Move the CFBamUuidGenObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamUuidGenObj refreshed cache instance.
	 */
	ICFBamUuidGenObj moveDownUuidGen( ICFBamUuidGenObj Obj );
}
