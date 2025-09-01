
// Description: Java 11 Default Factory implementation for UInt16Def.

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
	 *	CFBamUInt16DefFactory implementation for UInt16Def
	 */
public class CFBamUInt16DefDefaultFactory
	implements ICFBamUInt16DefFactory
{
	public CFBamUInt16DefDefaultFactory() {
	}

	public CFBamUInt16DefBuff newBuff() {
		CFBamUInt16DefBuff buff =
			new CFBamUInt16DefBuff();
		return( buff );
	}

	public CFBamUInt16DefHBuff newHBuff() {
		CFBamUInt16DefHBuff hbuff =
			new CFBamUInt16DefHBuff();
		return( hbuff );
	}
}
