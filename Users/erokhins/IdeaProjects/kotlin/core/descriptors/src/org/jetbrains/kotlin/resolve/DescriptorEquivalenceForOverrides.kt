'when {
            a is ClassDescriptor &&
            b is ClassDescriptor -> areClassesEquivalent(a, b)

            a is TypeParameterDescriptor &&
            b is TypeParameterDescriptor -> areTypeParametersEquivalent(a, b)

            a is CallableDescriptor &&
            b is CallableDescriptor -> areCallableDescriptorsEquivalent(a, b)

            a is PackageFragmentDescriptor &&
            b is PackageFragmentDescriptor -> (a).fqName == (b).fqName

            else -> a == b
        }' @ [25:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean, entry3: Boolean, entry4: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'a' @ [26:13] ==> value-parameter a: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides.areEquivalent[ValueParameterDescriptorImpl]

'b' @ [27:13] ==> value-parameter b: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides.areEquivalent[ValueParameterDescriptorImpl]

'areClassesEquivalent' @ [27:37] ==> private final fun areClassesEquivalent(a: ClassDescriptor, b: ClassDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides[SimpleFunctionDescriptorImpl]

'a' @ [27:58] ==> value-parameter a: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides.areEquivalent[ValueParameterDescriptorImpl]

'b' @ [27:61] ==> value-parameter b: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides.areEquivalent[ValueParameterDescriptorImpl]

'a' @ [29:13] ==> value-parameter a: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides.areEquivalent[ValueParameterDescriptorImpl]

'b' @ [30:13] ==> value-parameter b: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides.areEquivalent[ValueParameterDescriptorImpl]

'areTypeParametersEquivalent' @ [30:45] ==> private final fun areTypeParametersEquivalent(a: TypeParameterDescriptor, b: TypeParameterDescriptor, equivalentCallables: (DeclarationDescriptor?, DeclarationDescriptor?) -> Boolean = ...): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides[SimpleFunctionDescriptorImpl]

'a' @ [30:73] ==> value-parameter a: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides.areEquivalent[ValueParameterDescriptorImpl]

'b' @ [30:76] ==> value-parameter b: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides.areEquivalent[ValueParameterDescriptorImpl]

'a' @ [32:13] ==> value-parameter a: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides.areEquivalent[ValueParameterDescriptorImpl]

'b' @ [33:13] ==> value-parameter b: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides.areEquivalent[ValueParameterDescriptorImpl]

'areCallableDescriptorsEquivalent' @ [33:40] ==> public final fun areCallableDescriptorsEquivalent(a: CallableDescriptor, b: CallableDescriptor, ignoreReturnType: Boolean = ...): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides[SimpleFunctionDescriptorImpl]

'a' @ [33:73] ==> value-parameter a: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides.areEquivalent[ValueParameterDescriptorImpl]

'b' @ [33:76] ==> value-parameter b: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides.areEquivalent[ValueParameterDescriptorImpl]

'a' @ [35:13] ==> value-parameter a: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides.areEquivalent[ValueParameterDescriptorImpl]

'b' @ [36:13] ==> value-parameter b: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides.areEquivalent[ValueParameterDescriptorImpl]

'==' @ [36:47] ==> @Override public open fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'a' @ [36:48] ==> value-parameter a: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides.areEquivalent[ValueParameterDescriptorImpl]

'fqName' @ [36:51] ==> public abstract val fqName: FqName defined in org.jetbrains.kotlin.descriptors.PackageFragmentDescriptor[PropertyDescriptorImpl]

'b' @ [36:62] ==> value-parameter b: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides.areEquivalent[ValueParameterDescriptorImpl]

'fqName' @ [36:65] ==> public abstract val fqName: FqName defined in org.jetbrains.kotlin.descriptors.PackageFragmentDescriptor[PropertyDescriptorImpl]

'a' @ [38:21] ==> value-parameter a: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides.areEquivalent[ValueParameterDescriptorImpl]

'b' @ [38:26] ==> value-parameter b: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides.areEquivalent[ValueParameterDescriptorImpl]

'a' @ [44:16] ==> value-parameter a: ClassDescriptor defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides.areClassesEquivalent[ValueParameterDescriptorImpl]

'typeConstructor' @ [44:18] ==> public final val ClassDescriptor.typeConstructor: TypeConstructor[MyPropertyDescriptor]

'b' @ [44:37] ==> value-parameter b: ClassDescriptor defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides.areClassesEquivalent[ValueParameterDescriptorImpl]

'typeConstructor' @ [44:39] ==> public final val ClassDescriptor.typeConstructor: TypeConstructor[MyPropertyDescriptor]

'a' @ [52:13] ==> value-parameter a: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides.areTypeParametersEquivalent[ValueParameterDescriptorImpl]

'b' @ [52:18] ==> value-parameter b: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides.areTypeParametersEquivalent[ValueParameterDescriptorImpl]

'a' @ [53:13] ==> value-parameter a: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides.areTypeParametersEquivalent[ValueParameterDescriptorImpl]

'containingDeclaration' @ [53:15] ==> public final val TypeParameterDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'b' @ [53:40] ==> value-parameter b: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides.areTypeParametersEquivalent[ValueParameterDescriptorImpl]

'containingDeclaration' @ [53:42] ==> public final val TypeParameterDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'!' @ [55:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'ownersEquivalent' @ [55:14] ==> private final fun ownersEquivalent(a: DeclarationDescriptor, b: DeclarationDescriptor, equivalentCallables: (DeclarationDescriptor?, DeclarationDescriptor?) -> Boolean): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides[SimpleFunctionDescriptorImpl]

'a' @ [55:31] ==> value-parameter a: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides.areTypeParametersEquivalent[ValueParameterDescriptorImpl]

'b' @ [55:34] ==> value-parameter b: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides.areTypeParametersEquivalent[ValueParameterDescriptorImpl]

'equivalentCallables' @ [55:37] ==> value-parameter equivalentCallables: (DeclarationDescriptor?, DeclarationDescriptor?) -> Boolean = ... defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides.areTypeParametersEquivalent[ValueParameterDescriptorImpl]

'a' @ [57:16] ==> value-parameter a: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides.areTypeParametersEquivalent[ValueParameterDescriptorImpl]

'index' @ [57:18] ==> public final val TypeParameterDescriptor.index: Int[MyPropertyDescriptor]

'b' @ [57:27] ==> value-parameter b: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides.areTypeParametersEquivalent[ValueParameterDescriptorImpl]

'index' @ [57:29] ==> public final val TypeParameterDescriptor.index: Int[MyPropertyDescriptor]

'a' @ [65:13] ==> value-parameter a: CallableDescriptor defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides.areCallableDescriptorsEquivalent[ValueParameterDescriptorImpl]

'b' @ [65:18] ==> value-parameter b: CallableDescriptor defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides.areCallableDescriptorsEquivalent[ValueParameterDescriptorImpl]

'a' @ [66:13] ==> value-parameter a: CallableDescriptor defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides.areCallableDescriptorsEquivalent[ValueParameterDescriptorImpl]

'name' @ [66:15] ==> public final val CallableDescriptor.name: Name[MyPropertyDescriptor]

'b' @ [66:23] ==> value-parameter b: CallableDescriptor defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides.areCallableDescriptorsEquivalent[ValueParameterDescriptorImpl]

'name' @ [66:25] ==> public final val CallableDescriptor.name: Name[MyPropertyDescriptor]

'a' @ [67:13] ==> value-parameter a: CallableDescriptor defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides.areCallableDescriptorsEquivalent[ValueParameterDescriptorImpl]

'containingDeclaration' @ [67:15] ==> public final val CallableDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'b' @ [67:40] ==> value-parameter b: CallableDescriptor defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides.areCallableDescriptorsEquivalent[ValueParameterDescriptorImpl]

'containingDeclaration' @ [67:42] ==> public final val CallableDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'isLocal' @ [70:29] ==> public open fun isLocal(@NotNull descriptor: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'a' @ [70:37] ==> value-parameter a: CallableDescriptor defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides.areCallableDescriptorsEquivalent[ValueParameterDescriptorImpl]

'isLocal' @ [70:59] ==> public open fun isLocal(@NotNull descriptor: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'b' @ [70:67] ==> value-parameter b: CallableDescriptor defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides.areCallableDescriptorsEquivalent[ValueParameterDescriptorImpl]

'!' @ [72:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'ownersEquivalent' @ [72:14] ==> private final fun ownersEquivalent(a: DeclarationDescriptor, b: DeclarationDescriptor, equivalentCallables: (DeclarationDescriptor?, DeclarationDescriptor?) -> Boolean): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides[SimpleFunctionDescriptorImpl]

'a' @ [72:31] ==> value-parameter a: CallableDescriptor defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides.areCallableDescriptorsEquivalent[ValueParameterDescriptorImpl]

'b' @ [72:34] ==> value-parameter b: CallableDescriptor defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides.areCallableDescriptorsEquivalent[ValueParameterDescriptorImpl]

'createWithEqualityAxioms' @ [74:45] ==> @NotNull public final fun createWithEqualityAxioms(@NotNull equalityAxioms: (a: TypeConstructor, b: TypeConstructor) -> Boolean): OverridingUtil defined in org.jetbrains.kotlin.resolve.OverridingUtil[SamAdapterFunctionDescriptor]

'c1' @ [76:17] ==> value-parameter c1: TypeConstructor defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides.areCallableDescriptorsEquivalent.<anonymous>[ValueParameterDescriptorImpl]

'c2' @ [76:23] ==> value-parameter c2: TypeConstructor defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides.areCallableDescriptorsEquivalent.<anonymous>[ValueParameterDescriptorImpl]

'c1' @ [78:22] ==> value-parameter c1: TypeConstructor defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides.areCallableDescriptorsEquivalent.<anonymous>[ValueParameterDescriptorImpl]

'declarationDescriptor' @ [78:25] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'c2' @ [79:22] ==> value-parameter c2: TypeConstructor defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides.areCallableDescriptorsEquivalent.<anonymous>[ValueParameterDescriptorImpl]

'declarationDescriptor' @ [79:25] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'd1' @ [81:17] ==> val d1: ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides.areCallableDescriptorsEquivalent.<anonymous>[LocalVariableDescriptor]

'd2' @ [81:51] ==> val d2: ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides.areCallableDescriptorsEquivalent.<anonymous>[LocalVariableDescriptor]

'areTypeParametersEquivalent' @ [83:13] ==> private final fun areTypeParametersEquivalent(a: TypeParameterDescriptor, b: TypeParameterDescriptor, equivalentCallables: (DeclarationDescriptor?, DeclarationDescriptor?) -> Boolean = ...): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides[SimpleFunctionDescriptorImpl]

'd1' @ [83:41] ==> val d1: ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides.areCallableDescriptorsEquivalent.<anonymous>[LocalVariableDescriptor]

'd2' @ [83:45] ==> val d2: ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides.areCallableDescriptorsEquivalent.<anonymous>[LocalVariableDescriptor]

'x' @ [83:58] ==> value-parameter x: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides.areCallableDescriptorsEquivalent.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'a' @ [83:63] ==> value-parameter a: CallableDescriptor defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides.areCallableDescriptorsEquivalent[ValueParameterDescriptorImpl]

'y' @ [83:68] ==> value-parameter y: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides.areCallableDescriptorsEquivalent.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'b' @ [83:73] ==> value-parameter b: CallableDescriptor defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides.areCallableDescriptorsEquivalent[ValueParameterDescriptorImpl]

'overridingUtil' @ [86:16] ==> val overridingUtil: OverridingUtil defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides.areCallableDescriptorsEquivalent[LocalVariableDescriptor]

'isOverridableBy' @ [86:31] ==> @NotNull public open fun isOverridableBy(@NotNull superDescriptor: CallableDescriptor, @NotNull subDescriptor: CallableDescriptor, @Nullable subClassDescriptor: ClassDescriptor?, checkReturnType: Boolean): OverridingUtil.OverrideCompatibilityInfo defined in org.jetbrains.kotlin.resolve.OverridingUtil[JavaMethodDescriptor]

'a' @ [86:47] ==> value-parameter a: CallableDescriptor defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides.areCallableDescriptorsEquivalent[ValueParameterDescriptorImpl]

'b' @ [86:50] ==> value-parameter b: CallableDescriptor defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides.areCallableDescriptorsEquivalent[ValueParameterDescriptorImpl]

'!' @ [86:59] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'ignoreReturnType' @ [86:60] ==> value-parameter ignoreReturnType: Boolean = ... defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides.areCallableDescriptorsEquivalent[ValueParameterDescriptorImpl]

'result' @ [86:78] ==> public final val OverridingUtil.OverrideCompatibilityInfo.result: OverridingUtil.OverrideCompatibilityInfo.Result[MyPropertyDescriptor]

'OVERRIDABLE' @ [86:121] ==> enum entry OVERRIDABLE defined in org.jetbrains.kotlin.resolve.OverridingUtil.OverrideCompatibilityInfo.Result[FakeCallableDescriptorForObject]

'overridingUtil' @ [87:20] ==> val overridingUtil: OverridingUtil defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides.areCallableDescriptorsEquivalent[LocalVariableDescriptor]

'isOverridableBy' @ [87:35] ==> @NotNull public open fun isOverridableBy(@NotNull superDescriptor: CallableDescriptor, @NotNull subDescriptor: CallableDescriptor, @Nullable subClassDescriptor: ClassDescriptor?, checkReturnType: Boolean): OverridingUtil.OverrideCompatibilityInfo defined in org.jetbrains.kotlin.resolve.OverridingUtil[JavaMethodDescriptor]

'b' @ [87:51] ==> value-parameter b: CallableDescriptor defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides.areCallableDescriptorsEquivalent[ValueParameterDescriptorImpl]

'a' @ [87:54] ==> value-parameter a: CallableDescriptor defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides.areCallableDescriptorsEquivalent[ValueParameterDescriptorImpl]

'!' @ [87:63] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'ignoreReturnType' @ [87:64] ==> value-parameter ignoreReturnType: Boolean = ... defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides.areCallableDescriptorsEquivalent[ValueParameterDescriptorImpl]

'result' @ [87:82] ==> public final val OverridingUtil.OverrideCompatibilityInfo.result: OverridingUtil.OverrideCompatibilityInfo.Result[MyPropertyDescriptor]

'OVERRIDABLE' @ [87:125] ==> enum entry OVERRIDABLE defined in org.jetbrains.kotlin.resolve.OverridingUtil.OverrideCompatibilityInfo.Result[FakeCallableDescriptorForObject]

'a' @ [96:22] ==> value-parameter a: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides.ownersEquivalent[ValueParameterDescriptorImpl]

'containingDeclaration' @ [96:24] ==> public final val DeclarationDescriptor.containingDeclaration: DeclarationDescriptor?[MyPropertyDescriptor]

'b' @ [97:22] ==> value-parameter b: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides.ownersEquivalent[ValueParameterDescriptorImpl]

'containingDeclaration' @ [97:24] ==> public final val DeclarationDescriptor.containingDeclaration: DeclarationDescriptor?[MyPropertyDescriptor]

'if (aOwner is CallableMemberDescriptor || bOwner is CallableMemberDescriptor) {
            equivalentCallables(aOwner, bOwner)
        }
        else {
            areEquivalent(aOwner, bOwner)
        }' @ [101:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'aOwner' @ [101:20] ==> val aOwner: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides.ownersEquivalent[LocalVariableDescriptor]

'bOwner' @ [101:58] ==> val bOwner: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides.ownersEquivalent[LocalVariableDescriptor]

'invoke' @ [102:13] ==> public abstract operator fun invoke(p1: DeclarationDescriptor?, p2: DeclarationDescriptor?): Boolean defined in kotlin.Function2[FunctionInvokeDescriptor]

'aOwner' @ [102:33] ==> val aOwner: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides.ownersEquivalent[LocalVariableDescriptor]

'bOwner' @ [102:41] ==> val bOwner: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides.ownersEquivalent[LocalVariableDescriptor]

'areEquivalent' @ [105:13] ==> public final fun areEquivalent(a: DeclarationDescriptor?, b: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides[SimpleFunctionDescriptorImpl]

'aOwner' @ [105:27] ==> val aOwner: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides.ownersEquivalent[LocalVariableDescriptor]

'bOwner' @ [105:35] ==> val bOwner: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides.ownersEquivalent[LocalVariableDescriptor]

