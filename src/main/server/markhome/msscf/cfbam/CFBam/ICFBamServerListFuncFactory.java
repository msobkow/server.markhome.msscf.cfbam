
// Description: Java 11 Factory interface for ServerListFunc.

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
 *	CFBamServerListFuncFactory interface for ServerListFunc
 */
public interface ICFBamServerListFuncFactory
{

	/**
	 *	Allocate a RetTblIdx key over ServerListFunc instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamServerListFuncByRetTblIdxKey newRetTblIdxKey();

	/**
	 *	Allocate a ServerListFunc instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamServerListFuncBuff newBuff();

	/**
	 *	Allocate a ServerListFunc history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamServerListFuncHBuff newHBuff();

}
