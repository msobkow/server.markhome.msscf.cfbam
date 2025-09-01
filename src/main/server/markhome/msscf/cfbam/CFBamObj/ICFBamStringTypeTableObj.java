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

public interface ICFBamStringTypeTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new StringType instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamStringTypeObj newInstance();

	/**
	 *	Instantiate a new StringType edition of the specified StringType instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamStringTypeEditObj newEditInstance( ICFBamStringTypeObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamStringTypeObj realiseStringType( ICFBamStringTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamStringTypeObj createStringType( ICFBamStringTypeObj Obj );

	/**
	 *	Read a StringType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The StringType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamStringTypeObj readStringType( CFBamValuePKey pkey );

	/**
	 *	Read a StringType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The StringType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamStringTypeObj readStringType( CFBamValuePKey pkey,
		boolean forceRead );

	ICFBamStringTypeObj readCachedStringType( CFBamValuePKey pkey );

	public void reallyDeepDisposeStringType( ICFBamStringTypeObj obj );

	void deepDisposeStringType( CFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamStringTypeObj lockStringType( CFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the StringType-derived instances in the database.
	 *
	 *	@return	List of ICFBamStringTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamStringTypeObj> readAllStringType();

	/**
	 *	Return a sorted map of all the StringType-derived instances in the database.
	 *
	 *	@return	List of ICFBamStringTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamStringTypeObj> readAllStringType( boolean forceRead );

	List<ICFBamStringTypeObj> readCachedAllStringType();

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The StringType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The StringType key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamStringTypeObj readStringTypeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The StringType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The StringType key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamStringTypeObj readStringTypeByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The StringType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The StringType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The StringType key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamStringTypeObj readStringTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The StringType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The StringType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The StringType key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamStringTypeObj readStringTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The StringType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamStringTypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamStringTypeObj> readStringTypeByValTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamStringTypeObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The StringType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamStringTypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamStringTypeObj> readStringTypeByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The StringType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The StringType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamStringTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamStringTypeObj> readStringTypeByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamStringTypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The StringType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The StringType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamStringTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamStringTypeObj> readStringTypeByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The StringType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The StringType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamStringTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamStringTypeObj> readStringTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamStringTypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The StringType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The StringType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamStringTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamStringTypeObj> readStringTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The StringType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The StringType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamStringTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamStringTypeObj> readStringTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamStringTypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The StringType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The StringType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamStringTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamStringTypeObj> readStringTypeByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The StringType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The StringType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamStringTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamStringTypeObj> readStringTypeByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamStringTypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The StringType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The StringType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamStringTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamStringTypeObj> readStringTypeByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The StringType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The StringType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The StringType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamStringTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamStringTypeObj> readStringTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of CFBamStringTypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The StringType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The StringType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The StringType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamStringTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamStringTypeObj> readStringTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The StringType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The StringType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The StringType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamStringTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamStringTypeObj> readStringTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of CFBamStringTypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The StringType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The StringType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The StringType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamStringTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamStringTypeObj> readStringTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamStringTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The StringType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The StringType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamStringTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamStringTypeObj> readStringTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Get the map of CFBamStringTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The StringType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The StringType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamStringTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamStringTypeObj> readStringTypeBySchemaIdx( long TenantId,
		long SchemaDefId,
		boolean forceRead );

	ICFBamStringTypeObj readCachedStringTypeByIdIdx( long TenantId,
		long Id );

	ICFBamStringTypeObj readCachedStringTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<ICFBamStringTypeObj> readCachedStringTypeByValTentIdx( long TenantId );

	List<ICFBamStringTypeObj> readCachedStringTypeByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamStringTypeObj> readCachedStringTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamStringTypeObj> readCachedStringTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamStringTypeObj> readCachedStringTypeByNextIdx( Long NextTenantId,
		Long NextId );

	List<ICFBamStringTypeObj> readCachedStringTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<ICFBamStringTypeObj> readCachedStringTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<ICFBamStringTypeObj> readCachedStringTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	void deepDisposeStringTypeByIdIdx( long TenantId,
		long Id );

	void deepDisposeStringTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeStringTypeByValTentIdx( long TenantId );

	void deepDisposeStringTypeByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeStringTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeStringTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeStringTypeByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeStringTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeStringTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeStringTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Internal use only.
	 */
	ICFBamStringTypeObj updateStringType( ICFBamStringTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteStringType( ICFBamStringTypeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The StringType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The StringType key attribute of the instance generating the id.
	 */
	void deleteStringTypeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The StringType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The StringType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The StringType key attribute of the instance generating the id.
	 */
	void deleteStringTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The StringType key attribute of the instance generating the id.
	 */
	void deleteStringTypeByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The StringType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The StringType key attribute of the instance generating the id.
	 */
	void deleteStringTypeByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The StringType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The StringType key attribute of the instance generating the id.
	 */
	void deleteStringTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The StringType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The StringType key attribute of the instance generating the id.
	 */
	void deleteStringTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The StringType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The StringType key attribute of the instance generating the id.
	 */
	void deleteStringTypeByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The StringType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The StringType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The StringType key attribute of the instance generating the id.
	 */
	void deleteStringTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The StringType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The StringType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The StringType key attribute of the instance generating the id.
	 */
	void deleteStringTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The StringType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The StringType key attribute of the instance generating the id.
	 */
	void deleteStringTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Move the CFBamStringTypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamStringTypeObj refreshed cache instance.
	 */
	ICFBamStringTypeObj moveUpStringType( ICFBamStringTypeObj Obj );

	/**
	 *	Move the CFBamStringTypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamStringTypeObj refreshed cache instance.
	 */
	ICFBamStringTypeObj moveDownStringType( ICFBamStringTypeObj Obj );
}
