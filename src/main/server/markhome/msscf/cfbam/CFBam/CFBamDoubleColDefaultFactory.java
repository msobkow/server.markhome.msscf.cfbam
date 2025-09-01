
// Description: Java 11 Default Factory implementation for DoubleCol.

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
	 *	CFBamDoubleColFactory implementation for DoubleCol
	 */
public class CFBamDoubleColDefaultFactory
	implements ICFBamDoubleColFactory
{
	public CFBamDoubleColDefaultFactory() {
	}

	public CFBamDoubleColByTableIdxKey newTableIdxKey() {
		CFBamDoubleColByTableIdxKey key =
			new CFBamDoubleColByTableIdxKey();
		return( key );
	}

	public CFBamDoubleColBuff newBuff() {
		CFBamDoubleColBuff buff =
			new CFBamDoubleColBuff();
		return( buff );
	}

	public CFBamDoubleColHBuff newHBuff() {
		CFBamDoubleColHBuff hbuff =
			new CFBamDoubleColHBuff();
		return( hbuff );
	}
}
