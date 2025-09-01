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

public interface ICFBamUInt16ColTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new UInt16Col instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamUInt16ColObj newInstance();

	/**
	 *	Instantiate a new UInt16Col edition of the specified UInt16Col instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamUInt16ColEditObj newEditInstance( ICFBamUInt16ColObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamUInt16ColObj realiseUInt16Col( ICFBamUInt16ColObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamUInt16ColObj createUInt16Col( ICFBamUInt16ColObj Obj );

	/**
	 *	Read a UInt16Col-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The UInt16Col-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamUInt16ColObj readUInt16Col( CFBamValuePKey pkey );

	/**
	 *	Read a UInt16Col-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The UInt16Col-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamUInt16ColObj readUInt16Col( CFBamValuePKey pkey,
		boolean forceRead );

	ICFBamUInt16ColObj readCachedUInt16Col( CFBamValuePKey pkey );

	public void reallyDeepDisposeUInt16Col( ICFBamUInt16ColObj obj );

	void deepDisposeUInt16Col( CFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamUInt16ColObj lockUInt16Col( CFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the UInt16Col-derived instances in the database.
	 *
	 *	@return	List of ICFBamUInt16ColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamUInt16ColObj> readAllUInt16Col();

	/**
	 *	Return a sorted map of all the UInt16Col-derived instances in the database.
	 *
	 *	@return	List of ICFBamUInt16ColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamUInt16ColObj> readAllUInt16Col( boolean forceRead );

	List<ICFBamUInt16ColObj> readCachedAllUInt16Col();

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamUInt16ColObj readUInt16ColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamUInt16ColObj readUInt16ColByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argName	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamUInt16ColObj readUInt16ColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argName	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamUInt16ColObj readUInt16ColByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUInt16ColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUInt16ColObj> readUInt16ColByValTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamUInt16ColObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUInt16ColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUInt16ColObj> readUInt16ColByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUInt16ColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUInt16ColObj> readUInt16ColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamUInt16ColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUInt16ColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUInt16ColObj> readUInt16ColByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUInt16ColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUInt16ColObj> readUInt16ColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamUInt16ColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUInt16ColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUInt16ColObj> readUInt16ColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUInt16ColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUInt16ColObj> readUInt16ColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamUInt16ColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUInt16ColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUInt16ColObj> readUInt16ColByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUInt16ColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUInt16ColObj> readUInt16ColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamUInt16ColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUInt16ColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUInt16ColObj> readUInt16ColByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUInt16ColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUInt16ColObj> readUInt16ColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of CFBamUInt16ColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUInt16ColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUInt16ColObj> readUInt16ColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUInt16ColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUInt16ColObj> readUInt16ColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of CFBamUInt16ColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUInt16ColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUInt16ColObj> readUInt16ColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamUInt16ColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUInt16ColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUInt16ColObj> readUInt16ColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Get the map of CFBamUInt16ColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUInt16ColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUInt16ColObj> readUInt16ColByTableIdx( long TenantId,
		long TableId,
		boolean forceRead );

	ICFBamUInt16ColObj readCachedUInt16ColByIdIdx( long TenantId,
		long Id );

	ICFBamUInt16ColObj readCachedUInt16ColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<ICFBamUInt16ColObj> readCachedUInt16ColByValTentIdx( long TenantId );

	List<ICFBamUInt16ColObj> readCachedUInt16ColByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamUInt16ColObj> readCachedUInt16ColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamUInt16ColObj> readCachedUInt16ColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamUInt16ColObj> readCachedUInt16ColByNextIdx( Long NextTenantId,
		Long NextId );

	List<ICFBamUInt16ColObj> readCachedUInt16ColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<ICFBamUInt16ColObj> readCachedUInt16ColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<ICFBamUInt16ColObj> readCachedUInt16ColByTableIdx( long TenantId,
		long TableId );

	void deepDisposeUInt16ColByIdIdx( long TenantId,
		long Id );

	void deepDisposeUInt16ColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeUInt16ColByValTentIdx( long TenantId );

	void deepDisposeUInt16ColByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeUInt16ColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeUInt16ColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeUInt16ColByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeUInt16ColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeUInt16ColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeUInt16ColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Internal use only.
	 */
	ICFBamUInt16ColObj updateUInt16Col( ICFBamUInt16ColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteUInt16Col( ICFBamUInt16ColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argId	The UInt16Col key attribute of the instance generating the id.
	 */
	void deleteUInt16ColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argName	The UInt16Col key attribute of the instance generating the id.
	 */
	void deleteUInt16ColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UInt16Col key attribute of the instance generating the id.
	 */
	void deleteUInt16ColByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UInt16Col key attribute of the instance generating the id.
	 */
	void deleteUInt16ColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The UInt16Col key attribute of the instance generating the id.
	 */
	void deleteUInt16ColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UInt16Col key attribute of the instance generating the id.
	 */
	void deleteUInt16ColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UInt16Col key attribute of the instance generating the id.
	 */
	void deleteUInt16ColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UInt16Col key attribute of the instance generating the id.
	 */
	void deleteUInt16ColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UInt16Col key attribute of the instance generating the id.
	 */
	void deleteUInt16ColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The UInt16Col key attribute of the instance generating the id.
	 */
	void deleteUInt16ColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Move the CFBamUInt16ColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamUInt16ColObj refreshed cache instance.
	 */
	ICFBamUInt16ColObj moveUpUInt16Col( ICFBamUInt16ColObj Obj );

	/**
	 *	Move the CFBamUInt16ColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamUInt16ColObj refreshed cache instance.
	 */
	ICFBamUInt16ColObj moveDownUInt16Col( ICFBamUInt16ColObj Obj );
}
