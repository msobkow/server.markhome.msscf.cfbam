
// Description: Java 11 Factory interface for Scope.

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
 *	CFBamScopeFactory interface for Scope
 */
public interface ICFBamScopeFactory
{

	/**
	 *	Allocate a primary key for Scope instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamScopePKey newPKey();

	/**
	 *	Allocate a primary history key for Scope instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamScopeHPKey newHPKey();

	/**
	 *	Allocate a TenantIdx key over Scope instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamScopeByTenantIdxKey newTenantIdxKey();

	/**
	 *	Allocate a Scope instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamScopeBuff newBuff();

	/**
	 *	Allocate a Scope history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamScopeHBuff newHBuff();

}
