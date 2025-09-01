
// Description: Java 11 Factory interface for Index.

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
 *	CFBamIndexFactory interface for Index
 */
public interface ICFBamIndexFactory
{

	/**
	 *	Allocate a UNameIdx key over Index instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamIndexByUNameIdxKey newUNameIdxKey();

	/**
	 *	Allocate a IndexTenantIdx key over Index instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamIndexByIndexTenantIdxKey newIndexTenantIdxKey();

	/**
	 *	Allocate a IdxTableIdx key over Index instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamIndexByIdxTableIdxKey newIdxTableIdxKey();

	/**
	 *	Allocate a DefSchemaIdx key over Index instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamIndexByDefSchemaIdxKey newDefSchemaIdxKey();

	/**
	 *	Allocate a Index instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamIndexBuff newBuff();

	/**
	 *	Allocate a Index history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamIndexHBuff newHBuff();

}
