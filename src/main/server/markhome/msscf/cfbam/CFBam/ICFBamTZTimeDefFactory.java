
// Description: Java 11 Factory interface for TZTimeDef.

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
 *	CFBamTZTimeDefFactory interface for TZTimeDef
 */
public interface ICFBamTZTimeDefFactory
{

	/**
	 *	Allocate a TZTimeDef instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamTZTimeDefBuff newBuff();

	/**
	 *	Allocate a TZTimeDef history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamTZTimeDefHBuff newHBuff();

}
