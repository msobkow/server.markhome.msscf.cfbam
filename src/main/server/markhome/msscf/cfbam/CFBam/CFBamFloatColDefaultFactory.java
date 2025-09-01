
// Description: Java 11 Default Factory implementation for FloatCol.

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
	 *	CFBamFloatColFactory implementation for FloatCol
	 */
public class CFBamFloatColDefaultFactory
	implements ICFBamFloatColFactory
{
	public CFBamFloatColDefaultFactory() {
	}

	public CFBamFloatColByTableIdxKey newTableIdxKey() {
		CFBamFloatColByTableIdxKey key =
			new CFBamFloatColByTableIdxKey();
		return( key );
	}

	public CFBamFloatColBuff newBuff() {
		CFBamFloatColBuff buff =
			new CFBamFloatColBuff();
		return( buff );
	}

	public CFBamFloatColHBuff newHBuff() {
		CFBamFloatColHBuff hbuff =
			new CFBamFloatColHBuff();
		return( hbuff );
	}
}
