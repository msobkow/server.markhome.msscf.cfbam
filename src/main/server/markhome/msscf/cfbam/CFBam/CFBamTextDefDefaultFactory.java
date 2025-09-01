
// Description: Java 11 Default Factory implementation for TextDef.

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
	 *	CFBamTextDefFactory implementation for TextDef
	 */
public class CFBamTextDefDefaultFactory
	implements ICFBamTextDefFactory
{
	public CFBamTextDefDefaultFactory() {
	}

	public CFBamTextDefBuff newBuff() {
		CFBamTextDefBuff buff =
			new CFBamTextDefBuff();
		return( buff );
	}

	public CFBamTextDefHBuff newHBuff() {
		CFBamTextDefHBuff hbuff =
			new CFBamTextDefHBuff();
		return( hbuff );
	}
}
