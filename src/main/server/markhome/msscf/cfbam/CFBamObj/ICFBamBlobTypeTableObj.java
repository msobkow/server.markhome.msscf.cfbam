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

public interface ICFBamBlobTypeTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new BlobType instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamBlobTypeObj newInstance();

	/**
	 *	Instantiate a new BlobType edition of the specified BlobType instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamBlobTypeEditObj newEditInstance( ICFBamBlobTypeObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamBlobTypeObj realiseBlobType( ICFBamBlobTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamBlobTypeObj createBlobType( ICFBamBlobTypeObj Obj );

	/**
	 *	Read a BlobType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The BlobType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamBlobTypeObj readBlobType( CFBamValuePKey pkey );

	/**
	 *	Read a BlobType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The BlobType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamBlobTypeObj readBlobType( CFBamValuePKey pkey,
		boolean forceRead );

	ICFBamBlobTypeObj readCachedBlobType( CFBamValuePKey pkey );

	public void reallyDeepDisposeBlobType( ICFBamBlobTypeObj obj );

	void deepDisposeBlobType( CFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamBlobTypeObj lockBlobType( CFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the BlobType-derived instances in the database.
	 *
	 *	@return	List of ICFBamBlobTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamBlobTypeObj> readAllBlobType();

	/**
	 *	Return a sorted map of all the BlobType-derived instances in the database.
	 *
	 *	@return	List of ICFBamBlobTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamBlobTypeObj> readAllBlobType( boolean forceRead );

	List<ICFBamBlobTypeObj> readCachedAllBlobType();

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamBlobTypeObj readBlobTypeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamBlobTypeObj readBlobTypeByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The BlobType key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamBlobTypeObj readBlobTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The BlobType key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamBlobTypeObj readBlobTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBlobTypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBlobTypeObj> readBlobTypeByValTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamBlobTypeObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBlobTypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBlobTypeObj> readBlobTypeByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBlobTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBlobTypeObj> readBlobTypeByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamBlobTypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBlobTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBlobTypeObj> readBlobTypeByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBlobTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBlobTypeObj> readBlobTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamBlobTypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBlobTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBlobTypeObj> readBlobTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBlobTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBlobTypeObj> readBlobTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamBlobTypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBlobTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBlobTypeObj> readBlobTypeByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBlobTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBlobTypeObj> readBlobTypeByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamBlobTypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBlobTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBlobTypeObj> readBlobTypeByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBlobTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBlobTypeObj> readBlobTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of CFBamBlobTypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBlobTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBlobTypeObj> readBlobTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBlobTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBlobTypeObj> readBlobTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of CFBamBlobTypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBlobTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBlobTypeObj> readBlobTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamBlobTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBlobTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBlobTypeObj> readBlobTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Get the map of CFBamBlobTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBlobTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBlobTypeObj> readBlobTypeBySchemaIdx( long TenantId,
		long SchemaDefId,
		boolean forceRead );

	ICFBamBlobTypeObj readCachedBlobTypeByIdIdx( long TenantId,
		long Id );

	ICFBamBlobTypeObj readCachedBlobTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<ICFBamBlobTypeObj> readCachedBlobTypeByValTentIdx( long TenantId );

	List<ICFBamBlobTypeObj> readCachedBlobTypeByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamBlobTypeObj> readCachedBlobTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamBlobTypeObj> readCachedBlobTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamBlobTypeObj> readCachedBlobTypeByNextIdx( Long NextTenantId,
		Long NextId );

	List<ICFBamBlobTypeObj> readCachedBlobTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<ICFBamBlobTypeObj> readCachedBlobTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<ICFBamBlobTypeObj> readCachedBlobTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	void deepDisposeBlobTypeByIdIdx( long TenantId,
		long Id );

	void deepDisposeBlobTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeBlobTypeByValTentIdx( long TenantId );

	void deepDisposeBlobTypeByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeBlobTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeBlobTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeBlobTypeByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeBlobTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeBlobTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeBlobTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Internal use only.
	 */
	ICFBamBlobTypeObj updateBlobType( ICFBamBlobTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteBlobType( ICFBamBlobTypeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The BlobType key attribute of the instance generating the id.
	 */
	void deleteBlobTypeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The BlobType key attribute of the instance generating the id.
	 */
	void deleteBlobTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The BlobType key attribute of the instance generating the id.
	 */
	void deleteBlobTypeByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BlobType key attribute of the instance generating the id.
	 */
	void deleteBlobTypeByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The BlobType key attribute of the instance generating the id.
	 */
	void deleteBlobTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The BlobType key attribute of the instance generating the id.
	 */
	void deleteBlobTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The BlobType key attribute of the instance generating the id.
	 */
	void deleteBlobTypeByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The BlobType key attribute of the instance generating the id.
	 */
	void deleteBlobTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The BlobType key attribute of the instance generating the id.
	 */
	void deleteBlobTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The BlobType key attribute of the instance generating the id.
	 */
	void deleteBlobTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Move the CFBamBlobTypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamBlobTypeObj refreshed cache instance.
	 */
	ICFBamBlobTypeObj moveUpBlobType( ICFBamBlobTypeObj Obj );

	/**
	 *	Move the CFBamBlobTypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamBlobTypeObj refreshed cache instance.
	 */
	ICFBamBlobTypeObj moveDownBlobType( ICFBamBlobTypeObj Obj );
}
