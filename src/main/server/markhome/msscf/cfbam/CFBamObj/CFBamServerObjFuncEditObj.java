// Description: Java 11 edit object instance implementation for CFBam ServerObjFunc.

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

public class CFBamServerObjFuncEditObj
	extends CFBamServerMethodEditObj

	implements ICFBamServerObjFuncEditObj
{
	protected ICFBamTableObj optionalLookupRetTable;

	public CFBamServerObjFuncEditObj( ICFBamServerObjFuncObj argOrig ) {
		super( argOrig );
		optionalLookupRetTable = null;
	}

	public String getClassCode() {
		return( CFBamServerObjFuncObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "ServerObjFunc" );
	}

	public ICFLibAnyObj getScope() {
		return( super.getScope() );
	}

	public ICFLibAnyObj getObjScope() {
		return( super.getObjScope() );
	}

	public String getObjName() {
		String objName;
		objName = getRequiredName();
		return( objName );
	}

	public ICFLibAnyObj getObjQualifier( Class qualifyingClass ) {
		ICFLibAnyObj container = this;
		if( qualifyingClass != null ) {
			while( container != null ) {
				if( container instanceof ICFBamClusterObj ) {
					break;
				}
				else if( container instanceof ICFBamTenantObj ) {
					break;
				}
				else if( qualifyingClass.isInstance( container ) ) {
					break;
				}
				container = container.getObjScope();
			}
		}
		else {
			while( container != null ) {
				if( container instanceof ICFBamClusterObj ) {
					break;
				}
				else if( container instanceof ICFBamTenantObj ) {
					break;
				}
				container = container.getObjScope();
			}
		}
		return( container );
	}

	public ICFLibAnyObj getNamedObject( String objName ) {
		String nextName;
		String remainingName;
		ICFLibAnyObj subObj = null;
		ICFLibAnyObj retObj;
		int nextDot = objName.indexOf( '.' );
		if( nextDot >= 0 ) {
			nextName = objName.substring( 0, nextDot );
			remainingName = objName.substring( nextDot + 1 );
		}
		else {
			nextName = objName;
			remainingName = null;
		}
		if( remainingName == null ) {
			retObj = subObj;
		}
		else if( subObj == null ) {
			retObj = null;
		}
		else {
			retObj = subObj.getNamedObject( remainingName );
		}
		return( retObj );
	}

	public String getObjQualifiedName() {
		String qualName = getObjName();
		ICFLibAnyObj container = getObjScope();
		String containerName;
		while( container != null ) {
			if( container instanceof ICFSecClusterObj ) {
				container = null;
			}
			else if( container instanceof ICFSecTenantObj ) {
				container = null;
			}
			else if( container instanceof ICFBamSchemaDefObj ) {
				container = null;
			}
			else {
				containerName = container.getObjName();
				qualName = containerName + "." + qualName;
				container = container.getObjScope();
			}
		}
		return( qualName );
	}

	public ICFBamScopeObj realise() {
		// We realise this so that it's buffer will get copied to orig during realization
		ICFBamServerObjFuncObj retobj = getSchema().getServerObjFuncTableObj().realiseServerObjFunc( (ICFBamServerObjFuncObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsServerObjFunc().forget();
	}

	public ICFBamScopeObj create() {
		copyBuffToOrig();
		ICFBamServerObjFuncObj retobj = ((ICFBamSchemaObj)getOrigAsServerObjFunc().getSchema()).getServerObjFuncTableObj().createServerObjFunc( getOrigAsServerObjFunc() );
		if( retobj == getOrigAsServerObjFunc() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public CFBamScopeEditObj update() {
		getSchema().getServerObjFuncTableObj().updateServerObjFunc( (ICFBamServerObjFuncObj)this );
		return( null );
	}

	public CFBamScopeEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new CFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getServerObjFuncTableObj().deleteServerObjFunc( getOrigAsServerObjFunc() );
		return( null );
	}

	public ICFBamServerObjFuncTableObj getServerObjFuncTable() {
		return( orig.getSchema().getServerObjFuncTableObj() );
	}

	public ICFBamServerObjFuncEditObj getEditAsServerObjFunc() {
		return( (ICFBamServerObjFuncEditObj)this );
	}

	public ICFBamServerObjFuncObj getOrigAsServerObjFunc() {
		return( (ICFBamServerObjFuncObj)orig );
	}

	public CFBamScopeBuff getBuff() {
		if( buff == null ) {
			buff = ((ICFBamSchema)getOrigAsServerObjFunc().getSchema().getBackingStore()).getFactoryServerObjFunc().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( CFBamScopeBuff value ) {
		if( buff != value ) {
			super.setBuff( value );
			optionalLookupRetTable = null;
		}
	}

	public CFBamServerObjFuncBuff getServerObjFuncBuff() {
		return( (CFBamServerObjFuncBuff)getBuff() );
	}

	public Long getOptionalRetTenantId() {
		return( getServerObjFuncBuff().getOptionalRetTenantId() );
	}

	public Long getOptionalRetTableId() {
		return( getServerObjFuncBuff().getOptionalRetTableId() );
	}

	public ICFBamTableObj getOptionalLookupRetTable() {
		return( getOptionalLookupRetTable( false ) );
	}

	public ICFBamTableObj getOptionalLookupRetTable( boolean forceRead ) {
		if( forceRead || ( optionalLookupRetTable == null ) ) {
			boolean anyMissing = false;
			if( getServerObjFuncBuff().getOptionalRetTenantId() == null ) {
				anyMissing = true;
			}
			if( getServerObjFuncBuff().getOptionalRetTableId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				ICFBamTableObj obj = ((ICFBamSchemaObj)getOrigAsServerObjFunc().getSchema()).getTableTableObj().readTableByIdIdx( getServerObjFuncBuff().getOptionalRetTenantId(),
					getServerObjFuncBuff().getOptionalRetTableId() );
				optionalLookupRetTable = obj;
			}
		}
		return( optionalLookupRetTable );
	}

	public void setOptionalLookupRetTable( ICFBamTableObj value ) {
			if( buff == null ) {
				getServerObjFuncBuff();
			}
			if( value != null ) {
				getServerObjFuncBuff().setOptionalRetTenantId( value.getRequiredTenantId() );
				getServerObjFuncBuff().setOptionalRetTableId( value.getRequiredId() );
			}
			else {
				getServerObjFuncBuff().setOptionalRetTenantId( null );
				getServerObjFuncBuff().setOptionalRetTableId( null );
			}
			optionalLookupRetTable = value;
	}

	public void copyBuffToOrig() {
		CFBamServerObjFuncBuff origBuff = getOrigAsServerObjFunc().getServerObjFuncBuff();
		CFBamServerObjFuncBuff myBuff = getServerObjFuncBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		CFBamServerObjFuncBuff origBuff = getOrigAsServerObjFunc().getServerObjFuncBuff();
		CFBamServerObjFuncBuff myBuff = getServerObjFuncBuff();
		myBuff.set( origBuff );
	}
}
