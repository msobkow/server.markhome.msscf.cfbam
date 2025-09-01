
// Description: Java 11 Default Factory implementation for TimeDef.

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
	 *	CFBamTimeDefFactory implementation for TimeDef
	 */
public class CFBamTimeDefDefaultFactory
	implements ICFBamTimeDefFactory
{
	public CFBamTimeDefDefaultFactory() {
	}

	public CFBamTimeDefBuff newBuff() {
		CFBamTimeDefBuff buff =
			new CFBamTimeDefBuff();
		return( buff );
	}

	public CFBamTimeDefHBuff newHBuff() {
		CFBamTimeDefHBuff hbuff =
			new CFBamTimeDefHBuff();
		return( hbuff );
	}
}
