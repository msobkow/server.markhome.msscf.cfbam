
// Description: Java 11 DbIO interface for SubProject.

/*
 *	server.markhome.msscf.CFBam
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfbam.CFBam;

import java.lang.reflect.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfint.CFInt.*;
import server.markhome.msscf.cfsec.CFSecObj.*;
import server.markhome.msscf.cfint.CFIntObj.*;
import server.markhome.msscf.cfbam.CFBamObj.*;

/*
 *	CFBamSubProjectTable database interface for SubProject
 */
public interface ICFBamSubProjectTable
extends ICFIntSubProjectTable
{

	/**
	 *	Create the instance in the database, and update the specified buffer
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be created.
	 */
	void createSubProject( CFSecAuthorization Authorization,
		CFIntSubProjectBuff Buff );


	/**
	 *	Update the instance in the database, and update the specified buffer
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be updated.
	 */
	void updateSubProject( CFSecAuthorization Authorization,
		CFIntSubProjectBuff Buff );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be deleted.
	 */
	void deleteSubProject( CFSecAuthorization Authorization,
		CFIntSubProjectBuff Buff );
	/**
	 *	Delete the SubProject instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SubProject key attribute of the instance generating the id.
	 *
	 *	@param	argId	The SubProject key attribute of the instance generating the id.
	 */
	void deleteSubProjectByIdIdx( CFSecAuthorization Authorization,
		long argTenantId,
		long argId );

	/**
	 *	Delete the SubProject instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteSubProjectByIdIdx( CFSecAuthorization Authorization,
		CFIntSubProjectPKey argKey );
	/**
	 *	Delete the SubProject instances identified by the key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SubProject key attribute of the instance generating the id.
	 */
	void deleteSubProjectByTenantIdx( CFSecAuthorization Authorization,
		long argTenantId );

	/**
	 *	Delete the SubProject instances identified by the key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSubProjectByTenantIdx( CFSecAuthorization Authorization,
		CFIntSubProjectByTenantIdxKey argKey );
	/**
	 *	Delete the SubProject instances identified by the key TopProjectIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SubProject key attribute of the instance generating the id.
	 *
	 *	@param	argTopProjectId	The SubProject key attribute of the instance generating the id.
	 */
	void deleteSubProjectByTopProjectIdx( CFSecAuthorization Authorization,
		long argTenantId,
		long argTopProjectId );

	/**
	 *	Delete the SubProject instances identified by the key TopProjectIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSubProjectByTopProjectIdx( CFSecAuthorization Authorization,
		CFIntSubProjectByTopProjectIdxKey argKey );
	/**
	 *	Delete the SubProject instances identified by the key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SubProject key attribute of the instance generating the id.
	 *
	 *	@param	argTopProjectId	The SubProject key attribute of the instance generating the id.
	 *
	 *	@param	argName	The SubProject key attribute of the instance generating the id.
	 */
	void deleteSubProjectByNameIdx( CFSecAuthorization Authorization,
		long argTenantId,
		long argTopProjectId,
		String argName );

	/**
	 *	Delete the SubProject instances identified by the key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSubProjectByNameIdx( CFSecAuthorization Authorization,
		CFIntSubProjectByNameIdxKey argKey );


	/**
	 *	Read the derived SubProject buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SubProject instance to be read.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	CFIntSubProjectBuff readDerived( CFSecAuthorization Authorization,
		CFIntSubProjectPKey PKey );

	/**
	 *	Lock the derived SubProject buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SubProject instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	CFIntSubProjectBuff lockDerived( CFSecAuthorization Authorization,
		CFIntSubProjectPKey PKey );

	/**
	 *	Read all SubProject instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return An array of derived buffer instances, potentially with 0 elements in the set.
	 */
	CFIntSubProjectBuff[] readAllDerived( CFSecAuthorization Authorization );

	/**
	 *	Read the derived SubProject buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SubProject key attribute of the instance generating the id.
	 *
	 *	@param	argId	The SubProject key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	CFIntSubProjectBuff readDerivedByIdIdx( CFSecAuthorization Authorization,
		long TenantId,
		long Id );

	/**
	 *	Read an array of the derived SubProject buffer instances identified by the duplicate key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SubProject key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	CFIntSubProjectBuff[] readDerivedByTenantIdx( CFSecAuthorization Authorization,
		long TenantId );

	/**
	 *	Read an array of the derived SubProject buffer instances identified by the duplicate key TopProjectIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SubProject key attribute of the instance generating the id.
	 *
	 *	@param	argTopProjectId	The SubProject key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	CFIntSubProjectBuff[] readDerivedByTopProjectIdx( CFSecAuthorization Authorization,
		long TenantId,
		long TopProjectId );

	/**
	 *	Read the derived SubProject buffer instance identified by the unique key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SubProject key attribute of the instance generating the id.
	 *
	 *	@param	argTopProjectId	The SubProject key attribute of the instance generating the id.
	 *
	 *	@param	argName	The SubProject key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	CFIntSubProjectBuff readDerivedByNameIdx( CFSecAuthorization Authorization,
		long TenantId,
		long TopProjectId,
		String Name );

	/**
	 *	Read the specific SubProject buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SubProject instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFIntSubProjectBuff readBuff( CFSecAuthorization Authorization,
		CFIntSubProjectPKey PKey );

	/**
	 *	Lock the specific SubProject buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SubProject instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFIntSubProjectBuff lockBuff( CFSecAuthorization Authorization,
		CFIntSubProjectPKey PKey );

	/**
	 *	Read all the specific SubProject buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific SubProject instances in the database accessible for the Authorization.
	 */
	CFIntSubProjectBuff[] readAllBuff( CFSecAuthorization Authorization );

	/**
	 *	Read the specific SubProject buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SubProject key attribute of the instance generating the id.
	 *
	 *	@param	argId	The SubProject key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFIntSubProjectBuff readBuffByIdIdx( CFSecAuthorization Authorization,
		long TenantId,
		long Id );

	/**
	 *	Read an array of the specific SubProject buffer instances identified by the duplicate key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SubProject key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFIntSubProjectBuff[] readBuffByTenantIdx( CFSecAuthorization Authorization,
		long TenantId );

	/**
	 *	Read an array of the specific SubProject buffer instances identified by the duplicate key TopProjectIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SubProject key attribute of the instance generating the id.
	 *
	 *	@param	argTopProjectId	The SubProject key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFIntSubProjectBuff[] readBuffByTopProjectIdx( CFSecAuthorization Authorization,
		long TenantId,
		long TopProjectId );

	/**
	 *	Read the specific SubProject buffer instance identified by the unique key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SubProject key attribute of the instance generating the id.
	 *
	 *	@param	argTopProjectId	The SubProject key attribute of the instance generating the id.
	 *
	 *	@param	argName	The SubProject key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFIntSubProjectBuff readBuffByNameIdx( CFSecAuthorization Authorization,
		long TenantId,
		long TopProjectId,
		String Name );

	/**
	 *	Release any prepared statements allocated by this instance.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	void releasePreparedStatements();
}
