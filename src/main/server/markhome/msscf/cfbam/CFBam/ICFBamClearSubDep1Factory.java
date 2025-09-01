
// Description: Java 11 Factory interface for ClearSubDep1.

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
 *	CFBamClearSubDep1Factory interface for ClearSubDep1
 */
public interface ICFBamClearSubDep1Factory
{

	/**
	 *	Allocate a ClearTopDepIdx key over ClearSubDep1 instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamClearSubDep1ByClearTopDepIdxKey newClearTopDepIdxKey();

	/**
	 *	Allocate a UNameIdx key over ClearSubDep1 instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamClearSubDep1ByUNameIdxKey newUNameIdxKey();

	/**
	 *	Allocate a ClearSubDep1 instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamClearSubDep1Buff newBuff();

	/**
	 *	Allocate a ClearSubDep1 history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamClearSubDep1HBuff newHBuff();

}
