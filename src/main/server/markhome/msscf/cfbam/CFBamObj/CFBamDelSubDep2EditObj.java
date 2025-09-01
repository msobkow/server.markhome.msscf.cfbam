// Description: Java 11 edit object instance implementation for CFBam DelSubDep2.

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

public class CFBamDelSubDep2EditObj
	extends CFBamDelDepEditObj

	implements ICFBamDelSubDep2EditObj
{
	protected ICFBamDelSubDep1Obj requiredContainerDelSubDep1;

	public CFBamDelSubDep2EditObj( ICFBamDelSubDep2Obj argOrig ) {
		super( argOrig );
		requiredContainerDelSubDep1 = null;
	}

	public String getClassCode() {
		return( CFBamDelSubDep2Obj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "DelSubDep2" );
	}

	public ICFLibAnyObj getScope() {
		ICFBamDelSubDep1Obj scope = getRequiredContainerDelSubDep1();
		return( scope );
	}

	public ICFLibAnyObj getObjScope() {
		ICFBamDelSubDep1Obj scope = getRequiredContainerDelSubDep1();
		return( scope );
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
		ICFBamDelSubDep2Obj retobj = getSchema().getDelSubDep2TableObj().realiseDelSubDep2( (ICFBamDelSubDep2Obj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsDelSubDep2().forget();
	}

	public ICFBamScopeObj create() {
		copyBuffToOrig();
		ICFBamDelSubDep2Obj retobj = ((ICFBamSchemaObj)getOrigAsDelSubDep2().getSchema()).getDelSubDep2TableObj().createDelSubDep2( getOrigAsDelSubDep2() );
		if( retobj == getOrigAsDelSubDep2() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public CFBamScopeEditObj update() {
		getSchema().getDelSubDep2TableObj().updateDelSubDep2( (ICFBamDelSubDep2Obj)this );
		return( null );
	}

	public CFBamScopeEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new CFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getDelSubDep2TableObj().deleteDelSubDep2( getOrigAsDelSubDep2() );
		return( null );
	}

	public ICFBamDelSubDep2TableObj getDelSubDep2Table() {
		return( orig.getSchema().getDelSubDep2TableObj() );
	}

	public ICFBamDelSubDep2EditObj getEditAsDelSubDep2() {
		return( (ICFBamDelSubDep2EditObj)this );
	}

	public ICFBamDelSubDep2Obj getOrigAsDelSubDep2() {
		return( (ICFBamDelSubDep2Obj)orig );
	}

	public CFBamScopeBuff getBuff() {
		if( buff == null ) {
			buff = ((ICFBamSchema)getOrigAsDelSubDep2().getSchema().getBackingStore()).getFactoryDelSubDep2().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( CFBamScopeBuff value ) {
		if( buff != value ) {
			super.setBuff( value );
			requiredContainerDelSubDep1 = null;
		}
	}

	public CFBamDelSubDep2Buff getDelSubDep2Buff() {
		return( (CFBamDelSubDep2Buff)getBuff() );
	}

	public long getRequiredDelSubDep1TenantId() {
		return( getDelSubDep2Buff().getRequiredDelSubDep1TenantId() );
	}

	public long getRequiredDelSubDep1Id() {
		return( getDelSubDep2Buff().getRequiredDelSubDep1Id() );
	}

	public String getRequiredName() {
		return( getDelSubDep2Buff().getRequiredName() );
	}

	public void setRequiredName( String value ) {
		if( getDelSubDep2Buff().getRequiredName() != value ) {
			getDelSubDep2Buff().setRequiredName( value );
		}
	}

	public ICFBamDelSubDep1Obj getRequiredContainerDelSubDep1() {
		return( getRequiredContainerDelSubDep1( false ) );
	}

	public ICFBamDelSubDep1Obj getRequiredContainerDelSubDep1( boolean forceRead ) {
		if( forceRead || ( requiredContainerDelSubDep1 == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				ICFBamDelSubDep1Obj obj = ((ICFBamSchemaObj)getOrigAsDelSubDep2().getSchema()).getDelSubDep1TableObj().readDelSubDep1ByIdIdx( getDelSubDep2Buff().getRequiredDelSubDep1TenantId(),
					getDelSubDep2Buff().getRequiredDelSubDep1Id() );
				requiredContainerDelSubDep1 = obj;
				if( obj != null ) {
					getDelSubDep2Buff().setRequiredDelSubDep1TenantId( obj.getRequiredTenantId() );
					getDelSubDep2Buff().setRequiredDelSubDep1Id( obj.getRequiredId() );
					requiredContainerDelSubDep1 = obj;
				}
			}
		}
		return( requiredContainerDelSubDep1 );
	}

	public void setRequiredContainerDelSubDep1( ICFBamDelSubDep1Obj value ) {
			if( buff == null ) {
				getDelSubDep2Buff();
			}
			if( value != null ) {
				getDelSubDep2Buff().setRequiredDelSubDep1TenantId( value.getRequiredTenantId() );
				getDelSubDep2Buff().setRequiredDelSubDep1Id( value.getRequiredId() );
			}
			requiredContainerDelSubDep1 = value;
	}

	public List<ICFBamDelSubDep3Obj> getOptionalComponentsDelDep() {
		List<ICFBamDelSubDep3Obj> retval;
		retval = ((ICFBamSchemaObj)getOrigAsDelSubDep2().getSchema()).getDelSubDep3TableObj().readDelSubDep3ByDelSubDep2Idx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<ICFBamDelSubDep3Obj> getOptionalComponentsDelDep( boolean forceRead ) {
		List<ICFBamDelSubDep3Obj> retval;
		retval = ((ICFBamSchemaObj)getOrigAsDelSubDep2().getSchema()).getDelSubDep3TableObj().readDelSubDep3ByDelSubDep2Idx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public void copyBuffToOrig() {
		CFBamDelSubDep2Buff origBuff = getOrigAsDelSubDep2().getDelSubDep2Buff();
		CFBamDelSubDep2Buff myBuff = getDelSubDep2Buff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		CFBamDelSubDep2Buff origBuff = getOrigAsDelSubDep2().getDelSubDep2Buff();
		CFBamDelSubDep2Buff myBuff = getDelSubDep2Buff();
		myBuff.set( origBuff );
	}
}
