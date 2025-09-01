
// Description: Java 11 Factory interface for ServerObjFunc.

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
 *	CFBamServerObjFuncFactory interface for ServerObjFunc
 */
public interface ICFBamServerObjFuncFactory
{

	/**
	 *	Allocate a RetTblIdx key over ServerObjFunc instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamServerObjFuncByRetTblIdxKey newRetTblIdxKey();

	/**
	 *	Allocate a ServerObjFunc instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamServerObjFuncBuff newBuff();

	/**
	 *	Allocate a ServerObjFunc history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamServerObjFuncHBuff newHBuff();

}
