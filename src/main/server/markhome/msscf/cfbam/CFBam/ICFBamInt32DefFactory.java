
// Description: Java 11 Factory interface for Int32Def.

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
 *	CFBamInt32DefFactory interface for Int32Def
 */
public interface ICFBamInt32DefFactory
{

	/**
	 *	Allocate a Int32Def instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamInt32DefBuff newBuff();

	/**
	 *	Allocate a Int32Def history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamInt32DefHBuff newHBuff();

}
