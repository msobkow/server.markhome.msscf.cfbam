
// Description: Java 11 Default Factory implementation for TZTimeDef.

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
	 *	CFBamTZTimeDefFactory implementation for TZTimeDef
	 */
public class CFBamTZTimeDefDefaultFactory
	implements ICFBamTZTimeDefFactory
{
	public CFBamTZTimeDefDefaultFactory() {
	}

	public CFBamTZTimeDefBuff newBuff() {
		CFBamTZTimeDefBuff buff =
			new CFBamTZTimeDefBuff();
		return( buff );
	}

	public CFBamTZTimeDefHBuff newHBuff() {
		CFBamTZTimeDefHBuff hbuff =
			new CFBamTZTimeDefHBuff();
		return( hbuff );
	}
}
