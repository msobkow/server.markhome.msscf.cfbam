
// Description: Java 11 Default Factory implementation for TokenCol.

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
	 *	CFBamTokenColFactory implementation for TokenCol
	 */
public class CFBamTokenColDefaultFactory
	implements ICFBamTokenColFactory
{
	public CFBamTokenColDefaultFactory() {
	}

	public CFBamTokenColByTableIdxKey newTableIdxKey() {
		CFBamTokenColByTableIdxKey key =
			new CFBamTokenColByTableIdxKey();
		return( key );
	}

	public CFBamTokenColBuff newBuff() {
		CFBamTokenColBuff buff =
			new CFBamTokenColBuff();
		return( buff );
	}

	public CFBamTokenColHBuff newHBuff() {
		CFBamTokenColHBuff hbuff =
			new CFBamTokenColHBuff();
		return( hbuff );
	}
}
