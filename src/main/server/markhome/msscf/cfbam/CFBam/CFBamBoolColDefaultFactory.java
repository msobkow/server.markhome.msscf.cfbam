
// Description: Java 11 Default Factory implementation for BoolCol.

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
	 *	CFBamBoolColFactory implementation for BoolCol
	 */
public class CFBamBoolColDefaultFactory
	implements ICFBamBoolColFactory
{
	public CFBamBoolColDefaultFactory() {
	}

	public CFBamBoolColByTableIdxKey newTableIdxKey() {
		CFBamBoolColByTableIdxKey key =
			new CFBamBoolColByTableIdxKey();
		return( key );
	}

	public CFBamBoolColBuff newBuff() {
		CFBamBoolColBuff buff =
			new CFBamBoolColBuff();
		return( buff );
	}

	public CFBamBoolColHBuff newHBuff() {
		CFBamBoolColHBuff hbuff =
			new CFBamBoolColHBuff();
		return( hbuff );
	}
}
