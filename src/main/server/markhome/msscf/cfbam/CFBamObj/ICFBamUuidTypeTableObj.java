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

public interface ICFBamUuidTypeTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new UuidType instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamUuidTypeObj newInstance();

	/**
	 *	Instantiate a new UuidType edition of the specified UuidType instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamUuidTypeEditObj newEditInstance( ICFBamUuidTypeObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamUuidTypeObj realiseUuidType( ICFBamUuidTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamUuidTypeObj createUuidType( ICFBamUuidTypeObj Obj );

	/**
	 *	Read a UuidType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The UuidType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamUuidTypeObj readUuidType( CFBamValuePKey pkey );

	/**
	 *	Read a UuidType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The UuidType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamUuidTypeObj readUuidType( CFBamValuePKey pkey,
		boolean forceRead );

	ICFBamUuidTypeObj readCachedUuidType( CFBamValuePKey pkey );

	public void reallyDeepDisposeUuidType( ICFBamUuidTypeObj obj );

	void deepDisposeUuidType( CFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamUuidTypeObj lockUuidType( CFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the UuidType-derived instances in the database.
	 *
	 *	@return	List of ICFBamUuidTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamUuidTypeObj> readAllUuidType();

	/**
	 *	Return a sorted map of all the UuidType-derived instances in the database.
	 *
	 *	@return	List of ICFBamUuidTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamUuidTypeObj> readAllUuidType( boolean forceRead );

	List<ICFBamUuidTypeObj> readCachedAllUuidType();

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamUuidTypeObj readUuidTypeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamUuidTypeObj readUuidTypeByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamUuidTypeObj readUuidTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamUuidTypeObj readUuidTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuidTypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuidTypeObj> readUuidTypeByValTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamUuidTypeObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuidTypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuidTypeObj> readUuidTypeByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuidTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuidTypeObj> readUuidTypeByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamUuidTypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuidTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuidTypeObj> readUuidTypeByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuidTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuidTypeObj> readUuidTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamUuidTypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuidTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuidTypeObj> readUuidTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuidTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuidTypeObj> readUuidTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamUuidTypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuidTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuidTypeObj> readUuidTypeByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuidTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuidTypeObj> readUuidTypeByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamUuidTypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuidTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuidTypeObj> readUuidTypeByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuidTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuidTypeObj> readUuidTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of CFBamUuidTypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuidTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuidTypeObj> readUuidTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuidTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuidTypeObj> readUuidTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of CFBamUuidTypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuidTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuidTypeObj> readUuidTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamUuidTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuidTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuidTypeObj> readUuidTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Get the map of CFBamUuidTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuidTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuidTypeObj> readUuidTypeBySchemaIdx( long TenantId,
		long SchemaDefId,
		boolean forceRead );

	ICFBamUuidTypeObj readCachedUuidTypeByIdIdx( long TenantId,
		long Id );

	ICFBamUuidTypeObj readCachedUuidTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<ICFBamUuidTypeObj> readCachedUuidTypeByValTentIdx( long TenantId );

	List<ICFBamUuidTypeObj> readCachedUuidTypeByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamUuidTypeObj> readCachedUuidTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamUuidTypeObj> readCachedUuidTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamUuidTypeObj> readCachedUuidTypeByNextIdx( Long NextTenantId,
		Long NextId );

	List<ICFBamUuidTypeObj> readCachedUuidTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<ICFBamUuidTypeObj> readCachedUuidTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<ICFBamUuidTypeObj> readCachedUuidTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	void deepDisposeUuidTypeByIdIdx( long TenantId,
		long Id );

	void deepDisposeUuidTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeUuidTypeByValTentIdx( long TenantId );

	void deepDisposeUuidTypeByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeUuidTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeUuidTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeUuidTypeByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeUuidTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeUuidTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeUuidTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Internal use only.
	 */
	ICFBamUuidTypeObj updateUuidType( ICFBamUuidTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteUuidType( ICFBamUuidTypeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The UuidType key attribute of the instance generating the id.
	 */
	void deleteUuidTypeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The UuidType key attribute of the instance generating the id.
	 */
	void deleteUuidTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UuidType key attribute of the instance generating the id.
	 */
	void deleteUuidTypeByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidType key attribute of the instance generating the id.
	 */
	void deleteUuidTypeByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The UuidType key attribute of the instance generating the id.
	 */
	void deleteUuidTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UuidType key attribute of the instance generating the id.
	 */
	void deleteUuidTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UuidType key attribute of the instance generating the id.
	 */
	void deleteUuidTypeByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UuidType key attribute of the instance generating the id.
	 */
	void deleteUuidTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UuidType key attribute of the instance generating the id.
	 */
	void deleteUuidTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The UuidType key attribute of the instance generating the id.
	 */
	void deleteUuidTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Move the CFBamUuidTypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamUuidTypeObj refreshed cache instance.
	 */
	ICFBamUuidTypeObj moveUpUuidType( ICFBamUuidTypeObj Obj );

	/**
	 *	Move the CFBamUuidTypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamUuidTypeObj refreshed cache instance.
	 */
	ICFBamUuidTypeObj moveDownUuidType( ICFBamUuidTypeObj Obj );
}
