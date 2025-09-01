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

public interface ICFBamDoubleTypeTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new DoubleType instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamDoubleTypeObj newInstance();

	/**
	 *	Instantiate a new DoubleType edition of the specified DoubleType instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamDoubleTypeEditObj newEditInstance( ICFBamDoubleTypeObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamDoubleTypeObj realiseDoubleType( ICFBamDoubleTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamDoubleTypeObj createDoubleType( ICFBamDoubleTypeObj Obj );

	/**
	 *	Read a DoubleType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DoubleType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamDoubleTypeObj readDoubleType( CFBamValuePKey pkey );

	/**
	 *	Read a DoubleType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DoubleType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamDoubleTypeObj readDoubleType( CFBamValuePKey pkey,
		boolean forceRead );

	ICFBamDoubleTypeObj readCachedDoubleType( CFBamValuePKey pkey );

	public void reallyDeepDisposeDoubleType( ICFBamDoubleTypeObj obj );

	void deepDisposeDoubleType( CFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamDoubleTypeObj lockDoubleType( CFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the DoubleType-derived instances in the database.
	 *
	 *	@return	List of ICFBamDoubleTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamDoubleTypeObj> readAllDoubleType();

	/**
	 *	Return a sorted map of all the DoubleType-derived instances in the database.
	 *
	 *	@return	List of ICFBamDoubleTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamDoubleTypeObj> readAllDoubleType( boolean forceRead );

	List<ICFBamDoubleTypeObj> readCachedAllDoubleType();

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamDoubleTypeObj readDoubleTypeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamDoubleTypeObj readDoubleTypeByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamDoubleTypeObj readDoubleTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamDoubleTypeObj readDoubleTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDoubleTypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDoubleTypeObj> readDoubleTypeByValTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamDoubleTypeObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDoubleTypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDoubleTypeObj> readDoubleTypeByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDoubleTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDoubleTypeObj> readDoubleTypeByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamDoubleTypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDoubleTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDoubleTypeObj> readDoubleTypeByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDoubleTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDoubleTypeObj> readDoubleTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamDoubleTypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDoubleTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDoubleTypeObj> readDoubleTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDoubleTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDoubleTypeObj> readDoubleTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamDoubleTypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDoubleTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDoubleTypeObj> readDoubleTypeByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDoubleTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDoubleTypeObj> readDoubleTypeByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamDoubleTypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDoubleTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDoubleTypeObj> readDoubleTypeByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDoubleTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDoubleTypeObj> readDoubleTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of CFBamDoubleTypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDoubleTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDoubleTypeObj> readDoubleTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDoubleTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDoubleTypeObj> readDoubleTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of CFBamDoubleTypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDoubleTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDoubleTypeObj> readDoubleTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamDoubleTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDoubleTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDoubleTypeObj> readDoubleTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Get the map of CFBamDoubleTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDoubleTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDoubleTypeObj> readDoubleTypeBySchemaIdx( long TenantId,
		long SchemaDefId,
		boolean forceRead );

	ICFBamDoubleTypeObj readCachedDoubleTypeByIdIdx( long TenantId,
		long Id );

	ICFBamDoubleTypeObj readCachedDoubleTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<ICFBamDoubleTypeObj> readCachedDoubleTypeByValTentIdx( long TenantId );

	List<ICFBamDoubleTypeObj> readCachedDoubleTypeByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamDoubleTypeObj> readCachedDoubleTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamDoubleTypeObj> readCachedDoubleTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamDoubleTypeObj> readCachedDoubleTypeByNextIdx( Long NextTenantId,
		Long NextId );

	List<ICFBamDoubleTypeObj> readCachedDoubleTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<ICFBamDoubleTypeObj> readCachedDoubleTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<ICFBamDoubleTypeObj> readCachedDoubleTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	void deepDisposeDoubleTypeByIdIdx( long TenantId,
		long Id );

	void deepDisposeDoubleTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeDoubleTypeByValTentIdx( long TenantId );

	void deepDisposeDoubleTypeByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeDoubleTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeDoubleTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeDoubleTypeByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeDoubleTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeDoubleTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeDoubleTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Internal use only.
	 */
	ICFBamDoubleTypeObj updateDoubleType( ICFBamDoubleTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteDoubleType( ICFBamDoubleTypeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DoubleType key attribute of the instance generating the id.
	 */
	void deleteDoubleTypeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DoubleType key attribute of the instance generating the id.
	 */
	void deleteDoubleTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DoubleType key attribute of the instance generating the id.
	 */
	void deleteDoubleTypeByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DoubleType key attribute of the instance generating the id.
	 */
	void deleteDoubleTypeByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DoubleType key attribute of the instance generating the id.
	 */
	void deleteDoubleTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DoubleType key attribute of the instance generating the id.
	 */
	void deleteDoubleTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DoubleType key attribute of the instance generating the id.
	 */
	void deleteDoubleTypeByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DoubleType key attribute of the instance generating the id.
	 */
	void deleteDoubleTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DoubleType key attribute of the instance generating the id.
	 */
	void deleteDoubleTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The DoubleType key attribute of the instance generating the id.
	 */
	void deleteDoubleTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Move the CFBamDoubleTypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamDoubleTypeObj refreshed cache instance.
	 */
	ICFBamDoubleTypeObj moveUpDoubleType( ICFBamDoubleTypeObj Obj );

	/**
	 *	Move the CFBamDoubleTypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamDoubleTypeObj refreshed cache instance.
	 */
	ICFBamDoubleTypeObj moveDownDoubleType( ICFBamDoubleTypeObj Obj );
}
