
// Description: Java 11 Factory interface for ClearSubDep2.

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
 *	CFBamClearSubDep2Factory interface for ClearSubDep2
 */
public interface ICFBamClearSubDep2Factory
{

	/**
	 *	Allocate a ClearSubDep1Idx key over ClearSubDep2 instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamClearSubDep2ByClearSubDep1IdxKey newClearSubDep1IdxKey();

	/**
	 *	Allocate a UNameIdx key over ClearSubDep2 instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamClearSubDep2ByUNameIdxKey newUNameIdxKey();

	/**
	 *	Allocate a ClearSubDep2 instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamClearSubDep2Buff newBuff();

	/**
	 *	Allocate a ClearSubDep2 history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamClearSubDep2HBuff newHBuff();

}
