
// Description: Java 11 Factory interface for ClearSubDep3.

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
 *	CFBamClearSubDep3Factory interface for ClearSubDep3
 */
public interface ICFBamClearSubDep3Factory
{

	/**
	 *	Allocate a ClearSubDep2Idx key over ClearSubDep3 instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamClearSubDep3ByClearSubDep2IdxKey newClearSubDep2IdxKey();

	/**
	 *	Allocate a UNameIdx key over ClearSubDep3 instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamClearSubDep3ByUNameIdxKey newUNameIdxKey();

	/**
	 *	Allocate a ClearSubDep3 instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamClearSubDep3Buff newBuff();

	/**
	 *	Allocate a ClearSubDep3 history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamClearSubDep3HBuff newHBuff();

}
