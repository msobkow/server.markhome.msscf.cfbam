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

public interface ICFBamSchemaDefTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new SchemaDef instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamSchemaDefObj newInstance();

	/**
	 *	Instantiate a new SchemaDef edition of the specified SchemaDef instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamSchemaDefEditObj newEditInstance( ICFBamSchemaDefObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamSchemaDefObj realiseSchemaDef( ICFBamSchemaDefObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamSchemaDefObj createSchemaDef( ICFBamSchemaDefObj Obj );

	/**
	 *	Read a SchemaDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SchemaDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamSchemaDefObj readSchemaDef( CFBamScopePKey pkey );

	/**
	 *	Read a SchemaDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SchemaDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamSchemaDefObj readSchemaDef( CFBamScopePKey pkey,
		boolean forceRead );

	ICFBamSchemaDefObj readCachedSchemaDef( CFBamScopePKey pkey );

	public void reallyDeepDisposeSchemaDef( ICFBamSchemaDefObj obj );

	void deepDisposeSchemaDef( CFBamScopePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamSchemaDefObj lockSchemaDef( CFBamScopePKey pkey );

	/**
	 *	Return a sorted list of all the SchemaDef-derived instances in the database.
	 *
	 *	@return	List of ICFBamSchemaDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamSchemaDefObj> readAllSchemaDef();

	/**
	 *	Return a sorted map of all the SchemaDef-derived instances in the database.
	 *
	 *	@return	List of ICFBamSchemaDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamSchemaDefObj> readAllSchemaDef( boolean forceRead );

	List<ICFBamSchemaDefObj> readCachedAllSchemaDef();

	/**
	 *	Get the CFBamScopeObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return	CFBamScopeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamSchemaDefObj readSchemaDefByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamScopeObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return	CFBamScopeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamSchemaDefObj readSchemaDefByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the map of CFBamScopeObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamSchemaDefObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamSchemaDefObj> readSchemaDefByTenantIdx( long TenantId );

	/**
	 *	Get the map of CFBamSchemaDefObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamSchemaDefObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamSchemaDefObj> readSchemaDefByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamSchemaDefObj instances sorted by their primary keys for the duplicate CTenantIdx key.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamSchemaDefObj cached instances sorted by their primary keys for the duplicate CTenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamSchemaDefObj> readSchemaDefByCTenantIdx( long TenantId );

	/**
	 *	Get the map of CFBamSchemaDefObj instances sorted by their primary keys for the duplicate CTenantIdx key.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamSchemaDefObj cached instances sorted by their primary keys for the duplicate CTenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamSchemaDefObj> readSchemaDefByCTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamSchemaDefObj instances sorted by their primary keys for the duplicate MinorVersionIdx key.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	argMinorVersionId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamSchemaDefObj cached instances sorted by their primary keys for the duplicate MinorVersionIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamSchemaDefObj> readSchemaDefByMinorVersionIdx( long TenantId,
		long MinorVersionId );

	/**
	 *	Get the map of CFBamSchemaDefObj instances sorted by their primary keys for the duplicate MinorVersionIdx key.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	argMinorVersionId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamSchemaDefObj cached instances sorted by their primary keys for the duplicate MinorVersionIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamSchemaDefObj> readSchemaDefByMinorVersionIdx( long TenantId,
		long MinorVersionId,
		boolean forceRead );

	/**
	 *	Get the CFBamSchemaDefObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	argMinorVersionId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return	CFBamSchemaDefObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamSchemaDefObj readSchemaDefByUNameIdx(long TenantId,
		long MinorVersionId,
		String Name );

	/**
	 *	Get the CFBamSchemaDefObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	argMinorVersionId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return	CFBamSchemaDefObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamSchemaDefObj readSchemaDefByUNameIdx(long TenantId,
		long MinorVersionId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamSchemaDefObj instances sorted by their primary keys for the duplicate AuthEMailIdx key.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	argAuthorEMail	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamSchemaDefObj cached instances sorted by their primary keys for the duplicate AuthEMailIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamSchemaDefObj> readSchemaDefByAuthEMailIdx( long TenantId,
		String AuthorEMail );

	/**
	 *	Get the map of CFBamSchemaDefObj instances sorted by their primary keys for the duplicate AuthEMailIdx key.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	argAuthorEMail	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamSchemaDefObj cached instances sorted by their primary keys for the duplicate AuthEMailIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamSchemaDefObj> readSchemaDefByAuthEMailIdx( long TenantId,
		String AuthorEMail,
		boolean forceRead );

	/**
	 *	Get the map of CFBamSchemaDefObj instances sorted by their primary keys for the duplicate ProjectURLIdx key.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	argProjectURL	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamSchemaDefObj cached instances sorted by their primary keys for the duplicate ProjectURLIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamSchemaDefObj> readSchemaDefByProjectURLIdx( long TenantId,
		String ProjectURL );

	/**
	 *	Get the map of CFBamSchemaDefObj instances sorted by their primary keys for the duplicate ProjectURLIdx key.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	argProjectURL	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamSchemaDefObj cached instances sorted by their primary keys for the duplicate ProjectURLIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamSchemaDefObj> readSchemaDefByProjectURLIdx( long TenantId,
		String ProjectURL,
		boolean forceRead );

	/**
	 *	Get the CFBamSchemaDefObj instance for the unique PubURIIdx key.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	argPublishURI	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return	CFBamSchemaDefObj cached instance for the unique PubURIIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamSchemaDefObj readSchemaDefByPubURIIdx(long TenantId,
		String PublishURI );

	/**
	 *	Get the CFBamSchemaDefObj instance for the unique PubURIIdx key.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	argPublishURI	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return	CFBamSchemaDefObj refreshed instance for the unique PubURIIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamSchemaDefObj readSchemaDefByPubURIIdx(long TenantId,
		String PublishURI,
		boolean forceRead );

	ICFBamSchemaDefObj readCachedSchemaDefByIdIdx( long TenantId,
		long Id );

	List<ICFBamSchemaDefObj> readCachedSchemaDefByTenantIdx( long TenantId );

	List<ICFBamSchemaDefObj> readCachedSchemaDefByCTenantIdx( long TenantId );

	List<ICFBamSchemaDefObj> readCachedSchemaDefByMinorVersionIdx( long TenantId,
		long MinorVersionId );

	ICFBamSchemaDefObj readCachedSchemaDefByUNameIdx( long TenantId,
		long MinorVersionId,
		String Name );

	List<ICFBamSchemaDefObj> readCachedSchemaDefByAuthEMailIdx( long TenantId,
		String AuthorEMail );

	List<ICFBamSchemaDefObj> readCachedSchemaDefByProjectURLIdx( long TenantId,
		String ProjectURL );

	ICFBamSchemaDefObj readCachedSchemaDefByPubURIIdx( long TenantId,
		String PublishURI );

	void deepDisposeSchemaDefByIdIdx( long TenantId,
		long Id );

	void deepDisposeSchemaDefByTenantIdx( long TenantId );

	void deepDisposeSchemaDefByCTenantIdx( long TenantId );

	void deepDisposeSchemaDefByMinorVersionIdx( long TenantId,
		long MinorVersionId );

	void deepDisposeSchemaDefByUNameIdx( long TenantId,
		long MinorVersionId,
		String Name );

	void deepDisposeSchemaDefByAuthEMailIdx( long TenantId,
		String AuthorEMail );

	void deepDisposeSchemaDefByProjectURLIdx( long TenantId,
		String ProjectURL );

	void deepDisposeSchemaDefByPubURIIdx( long TenantId,
		String PublishURI );

	/**
	 *	Internal use only.
	 */
	ICFBamSchemaDefObj updateSchemaDef( ICFBamSchemaDefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteSchemaDef( ICFBamSchemaDefObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The SchemaDef key attribute of the instance generating the id.
	 */
	void deleteSchemaDefByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 */
	void deleteSchemaDefByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 */
	void deleteSchemaDefByCTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	argMinorVersionId	The SchemaDef key attribute of the instance generating the id.
	 */
	void deleteSchemaDefByMinorVersionIdx( long TenantId,
		long MinorVersionId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	argMinorVersionId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The SchemaDef key attribute of the instance generating the id.
	 */
	void deleteSchemaDefByUNameIdx(long TenantId,
		long MinorVersionId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	argAuthorEMail	The SchemaDef key attribute of the instance generating the id.
	 */
	void deleteSchemaDefByAuthEMailIdx( long TenantId,
		String AuthorEMail );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	argProjectURL	The SchemaDef key attribute of the instance generating the id.
	 */
	void deleteSchemaDefByProjectURLIdx( long TenantId,
		String ProjectURL );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	argPublishURI	The SchemaDef key attribute of the instance generating the id.
	 */
	void deleteSchemaDefByPubURIIdx(long TenantId,
		String PublishURI );
}
