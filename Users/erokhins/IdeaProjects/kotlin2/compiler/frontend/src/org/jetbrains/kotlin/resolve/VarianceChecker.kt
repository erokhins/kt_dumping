'VarianceCheckerCore' @ [42:24] ==> public constructor VarianceCheckerCore(context: BindingContext, diagnosticSink: DiagnosticSink, manualVariance: ManualVariance? = ...) defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore[ClassConstructorDescriptorImpl]

'trace' @ [42:44] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.VarianceChecker.<init>[ValueParameterDescriptorImpl]

'bindingContext' @ [42:50] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'trace' @ [42:66] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.VarianceChecker.<init>[ValueParameterDescriptorImpl]

'core' @ [45:9] ==> private final val core: VarianceCheckerCore defined in org.jetbrains.kotlin.resolve.VarianceChecker[PropertyDescriptorImpl]

'check' @ [45:14] ==> public final fun check(c: TopDownAnalysisContext): Unit defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore[SimpleFunctionDescriptorImpl]

'c' @ [45:20] ==> value-parameter c: TopDownAnalysisContext defined in org.jetbrains.kotlin.resolve.VarianceChecker.check[ValueParameterDescriptorImpl]

'checkClasses' @ [62:9] ==> private final fun checkClasses(c: TopDownAnalysisContext): Unit defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore[SimpleFunctionDescriptorImpl]

'c' @ [62:22] ==> value-parameter c: TopDownAnalysisContext defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.check[ValueParameterDescriptorImpl]

'checkMembers' @ [63:9] ==> private final fun checkMembers(c: TopDownAnalysisContext): Unit defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore[SimpleFunctionDescriptorImpl]

'c' @ [63:22] ==> value-parameter c: TopDownAnalysisContext defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.check[ValueParameterDescriptorImpl]

'c' @ [67:31] ==> value-parameter c: TopDownAnalysisContext defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.checkClasses[ValueParameterDescriptorImpl]

'declaredClasses' @ [67:33] ==> public final val TopDownAnalysisContext.declaredClasses: (MutableMap<(KtClassOrObject..KtClassOrObject?), (ClassDescriptorWithResolutionScopes..ClassDescriptorWithResolutionScopes?)>..MutableMap<(KtClassOrObject..KtClassOrObject?), (ClassDescriptorWithResolutionScopes..ClassDescriptorWithResolutionScopes?)>?)[MyPropertyDescriptor]

'keys' @ [67:51] ==> public abstract val keys: MutableSet<(KtClassOrObject..KtClassOrObject?)> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'classOrObject' @ [68:17] ==> val classOrObject: (KtClassOrObject..KtClassOrObject?) defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.checkClasses[LocalVariableDescriptor]

'checkClassHeader' @ [69:17] ==> public final fun checkClassHeader(klass: KtClass): Boolean defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore[SimpleFunctionDescriptorImpl]

'classOrObject' @ [69:34] ==> val classOrObject: (KtClassOrObject..KtClassOrObject?) defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.checkClasses[LocalVariableDescriptor]

'klass' @ [76:27] ==> value-parameter klass: KtClass defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.checkClassHeader[ValueParameterDescriptorImpl]

'superTypeListEntries' @ [76:33] ==> public final val KtClass.superTypeListEntries: List<KtSuperTypeListEntry>[MyPropertyDescriptor]

'noError' @ [77:13] ==> var noError: Boolean defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.checkClassHeader[LocalVariableDescriptor]

'noError' @ [77:23] ==> var noError: Boolean defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.checkClassHeader[LocalVariableDescriptor]

'specifier' @ [77:35] ==> val specifier: KtSuperTypeListEntry defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.checkClassHeader[LocalVariableDescriptor]

'typeReference' @ [77:45] ==> public final val KtSuperTypeListEntry.typeReference: KtTypeReference?[MyPropertyDescriptor]

'checkTypePosition' @ [77:60] ==> private final fun KtTypeReference.checkTypePosition(trace: BindingContext, position: Variance): Boolean? defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore[SimpleFunctionDescriptorImpl]

'context' @ [77:78] ==> public final val context: BindingContext defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore[PropertyDescriptorImpl]

'OUT_VARIANCE' @ [77:87] ==> enum entry OUT_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'noError' @ [79:16] ==> var noError: Boolean defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.checkClassHeader[LocalVariableDescriptor]

'klass' @ [79:28] ==> value-parameter klass: KtClass defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.checkClassHeader[ValueParameterDescriptorImpl]

'checkTypeParameters' @ [79:34] ==> private final fun KtTypeParameterListOwner.checkTypeParameters(trace: BindingContext, typePosition: Variance): Boolean defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore[SimpleFunctionDescriptorImpl]

'context' @ [79:54] ==> public final val context: BindingContext defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore[PropertyDescriptorImpl]

'OUT_VARIANCE' @ [79:63] ==> enum entry OUT_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'component1' @ [83:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(KtCallableDeclaration..KtCallableDeclaration?), (CallableMemberDescriptor..CallableMemberDescriptor?)>.component1(): (KtCallableDeclaration..KtCallableDeclaration?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.psi.KtCallableDeclaration..org.jetbrains.kotlin.psi.KtCallableDeclaration?)
    <V> -> (org.jetbrains.kotlin.descriptors.CallableMemberDescriptor..org.jetbrains.kotlin.descriptors.CallableMemberDescriptor?)

'component2' @ [83:28] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(KtCallableDeclaration..KtCallableDeclaration?), (CallableMemberDescriptor..CallableMemberDescriptor?)>.component2(): (CallableMemberDescriptor..CallableMemberDescriptor?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.psi.KtCallableDeclaration..org.jetbrains.kotlin.psi.KtCallableDeclaration?)
    <V> -> (org.jetbrains.kotlin.descriptors.CallableMemberDescriptor..org.jetbrains.kotlin.descriptors.CallableMemberDescriptor?)

'c' @ [83:43] ==> value-parameter c: TopDownAnalysisContext defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.checkMembers[ValueParameterDescriptorImpl]

'members' @ [83:45] ==> public final val TopDownAnalysisContext.members: (MutableMap<(KtCallableDeclaration..KtCallableDeclaration?), (CallableMemberDescriptor..CallableMemberDescriptor?)>..Map<(KtCallableDeclaration..KtCallableDeclaration?), (CallableMemberDescriptor..CallableMemberDescriptor?)>)[MyPropertyDescriptor]

'checkMember' @ [84:13] ==> public final fun checkMember(member: KtCallableDeclaration, descriptor: CallableMemberDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore[SimpleFunctionDescriptorImpl]

'declaration' @ [84:25] ==> val declaration: (KtCallableDeclaration..KtCallableDeclaration?) defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.checkMembers[LocalVariableDescriptor]

'descriptor' @ [84:38] ==> val descriptor: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.checkMembers[LocalVariableDescriptor]

'isPrivate' @ [89:26] ==> public open fun isPrivate(@NotNull p0: Visibility): Boolean defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaMethodDescriptor]

'descriptor' @ [89:36] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.checkMember[ValueParameterDescriptorImpl]

'visibility' @ [89:47] ==> public final val CallableMemberDescriptor.visibility: Visibility[MyPropertyDescriptor]

'checkCallableDeclaration' @ [89:62] ==> private final fun checkCallableDeclaration(trace: BindingContext, declaration: KtCallableDeclaration, descriptor: CallableDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore[SimpleFunctionDescriptorImpl]

'context' @ [89:87] ==> public final val context: BindingContext defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore[PropertyDescriptorImpl]

'member' @ [89:96] ==> value-parameter member: KtCallableDeclaration defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.checkMember[ValueParameterDescriptorImpl]

'descriptor' @ [89:104] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.checkMember[ValueParameterDescriptorImpl]

'if (manualVariance != null && this.original == manualVariance.descriptor) manualVariance.variance else variance' @ [92:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Variance, elseBranch: Variance): Variance[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Variance

'manualVariance' @ [92:17] ==> private final val manualVariance: ManualVariance? defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore[PropertyDescriptorImpl]

'this' @ [92:43] ==> <this> defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.varianceWithManual[ReceiverParameterDescriptorImpl]

'original' @ [92:48] ==> public final val TypeParameterDescriptor.original: TypeParameterDescriptor[MyPropertyDescriptor]

'manualVariance' @ [92:60] ==> private final val manualVariance: ManualVariance? defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore[PropertyDescriptorImpl]

'descriptor' @ [92:75] ==> public final val descriptor: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.ManualVariance[PropertyDescriptorImpl]

'manualVariance' @ [92:87] ==> private final val manualVariance: ManualVariance? defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore[PropertyDescriptorImpl]

'variance' @ [92:102] ==> public final val variance: Variance defined in org.jetbrains.kotlin.resolve.ManualVariance[PropertyDescriptorImpl]

'variance' @ [92:116] ==> public final val TypeParameterDescriptor.variance: Variance[MyPropertyDescriptor]

'isIrrelevant' @ [95:13] ==> private final fun isIrrelevant(descriptor: CallableDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore[SimpleFunctionDescriptorImpl]

'descriptor' @ [95:26] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.recordPrivateToThisIfNeeded[ValueParameterDescriptorImpl]

'descriptor' @ [95:41] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.recordPrivateToThisIfNeeded[ValueParameterDescriptorImpl]

'visibility' @ [95:52] ==> public final val CallableMemberDescriptor.visibility: Visibility[MyPropertyDescriptor]

'PRIVATE' @ [95:79] ==> @NotNull public final val PRIVATE: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'descriptor' @ [97:26] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.recordPrivateToThisIfNeeded[ValueParameterDescriptorImpl]

'source' @ [97:37] ==> public final val CallableMemberDescriptor.source: SourceElement[MyPropertyDescriptor]

'getPsi' @ [97:44] ==> public fun SourceElement.getPsi(): PsiElement? defined in org.jetbrains.kotlin.resolve.source in file KotlinSourceElement.kt[SimpleFunctionDescriptorImpl]

'!' @ [99:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'checkCallableDeclaration' @ [99:14] ==> private final fun checkCallableDeclaration(trace: BindingContext, declaration: KtCallableDeclaration, descriptor: CallableDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore[SimpleFunctionDescriptorImpl]

'context' @ [99:39] ==> public final val context: BindingContext defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore[PropertyDescriptorImpl]

'psiElement' @ [99:48] ==> val psiElement: KtCallableDeclaration defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.recordPrivateToThisIfNeeded[LocalVariableDescriptor]

'descriptor' @ [99:60] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.recordPrivateToThisIfNeeded[ValueParameterDescriptorImpl]

'recordPrivateToThis' @ [100:13] ==> private final fun recordPrivateToThis(descriptor: CallableMemberDescriptor): Unit defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.Companion[SimpleFunctionDescriptorImpl]

'descriptor' @ [100:33] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.recordPrivateToThisIfNeeded[ValueParameterDescriptorImpl]

'isIrrelevant' @ [109:13] ==> private final fun isIrrelevant(descriptor: CallableDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore[SimpleFunctionDescriptorImpl]

'descriptor' @ [109:26] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.checkCallableDeclaration[ValueParameterDescriptorImpl]

'noError' @ [112:9] ==> var noError: Boolean defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.checkCallableDeclaration[LocalVariableDescriptor]

'noError' @ [112:19] ==> var noError: Boolean defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.checkCallableDeclaration[LocalVariableDescriptor]

'declaration' @ [112:31] ==> value-parameter declaration: KtCallableDeclaration defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.checkCallableDeclaration[ValueParameterDescriptorImpl]

'checkTypeParameters' @ [112:43] ==> private final fun KtTypeParameterListOwner.checkTypeParameters(trace: BindingContext, typePosition: Variance): Boolean defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore[SimpleFunctionDescriptorImpl]

'trace' @ [112:63] ==> value-parameter trace: BindingContext defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.checkCallableDeclaration[ValueParameterDescriptorImpl]

'IN_VARIANCE' @ [112:70] ==> enum entry IN_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'noError' @ [114:9] ==> var noError: Boolean defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.checkCallableDeclaration[LocalVariableDescriptor]

'noError' @ [114:19] ==> var noError: Boolean defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.checkCallableDeclaration[LocalVariableDescriptor]

'declaration' @ [114:31] ==> value-parameter declaration: KtCallableDeclaration defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.checkCallableDeclaration[ValueParameterDescriptorImpl]

'receiverTypeReference' @ [114:43] ==> public final val KtCallableDeclaration.receiverTypeReference: KtTypeReference?[MyPropertyDescriptor]

'checkTypePosition' @ [114:66] ==> private final fun KtTypeReference.checkTypePosition(trace: BindingContext, position: Variance): Boolean? defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore[SimpleFunctionDescriptorImpl]

'trace' @ [114:84] ==> value-parameter trace: BindingContext defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.checkCallableDeclaration[ValueParameterDescriptorImpl]

'IN_VARIANCE' @ [114:91] ==> enum entry IN_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'declaration' @ [116:27] ==> value-parameter declaration: KtCallableDeclaration defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.checkCallableDeclaration[ValueParameterDescriptorImpl]

'valueParameters' @ [116:39] ==> public final val KtCallableDeclaration.valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'noError' @ [117:13] ==> var noError: Boolean defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.checkCallableDeclaration[LocalVariableDescriptor]

'noError' @ [117:23] ==> var noError: Boolean defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.checkCallableDeclaration[LocalVariableDescriptor]

'parameter' @ [117:35] ==> val parameter: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.checkCallableDeclaration[LocalVariableDescriptor]

'typeReference' @ [117:45] ==> public final var KtParameter.typeReference: KtTypeReference?[MyPropertyDescriptor]

'checkTypePosition' @ [117:60] ==> private final fun KtTypeReference.checkTypePosition(trace: BindingContext, position: Variance): Boolean? defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore[SimpleFunctionDescriptorImpl]

'trace' @ [117:78] ==> value-parameter trace: BindingContext defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.checkCallableDeclaration[ValueParameterDescriptorImpl]

'IN_VARIANCE' @ [117:85] ==> enum entry IN_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'if (descriptor is VariableDescriptor && descriptor.isVar) INVARIANT else OUT_VARIANCE' @ [120:34] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Variance, elseBranch: Variance): Variance[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Variance

'descriptor' @ [120:38] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.checkCallableDeclaration[ValueParameterDescriptorImpl]

'descriptor' @ [120:74] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.checkCallableDeclaration[ValueParameterDescriptorImpl]

'isVar' @ [120:85] ==> public final val VariableDescriptor.isVar: Boolean[MyPropertyDescriptor]

'INVARIANT' @ [120:92] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'OUT_VARIANCE' @ [120:107] ==> enum entry OUT_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'noError' @ [121:9] ==> var noError: Boolean defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.checkCallableDeclaration[LocalVariableDescriptor]

'noError' @ [121:19] ==> var noError: Boolean defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.checkCallableDeclaration[LocalVariableDescriptor]

'declaration' @ [121:31] ==> value-parameter declaration: KtCallableDeclaration defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.checkCallableDeclaration[ValueParameterDescriptorImpl]

'createTypeBindingForReturnType' @ [121:43] ==> public fun KtCallableDeclaration.createTypeBindingForReturnType(trace: BindingContext): TypeBinding<PsiElement>? defined in org.jetbrains.kotlin.resolve.typeBinding in file TypeBinding.kt[SimpleFunctionDescriptorImpl]

'trace' @ [121:74] ==> value-parameter trace: BindingContext defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.checkCallableDeclaration[ValueParameterDescriptorImpl]

'checkTypePosition' @ [121:82] ==> private final fun TypeBinding<PsiElement>.checkTypePosition(position: Variance): Boolean defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore[SimpleFunctionDescriptorImpl]

'returnTypePosition' @ [121:100] ==> val returnTypePosition: Variance defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.checkCallableDeclaration[LocalVariableDescriptor]

'noError' @ [123:16] ==> var noError: Boolean defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.checkCallableDeclaration[LocalVariableDescriptor]

'typeParameters' @ [131:31] ==> public final val KtTypeParameterListOwner.typeParameters: (MutableList<(KtTypeParameter..KtTypeParameter?)>..List<(KtTypeParameter..KtTypeParameter?)>)[MyPropertyDescriptor]

'noError' @ [132:13] ==> var noError: Boolean defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.checkTypeParameters[LocalVariableDescriptor]

'noError' @ [132:23] ==> var noError: Boolean defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.checkTypeParameters[LocalVariableDescriptor]

'typeParameter' @ [132:35] ==> val typeParameter: (KtTypeParameter..KtTypeParameter?) defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.checkTypeParameters[LocalVariableDescriptor]

'extendsBound' @ [132:49] ==> public final var KtTypeParameter.extendsBound: KtTypeReference?[MyPropertyDescriptor]

'checkTypePosition' @ [132:63] ==> private final fun KtTypeReference.checkTypePosition(trace: BindingContext, position: Variance): Boolean? defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore[SimpleFunctionDescriptorImpl]

'trace' @ [132:81] ==> value-parameter trace: BindingContext defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.checkTypeParameters[ValueParameterDescriptorImpl]

'typePosition' @ [132:88] ==> value-parameter typePosition: Variance defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.checkTypeParameters[ValueParameterDescriptorImpl]

'typeConstraints' @ [134:32] ==> public final val KtTypeParameterListOwner.typeConstraints: (MutableList<(KtTypeConstraint..KtTypeConstraint?)>..List<(KtTypeConstraint..KtTypeConstraint?)>)[MyPropertyDescriptor]

'noError' @ [135:13] ==> var noError: Boolean defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.checkTypeParameters[LocalVariableDescriptor]

'noError' @ [135:23] ==> var noError: Boolean defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.checkTypeParameters[LocalVariableDescriptor]

'typeConstraint' @ [135:35] ==> val typeConstraint: (KtTypeConstraint..KtTypeConstraint?) defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.checkTypeParameters[LocalVariableDescriptor]

'boundTypeReference' @ [135:50] ==> public final val KtTypeConstraint.boundTypeReference: KtTypeReference?[MyPropertyDescriptor]

'checkTypePosition' @ [135:70] ==> private final fun KtTypeReference.checkTypePosition(trace: BindingContext, position: Variance): Boolean? defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore[SimpleFunctionDescriptorImpl]

'trace' @ [135:88] ==> value-parameter trace: BindingContext defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.checkTypeParameters[ValueParameterDescriptorImpl]

'typePosition' @ [135:95] ==> value-parameter typePosition: Variance defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.checkTypeParameters[ValueParameterDescriptorImpl]

'noError' @ [137:16] ==> var noError: Boolean defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.checkTypeParameters[LocalVariableDescriptor]

'createTypeBinding' @ [141:15] ==> public fun KtTypeReference.createTypeBinding(trace: BindingContext): TypeBinding<KtTypeElement>? defined in org.jetbrains.kotlin.resolve.typeBinding in file TypeBinding.kt[SimpleFunctionDescriptorImpl]

'trace' @ [141:33] ==> value-parameter trace: BindingContext defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.checkTypePosition[ValueParameterDescriptorImpl]

'checkTypePosition' @ [141:41] ==> private final fun TypeBinding<PsiElement>.checkTypePosition(position: Variance): Boolean defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore[SimpleFunctionDescriptorImpl]

'position' @ [141:59] ==> value-parameter position: Variance defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.checkTypePosition[ValueParameterDescriptorImpl]

'checkTypePosition' @ [143:81] ==> private final fun TypeBinding<PsiElement>.checkTypePosition(containingType: KotlinType, position: Variance): Boolean defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore[SimpleFunctionDescriptorImpl]

'type' @ [143:99] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.resolve.typeBinding.TypeBinding[DeserializedPropertyDescriptor]

'position' @ [143:105] ==> value-parameter position: Variance defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.checkTypePosition[ValueParameterDescriptorImpl]

'checkTypePosition' @ [146:9] ==> public fun <D : TypeHolder<TypeBinding<PsiElement>>> TypeBinding<PsiElement>.checkTypePosition(position: Variance, reportError: (TypeParameterDescriptor, TypeBinding<PsiElement>, Variance) -> Unit = ..., customVariance: (TypeParameterDescriptor) -> Variance? = ...): Boolean defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <D : TypeHolder<D>> -> TypeBinding<PsiElement>

'position' @ [147:17] ==> value-parameter position: Variance defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.checkTypePosition[ValueParameterDescriptorImpl]

'VarianceConflictDiagnosticData' @ [149:58] ==> public constructor VarianceConflictDiagnosticData(containingType: KotlinType, typeParameter: TypeParameterDescriptor, occurrencePosition: Variance) defined in org.jetbrains.kotlin.resolve.VarianceConflictDiagnosticData[ClassConstructorDescriptorImpl]

'containingType' @ [149:89] ==> value-parameter containingType: KotlinType defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.checkTypePosition[ValueParameterDescriptorImpl]

'typeParameterDescriptor' @ [149:105] ==> value-parameter typeParameterDescriptor: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.checkTypePosition.<anonymous>[ValueParameterDescriptorImpl]

'errorPosition' @ [149:130] ==> value-parameter errorPosition: Variance defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.checkTypePosition.<anonymous>[ValueParameterDescriptorImpl]

'if (typeBinding.isInAbbreviation) Errors.TYPE_VARIANCE_CONFLICT_IN_EXPANDED_TYPE else Errors.TYPE_VARIANCE_CONFLICT' @ [150:38] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (DiagnosticFactory1<(PsiElement..PsiElement?), (VarianceConflictDiagnosticData..VarianceConflictDiagnosticData?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (VarianceConflictDiagnosticData..VarianceConflictDiagnosticData?)>?), elseBranch: (DiagnosticFactory1<(PsiElement..PsiElement?), (VarianceConflictDiagnosticData..VarianceConflictDiagnosticData?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (VarianceConflictDiagnosticData..VarianceConflictDiagnosticData?)>?)): (DiagnosticFactory1<(PsiElement..PsiElement?), (VarianceConflictDiagnosticData..VarianceConflictDiagnosticData?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (VarianceConflictDiagnosticData..VarianceConflictDiagnosticData?)>?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (org.jetbrains.kotlin.diagnostics.DiagnosticFactory1<(com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?), (org.jetbrains.kotlin.resolve.VarianceConflictDiagnosticData..org.jetbrains.kotlin.resolve.VarianceConflictDiagnosticData?)>..org.jetbrains.kotlin.diagnostics.DiagnosticFactory1<(com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?), (org.jetbrains.kotlin.resolve.VarianceConflictDiagnosticData..org.jetbrains.kotlin.resolve.VarianceConflictDiagnosticData?)>?)

'typeBinding' @ [150:42] ==> value-parameter typeBinding: TypeBinding<PsiElement> defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.checkTypePosition.<anonymous>[ValueParameterDescriptorImpl]

'isInAbbreviation' @ [150:54] ==> public abstract val isInAbbreviation: Boolean defined in org.jetbrains.kotlin.resolve.typeBinding.TypeBinding[PropertyDescriptorImpl]

'TYPE_VARIANCE_CONFLICT_IN_EXPANDED_TYPE' @ [150:79] ==> public final val TYPE_VARIANCE_CONFLICT_IN_EXPANDED_TYPE: (DiagnosticFactory1<(PsiElement..PsiElement?), (VarianceConflictDiagnosticData..VarianceConflictDiagnosticData?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (VarianceConflictDiagnosticData..VarianceConflictDiagnosticData?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'TYPE_VARIANCE_CONFLICT' @ [150:131] ==> public final val TYPE_VARIANCE_CONFLICT: (DiagnosticFactory1<(PsiElement..PsiElement?), (VarianceConflictDiagnosticData..VarianceConflictDiagnosticData?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (VarianceConflictDiagnosticData..VarianceConflictDiagnosticData?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'diagnosticSink' @ [151:21] ==> private final val diagnosticSink: DiagnosticSink defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore[PropertyDescriptorImpl]

'report' @ [151:36] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'diagnostic' @ [151:43] ==> val diagnostic: (DiagnosticFactory1<(PsiElement..PsiElement?), (VarianceConflictDiagnosticData..VarianceConflictDiagnosticData?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (VarianceConflictDiagnosticData..VarianceConflictDiagnosticData?)>?) defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.checkTypePosition.<anonymous>[LocalVariableDescriptor]

'on' @ [151:54] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull argument: VarianceConflictDiagnosticData): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'typeBinding' @ [151:57] ==> value-parameter typeBinding: TypeBinding<PsiElement> defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.checkTypePosition.<anonymous>[ValueParameterDescriptorImpl]

'psiElement' @ [151:69] ==> public abstract val psiElement: PsiElement defined in org.jetbrains.kotlin.resolve.typeBinding.TypeBinding[PropertyDescriptorImpl]

'varianceConflictDiagnosticData' @ [151:81] ==> val varianceConflictDiagnosticData: VarianceConflictDiagnosticData defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.checkTypePosition.<anonymous>[LocalVariableDescriptor]

'it' @ [153:36] ==> value-parameter it: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.checkTypePosition.<anonymous>[ValueParameterDescriptorImpl]

'varianceWithManual' @ [153:39] ==> private final fun TypeParameterDescriptor.varianceWithManual(): Variance defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore[SimpleFunctionDescriptorImpl]

'descriptor' @ [157:31] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.isIrrelevant[ValueParameterDescriptorImpl]

'containingDeclaration' @ [157:42] ==> public final val CallableDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'containingClass' @ [158:16] ==> val containingClass: ClassDescriptor defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.isIrrelevant[LocalVariableDescriptor]

'typeConstructor' @ [158:32] ==> public final val ClassDescriptor.typeConstructor: TypeConstructor[MyPropertyDescriptor]

'parameters' @ [158:48] ==> public final val TypeConstructor.parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'all' @ [158:59] ==> public inline fun <T> Iterable<(TypeParameterDescriptor..TypeParameterDescriptor?)>.all(predicate: ((TypeParameterDescriptor..TypeParameterDescriptor?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)

'it' @ [158:65] ==> value-parameter it: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.isIrrelevant.<anonymous>[ValueParameterDescriptorImpl]

'varianceWithManual' @ [158:68] ==> private final fun TypeParameterDescriptor.varianceWithManual(): Variance defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore[SimpleFunctionDescriptorImpl]

'INVARIANT' @ [158:92] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'when (descriptor) {
                is FunctionDescriptorImpl -> descriptor.visibility = Visibilities.PRIVATE_TO_THIS
                is PropertyDescriptorImpl -> {
                    descriptor.visibility = Visibilities.PRIVATE_TO_THIS
                    for (accessor in descriptor.accessors) {
                        (accessor as PropertyAccessorDescriptorImpl).visibility = Visibilities.PRIVATE_TO_THIS
                    }
                }
                else -> throw IllegalStateException("Unexpected descriptor type: ${descriptor::class.java.name}")
            }' @ [164:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'descriptor' @ [164:19] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.Companion.recordPrivateToThis[ValueParameterDescriptorImpl]

'descriptor' @ [165:46] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.Companion.recordPrivateToThis[ValueParameterDescriptorImpl]

'visibility' @ [165:57] ==> public final var FunctionDescriptorImpl.visibility: Visibility[MyPropertyDescriptor]

'PRIVATE_TO_THIS' @ [165:83] ==> @NotNull public final val PRIVATE_TO_THIS: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'descriptor' @ [167:21] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.Companion.recordPrivateToThis[ValueParameterDescriptorImpl]

'visibility' @ [167:32] ==> public final var PropertyDescriptorImpl.visibility: Visibility[MyPropertyDescriptor]

'PRIVATE_TO_THIS' @ [167:58] ==> @NotNull public final val PRIVATE_TO_THIS: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'descriptor' @ [168:38] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.Companion.recordPrivateToThis[ValueParameterDescriptorImpl]

'accessors' @ [168:49] ==> public final val PropertyDescriptorImpl.accessors: (MutableList<(PropertyAccessorDescriptor..PropertyAccessorDescriptor?)>..List<(PropertyAccessorDescriptor..PropertyAccessorDescriptor?)>)[MyPropertyDescriptor]

'accessor' @ [169:26] ==> val accessor: (PropertyAccessorDescriptor..PropertyAccessorDescriptor?) defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.Companion.recordPrivateToThis[LocalVariableDescriptor]

'visibility' @ [169:70] ==> public final var PropertyAccessorDescriptorImpl.visibility: Visibility[MyPropertyDescriptor]

'PRIVATE_TO_THIS' @ [169:96] ==> @NotNull public final val PRIVATE_TO_THIS: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'IllegalStateException' @ [172:31] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'descriptor' @ [172:84] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.Companion.recordPrivateToThis[ValueParameterDescriptorImpl]

'java' @ [172:102] ==> public val <T> KClass<out CallableMemberDescriptor>.java: Class<out CallableMemberDescriptor> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out CallableMemberDescriptor)

'name' @ [172:107] ==> public final val <T : (Any..Any?)> Class<out CallableMemberDescriptor>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out CallableMemberDescriptor)

'if (other == null) this else this and other' @ [176:58] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'other' @ [176:62] ==> value-parameter other: Boolean? defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.Companion.and[ValueParameterDescriptorImpl]

'this' @ [176:77] ==> <this> defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.Companion.and[ReceiverParameterDescriptorImpl]

'this' @ [176:87] ==> <this> defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.Companion.and[ReceiverParameterDescriptorImpl]

'other' @ [176:96] ==> value-parameter other: Boolean? defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore.Companion.and[ValueParameterDescriptorImpl]

