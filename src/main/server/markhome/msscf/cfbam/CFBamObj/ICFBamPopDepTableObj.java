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

public interface ICFBamPopDepTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new PopDep instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamPopDepObj newInstance();

	/**
	 *	Instantiate a new PopDep edition of the specified PopDep instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamPopDepEditObj newEditInstance( ICFBamPopDepObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamPopDepObj realisePopDep( ICFBamPopDepObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamPopDepObj createPopDep( ICFBamPopDepObj Obj );

	/**
	 *	Read a PopDep-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The PopDep-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamPopDepObj readPopDep( CFBamScopePKey pkey );

	/**
	 *	Read a PopDep-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The PopDep-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamPopDepObj readPopDep( CFBamScopePKey pkey,
		boolean forceRead );

	ICFBamPopDepObj readCachedPopDep( CFBamScopePKey pkey );

	public void reallyDeepDisposePopDep( ICFBamPopDepObj obj );

	void deepDisposePopDep( CFBamScopePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamPopDepObj lockPopDep( CFBamScopePKey pkey );

	/**
	 *	Return a sorted list of all the PopDep-derived instances in the database.
	 *
	 *	@return	List of ICFBamPopDepObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamPopDepObj> readAllPopDep();

	/**
	 *	Return a sorted map of all the PopDep-derived instances in the database.
	 *
	 *	@return	List of ICFBamPopDepObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamPopDepObj> readAllPopDep( boolean forceRead );

	List<ICFBamPopDepObj> readCachedAllPopDep();

	/**
	 *	Get the CFBamScopeObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The PopDep key attribute of the instance generating the id.
	 *
	 *	@param	argId	The PopDep key attribute of the instance generating the id.
	 *
	 *	@return	CFBamScopeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamPopDepObj readPopDepByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamScopeObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The PopDep key attribute of the instance generating the id.
	 *
	 *	@param	argId	The PopDep key attribute of the instance generating the id.
	 *
	 *	@return	CFBamScopeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamPopDepObj readPopDepByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the map of CFBamScopeObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The PopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPopDepObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPopDepObj> readPopDepByTenantIdx( long TenantId );

	/**
	 *	Get the map of CFBamPopDepObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The PopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPopDepObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPopDepObj> readPopDepByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamPopDepObj instances sorted by their primary keys for the duplicate RelationIdx key.
	 *
	 *	@param	argRelationTenantId	The PopDep key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The PopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPopDepObj cached instances sorted by their primary keys for the duplicate RelationIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPopDepObj> readPopDepByRelationIdx( long RelationTenantId,
		long RelationId );

	/**
	 *	Get the map of CFBamPopDepObj instances sorted by their primary keys for the duplicate RelationIdx key.
	 *
	 *	@param	argRelationTenantId	The PopDep key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The PopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPopDepObj cached instances sorted by their primary keys for the duplicate RelationIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPopDepObj> readPopDepByRelationIdx( long RelationTenantId,
		long RelationId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamPopDepObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The PopDep key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The PopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPopDepObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPopDepObj> readPopDepByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamPopDepObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The PopDep key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The PopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPopDepObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPopDepObj> readPopDepByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	ICFBamPopDepObj readCachedPopDepByIdIdx( long TenantId,
		long Id );

	List<ICFBamPopDepObj> readCachedPopDepByTenantIdx( long TenantId );

	List<ICFBamPopDepObj> readCachedPopDepByRelationIdx( long RelationTenantId,
		long RelationId );

	List<ICFBamPopDepObj> readCachedPopDepByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposePopDepByIdIdx( long TenantId,
		long Id );

	void deepDisposePopDepByTenantIdx( long TenantId );

	void deepDisposePopDepByRelationIdx( long RelationTenantId,
		long RelationId );

	void deepDisposePopDepByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 */
	ICFBamPopDepObj updatePopDep( ICFBamPopDepObj Obj );

	/**
	 *	Internal use only.
	 */
	void deletePopDep( ICFBamPopDepObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The PopDep key attribute of the instance generating the id.
	 *
	 *	@param	argId	The PopDep key attribute of the instance generating the id.
	 */
	void deletePopDepByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The PopDep key attribute of the instance generating the id.
	 */
	void deletePopDepByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argRelationTenantId	The PopDep key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The PopDep key attribute of the instance generating the id.
	 */
	void deletePopDepByRelationIdx( long RelationTenantId,
		long RelationId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The PopDep key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The PopDep key attribute of the instance generating the id.
	 */
	void deletePopDepByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );
}
