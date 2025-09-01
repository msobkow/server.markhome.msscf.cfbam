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

public interface ICFBamUInt16TypeTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new UInt16Type instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamUInt16TypeObj newInstance();

	/**
	 *	Instantiate a new UInt16Type edition of the specified UInt16Type instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamUInt16TypeEditObj newEditInstance( ICFBamUInt16TypeObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamUInt16TypeObj realiseUInt16Type( ICFBamUInt16TypeObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamUInt16TypeObj createUInt16Type( ICFBamUInt16TypeObj Obj );

	/**
	 *	Read a UInt16Type-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The UInt16Type-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamUInt16TypeObj readUInt16Type( CFBamValuePKey pkey );

	/**
	 *	Read a UInt16Type-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The UInt16Type-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamUInt16TypeObj readUInt16Type( CFBamValuePKey pkey,
		boolean forceRead );

	ICFBamUInt16TypeObj readCachedUInt16Type( CFBamValuePKey pkey );

	public void reallyDeepDisposeUInt16Type( ICFBamUInt16TypeObj obj );

	void deepDisposeUInt16Type( CFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamUInt16TypeObj lockUInt16Type( CFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the UInt16Type-derived instances in the database.
	 *
	 *	@return	List of ICFBamUInt16TypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamUInt16TypeObj> readAllUInt16Type();

	/**
	 *	Return a sorted map of all the UInt16Type-derived instances in the database.
	 *
	 *	@return	List of ICFBamUInt16TypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamUInt16TypeObj> readAllUInt16Type( boolean forceRead );

	List<ICFBamUInt16TypeObj> readCachedAllUInt16Type();

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@param	argId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamUInt16TypeObj readUInt16TypeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@param	argId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamUInt16TypeObj readUInt16TypeByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@param	argName	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamUInt16TypeObj readUInt16TypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@param	argName	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamUInt16TypeObj readUInt16TypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUInt16TypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUInt16TypeObj> readUInt16TypeByValTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamUInt16TypeObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUInt16TypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUInt16TypeObj> readUInt16TypeByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUInt16TypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUInt16TypeObj> readUInt16TypeByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamUInt16TypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUInt16TypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUInt16TypeObj> readUInt16TypeByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUInt16TypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUInt16TypeObj> readUInt16TypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamUInt16TypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUInt16TypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUInt16TypeObj> readUInt16TypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUInt16TypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUInt16TypeObj> readUInt16TypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamUInt16TypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUInt16TypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUInt16TypeObj> readUInt16TypeByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUInt16TypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUInt16TypeObj> readUInt16TypeByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamUInt16TypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUInt16TypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUInt16TypeObj> readUInt16TypeByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUInt16TypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUInt16TypeObj> readUInt16TypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of CFBamUInt16TypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUInt16TypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUInt16TypeObj> readUInt16TypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUInt16TypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUInt16TypeObj> readUInt16TypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of CFBamUInt16TypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUInt16TypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUInt16TypeObj> readUInt16TypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamUInt16TypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUInt16TypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUInt16TypeObj> readUInt16TypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Get the map of CFBamUInt16TypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUInt16TypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUInt16TypeObj> readUInt16TypeBySchemaIdx( long TenantId,
		long SchemaDefId,
		boolean forceRead );

	ICFBamUInt16TypeObj readCachedUInt16TypeByIdIdx( long TenantId,
		long Id );

	ICFBamUInt16TypeObj readCachedUInt16TypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<ICFBamUInt16TypeObj> readCachedUInt16TypeByValTentIdx( long TenantId );

	List<ICFBamUInt16TypeObj> readCachedUInt16TypeByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamUInt16TypeObj> readCachedUInt16TypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamUInt16TypeObj> readCachedUInt16TypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamUInt16TypeObj> readCachedUInt16TypeByNextIdx( Long NextTenantId,
		Long NextId );

	List<ICFBamUInt16TypeObj> readCachedUInt16TypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<ICFBamUInt16TypeObj> readCachedUInt16TypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<ICFBamUInt16TypeObj> readCachedUInt16TypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	void deepDisposeUInt16TypeByIdIdx( long TenantId,
		long Id );

	void deepDisposeUInt16TypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeUInt16TypeByValTentIdx( long TenantId );

	void deepDisposeUInt16TypeByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeUInt16TypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeUInt16TypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeUInt16TypeByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeUInt16TypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeUInt16TypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeUInt16TypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Internal use only.
	 */
	ICFBamUInt16TypeObj updateUInt16Type( ICFBamUInt16TypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteUInt16Type( ICFBamUInt16TypeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@param	argId	The UInt16Type key attribute of the instance generating the id.
	 */
	void deleteUInt16TypeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@param	argName	The UInt16Type key attribute of the instance generating the id.
	 */
	void deleteUInt16TypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UInt16Type key attribute of the instance generating the id.
	 */
	void deleteUInt16TypeByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UInt16Type key attribute of the instance generating the id.
	 */
	void deleteUInt16TypeByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The UInt16Type key attribute of the instance generating the id.
	 */
	void deleteUInt16TypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UInt16Type key attribute of the instance generating the id.
	 */
	void deleteUInt16TypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UInt16Type key attribute of the instance generating the id.
	 */
	void deleteUInt16TypeByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UInt16Type key attribute of the instance generating the id.
	 */
	void deleteUInt16TypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UInt16Type key attribute of the instance generating the id.
	 */
	void deleteUInt16TypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The UInt16Type key attribute of the instance generating the id.
	 */
	void deleteUInt16TypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Move the CFBamUInt16TypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamUInt16TypeObj refreshed cache instance.
	 */
	ICFBamUInt16TypeObj moveUpUInt16Type( ICFBamUInt16TypeObj Obj );

	/**
	 *	Move the CFBamUInt16TypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamUInt16TypeObj refreshed cache instance.
	 */
	ICFBamUInt16TypeObj moveDownUInt16Type( ICFBamUInt16TypeObj Obj );
}
