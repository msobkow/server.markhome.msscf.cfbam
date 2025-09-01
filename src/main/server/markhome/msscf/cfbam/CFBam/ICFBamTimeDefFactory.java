
// Description: Java 11 Factory interface for TimeDef.

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
 *	CFBamTimeDefFactory interface for TimeDef
 */
public interface ICFBamTimeDefFactory
{

	/**
	 *	Allocate a TimeDef instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamTimeDefBuff newBuff();

	/**
	 *	Allocate a TimeDef history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamTimeDefHBuff newHBuff();

}
