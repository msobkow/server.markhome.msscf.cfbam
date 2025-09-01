
// Description: Java 11 Default Factory implementation for ClearSubDep3.

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
	 *	CFBamClearSubDep3Factory implementation for ClearSubDep3
	 */
public class CFBamClearSubDep3DefaultFactory
	implements ICFBamClearSubDep3Factory
{
	public CFBamClearSubDep3DefaultFactory() {
	}

	public CFBamClearSubDep3ByClearSubDep2IdxKey newClearSubDep2IdxKey() {
		CFBamClearSubDep3ByClearSubDep2IdxKey key =
			new CFBamClearSubDep3ByClearSubDep2IdxKey();
		return( key );
	}

	public CFBamClearSubDep3ByUNameIdxKey newUNameIdxKey() {
		CFBamClearSubDep3ByUNameIdxKey key =
			new CFBamClearSubDep3ByUNameIdxKey();
		return( key );
	}

	public CFBamClearSubDep3Buff newBuff() {
		CFBamClearSubDep3Buff buff =
			new CFBamClearSubDep3Buff();
		return( buff );
	}

	public CFBamClearSubDep3HBuff newHBuff() {
		CFBamClearSubDep3HBuff hbuff =
			new CFBamClearSubDep3HBuff();
		return( hbuff );
	}
}
