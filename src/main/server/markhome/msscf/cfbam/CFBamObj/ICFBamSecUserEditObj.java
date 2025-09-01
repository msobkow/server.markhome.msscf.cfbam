// Description: Java 11 Instance Edit Object interface for CFBam SecUser.

/*
 *	server.markhome.msscf.CFBam
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfbam.CFBamObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfint.CFInt.*;
import server.markhome.msscf.cfsec.CFSecObj.*;
import server.markhome.msscf.cfint.CFIntObj.*;
import server.markhome.msscf.cfbam.CFBam.*;

public interface ICFBamSecUserEditObj
	extends ICFBamSecUserObj,
		ICFSecSecUserEditObj,
		ICFIntSecUserEditObj
{
	/*
	 *	create() may return a different instance than the
	 *	one used to invoke the operation.  All future references
	 *	should be to the returned instance, not the original
	 *	invoker.  You should lose all references to the original
	 *	invoker.
	 *
	 *	@return The created instance.
	 */
	ICFSecSecUserObj create();

	/*
	 *	Update the instance.
	 */
	CFSecSecUserEditObj update();

	/**
	 *	Get the ICFSecSecDeviceObj instance referenced by the DefDev key.
	 *
	 *	@return	The ICFSecSecDeviceObj instance referenced by the DefDev key.
	 */
	ICFSecSecDeviceObj getOptionalLookupDefDev();

	/**
	 *	Set the ICFSecSecDeviceObj instance referenced by the DefDev key.
	 *
	 *	@param	value	the ICFSecSecDeviceObj instance to be referenced by the DefDev key.
	 */
	void setOptionalLookupDefDev( ICFSecSecDeviceObj value );
}
