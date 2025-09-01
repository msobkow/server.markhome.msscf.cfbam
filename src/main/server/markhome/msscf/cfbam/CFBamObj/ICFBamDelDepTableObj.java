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

public interface ICFBamDelDepTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new DelDep instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamDelDepObj newInstance();

	/**
	 *	Instantiate a new DelDep edition of the specified DelDep instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamDelDepEditObj newEditInstance( ICFBamDelDepObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamDelDepObj realiseDelDep( ICFBamDelDepObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamDelDepObj createDelDep( ICFBamDelDepObj Obj );

	/**
	 *	Read a DelDep-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DelDep-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamDelDepObj readDelDep( CFBamScopePKey pkey );

	/**
	 *	Read a DelDep-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DelDep-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamDelDepObj readDelDep( CFBamScopePKey pkey,
		boolean forceRead );

	ICFBamDelDepObj readCachedDelDep( CFBamScopePKey pkey );

	public void reallyDeepDisposeDelDep( ICFBamDelDepObj obj );

	void deepDisposeDelDep( CFBamScopePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamDelDepObj lockDelDep( CFBamScopePKey pkey );

	/**
	 *	Return a sorted list of all the DelDep-derived instances in the database.
	 *
	 *	@return	List of ICFBamDelDepObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamDelDepObj> readAllDelDep();

	/**
	 *	Return a sorted map of all the DelDep-derived instances in the database.
	 *
	 *	@return	List of ICFBamDelDepObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamDelDepObj> readAllDelDep( boolean forceRead );

	List<ICFBamDelDepObj> readCachedAllDelDep();

	/**
	 *	Get the CFBamScopeObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The DelDep key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DelDep key attribute of the instance generating the id.
	 *
	 *	@return	CFBamScopeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamDelDepObj readDelDepByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamScopeObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The DelDep key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DelDep key attribute of the instance generating the id.
	 *
	 *	@return	CFBamScopeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamDelDepObj readDelDepByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the map of CFBamScopeObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The DelDep key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDelDepObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDelDepObj> readDelDepByTenantIdx( long TenantId );

	/**
	 *	Get the map of CFBamDelDepObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The DelDep key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDelDepObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDelDepObj> readDelDepByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamDelDepObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The DelDep key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DelDep key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDelDepObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDelDepObj> readDelDepByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamDelDepObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The DelDep key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DelDep key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDelDepObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDelDepObj> readDelDepByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamDelDepObj instances sorted by their primary keys for the duplicate DelDepIdx key.
	 *
	 *	@param	argRelationTenantId	The DelDep key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The DelDep key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDelDepObj cached instances sorted by their primary keys for the duplicate DelDepIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDelDepObj> readDelDepByDelDepIdx( long RelationTenantId,
		long RelationId );

	/**
	 *	Get the map of CFBamDelDepObj instances sorted by their primary keys for the duplicate DelDepIdx key.
	 *
	 *	@param	argRelationTenantId	The DelDep key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The DelDep key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDelDepObj cached instances sorted by their primary keys for the duplicate DelDepIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDelDepObj> readDelDepByDelDepIdx( long RelationTenantId,
		long RelationId,
		boolean forceRead );

	ICFBamDelDepObj readCachedDelDepByIdIdx( long TenantId,
		long Id );

	List<ICFBamDelDepObj> readCachedDelDepByTenantIdx( long TenantId );

	List<ICFBamDelDepObj> readCachedDelDepByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamDelDepObj> readCachedDelDepByDelDepIdx( long RelationTenantId,
		long RelationId );

	void deepDisposeDelDepByIdIdx( long TenantId,
		long Id );

	void deepDisposeDelDepByTenantIdx( long TenantId );

	void deepDisposeDelDepByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeDelDepByDelDepIdx( long RelationTenantId,
		long RelationId );

	/**
	 *	Internal use only.
	 */
	ICFBamDelDepObj updateDelDep( ICFBamDelDepObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteDelDep( ICFBamDelDepObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DelDep key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DelDep key attribute of the instance generating the id.
	 */
	void deleteDelDepByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DelDep key attribute of the instance generating the id.
	 */
	void deleteDelDepByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The DelDep key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DelDep key attribute of the instance generating the id.
	 */
	void deleteDelDepByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argRelationTenantId	The DelDep key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The DelDep key attribute of the instance generating the id.
	 */
	void deleteDelDepByDelDepIdx( long RelationTenantId,
		long RelationId );
}
