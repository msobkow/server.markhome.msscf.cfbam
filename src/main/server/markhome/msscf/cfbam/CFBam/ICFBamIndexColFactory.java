
// Description: Java 11 Factory interface for IndexCol.

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

/*
 *	CFBamIndexColFactory interface for IndexCol
 */
public interface ICFBamIndexColFactory
{

	/**
	 *	Allocate a primary key for IndexCol instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamIndexColPKey newPKey();

	/**
	 *	Allocate a primary history key for IndexCol instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamIndexColHPKey newHPKey();

	/**
	 *	Allocate a UNameIdx key over IndexCol instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamIndexColByUNameIdxKey newUNameIdxKey();

	/**
	 *	Allocate a IdxColTenantIdx key over IndexCol instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamIndexColByIdxColTenantIdxKey newIdxColTenantIdxKey();

	/**
	 *	Allocate a IndexIdx key over IndexCol instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamIndexColByIndexIdxKey newIndexIdxKey();

	/**
	 *	Allocate a DefSchemaIdx key over IndexCol instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamIndexColByDefSchemaIdxKey newDefSchemaIdxKey();

	/**
	 *	Allocate a ColIdx key over IndexCol instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamIndexColByColIdxKey newColIdxKey();

	/**
	 *	Allocate a PrevIdx key over IndexCol instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamIndexColByPrevIdxKey newPrevIdxKey();

	/**
	 *	Allocate a NextIdx key over IndexCol instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamIndexColByNextIdxKey newNextIdxKey();

	/**
	 *	Allocate a IdxPrevIdx key over IndexCol instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamIndexColByIdxPrevIdxKey newIdxPrevIdxKey();

	/**
	 *	Allocate a IdxNextIdx key over IndexCol instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamIndexColByIdxNextIdxKey newIdxNextIdxKey();

	/**
	 *	Allocate a IndexCol instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamIndexColBuff newBuff();

	/**
	 *	Allocate a IndexCol history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamIndexColHBuff newHBuff();

}
