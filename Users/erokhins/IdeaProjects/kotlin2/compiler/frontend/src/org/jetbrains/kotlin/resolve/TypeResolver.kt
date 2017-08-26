'resolveType' @ [78:16] ==> private final fun resolveType(c: TypeResolutionContext, typeReference: KtTypeReference): KotlinType defined in org.jetbrains.kotlin.resolve.TypeResolver[SimpleFunctionDescriptorImpl]

'TypeResolutionContext' @ [78:28] ==> public constructor TypeResolutionContext(@NotNull scope: LexicalScope, @NotNull trace: BindingTrace, checkBounds: Boolean, allowBareTypes: Boolean, isDebuggerContext: Boolean, abbreviated: Boolean) defined in org.jetbrains.kotlin.resolve.TypeResolutionContext[JavaClassConstructorDescriptor]

'scope' @ [78:50] ==> value-parameter scope: LexicalScope defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveType[ValueParameterDescriptorImpl]

'trace' @ [78:57] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveType[ValueParameterDescriptorImpl]

'checkBounds' @ [78:64] ==> value-parameter checkBounds: Boolean defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveType[ValueParameterDescriptorImpl]

'typeReference' @ [78:84] ==> value-parameter typeReference: KtTypeReference defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveType[ValueParameterDescriptorImpl]

'suppressDiagnosticsInDebugMode' @ [78:98] ==> public fun KtElement.suppressDiagnosticsInDebugMode(): Boolean defined in org.jetbrains.kotlin.psi.codeFragmentUtil in file codeFragmentUtil.kt[SimpleFunctionDescriptorImpl]

'typeReference' @ [78:140] ==> value-parameter typeReference: KtTypeReference defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveType[ValueParameterDescriptorImpl]

'resolveType' @ [82:28] ==> private final fun resolveType(c: TypeResolutionContext, typeReference: KtTypeReference): KotlinType defined in org.jetbrains.kotlin.resolve.TypeResolver[SimpleFunctionDescriptorImpl]

'TypeResolutionContext' @ [82:40] ==> public constructor TypeResolutionContext(@NotNull scope: LexicalScope, @NotNull trace: BindingTrace, checkBounds: Boolean, allowBareTypes: Boolean, isDebuggerContext: Boolean, abbreviated: Boolean) defined in org.jetbrains.kotlin.resolve.TypeResolutionContext[JavaClassConstructorDescriptor]

'scope' @ [82:62] ==> value-parameter scope: LexicalScope defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveAbbreviatedType[ValueParameterDescriptorImpl]

'trace' @ [82:69] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveAbbreviatedType[ValueParameterDescriptorImpl]

'typeReference' @ [82:89] ==> value-parameter typeReference: KtTypeReference defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveAbbreviatedType[ValueParameterDescriptorImpl]

'suppressDiagnosticsInDebugMode' @ [82:103] ==> public fun KtElement.suppressDiagnosticsInDebugMode(): Boolean defined in org.jetbrains.kotlin.psi.codeFragmentUtil in file codeFragmentUtil.kt[SimpleFunctionDescriptorImpl]

'typeReference' @ [83:40] ==> value-parameter typeReference: KtTypeReference defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveAbbreviatedType[ValueParameterDescriptorImpl]

'unwrap' @ [83:55] ==> public abstract fun unwrap(): UnwrappedType defined in org.jetbrains.kotlin.types.KotlinType[DeserializedSimpleFunctionDescriptor]

'when (resolvedType) {
            is DynamicType -> {
                trace.report(Errors.TYPEALIAS_SHOULD_EXPAND_TO_CLASS.on(typeReference, resolvedType))
                ErrorUtils.createErrorType("dynamic type in wrong context")
            }
            is SimpleType -> resolvedType
            else -> error("Unexpected type: $resolvedType")
        }' @ [84:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: SimpleType, entry1: SimpleType, entry2: SimpleType): SimpleType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> SimpleType

'resolvedType' @ [84:22] ==> val resolvedType: UnwrappedType defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveAbbreviatedType[LocalVariableDescriptor]

'trace' @ [86:17] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveAbbreviatedType[ValueParameterDescriptorImpl]

'report' @ [86:23] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'TYPEALIAS_SHOULD_EXPAND_TO_CLASS' @ [86:37] ==> public final val TYPEALIAS_SHOULD_EXPAND_TO_CLASS: (DiagnosticFactory1<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..DiagnosticFactory1<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [86:70] ==> @NotNull public open fun on(@NotNull element: KtTypeReference, @NotNull argument: KotlinType): ParametrizedDiagnostic<(KtTypeReference..KtTypeReference?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'typeReference' @ [86:73] ==> value-parameter typeReference: KtTypeReference defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveAbbreviatedType[ValueParameterDescriptorImpl]

'resolvedType' @ [86:88] ==> val resolvedType: UnwrappedType defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveAbbreviatedType[LocalVariableDescriptor]

'createErrorType' @ [87:28] ==> @NotNull public open fun createErrorType(@NotNull p0: String): SimpleType defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'resolvedType' @ [89:30] ==> val resolvedType: UnwrappedType defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveAbbreviatedType[LocalVariableDescriptor]

'error' @ [90:21] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'resolvedType' @ [90:46] ==> val resolvedType: UnwrappedType defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveAbbreviatedType[LocalVariableDescriptor]

'TypeAliasExpansion' @ [95:34] ==> public companion object defined in org.jetbrains.kotlin.resolve.TypeAliasExpansion[FakeCallableDescriptorForObject]

'createWithFormalArguments' @ [95:53] ==> public final fun createWithFormalArguments(typeAliasDescriptor: TypeAliasDescriptor): TypeAliasExpansion defined in org.jetbrains.kotlin.resolve.TypeAliasExpansion.Companion[SimpleFunctionDescriptorImpl]

'typeAliasDescriptor' @ [95:79] ==> value-parameter typeAliasDescriptor: TypeAliasDescriptor defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveExpandedTypeForTypeAlias[ValueParameterDescriptorImpl]

'TypeAliasExpander' @ [96:28] ==> public companion object defined in org.jetbrains.kotlin.resolve.TypeAliasExpander[FakeCallableDescriptorForObject]

'NON_REPORTING' @ [96:46] ==> public final val NON_REPORTING: TypeAliasExpander defined in org.jetbrains.kotlin.resolve.TypeAliasExpander.Companion[PropertyDescriptorImpl]

'expandWithoutAbbreviation' @ [96:60] ==> public final fun expandWithoutAbbreviation(typeAliasExpansion: TypeAliasExpansion, annotations: Annotations): SimpleType defined in org.jetbrains.kotlin.resolve.TypeAliasExpander[SimpleFunctionDescriptorImpl]

'typeAliasExpansion' @ [96:86] ==> val typeAliasExpansion: TypeAliasExpansion defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveExpandedTypeForTypeAlias[LocalVariableDescriptor]

'Annotations' @ [96:106] ==> public companion object defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[FakeCallableDescriptorForObject]

'EMPTY' @ [96:118] ==> public final val EMPTY: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion[DeserializedPropertyDescriptor]

'expandedType' @ [97:16] ==> val expandedType: SimpleType defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveExpandedTypeForTypeAlias[LocalVariableDescriptor]

'assert' @ [101:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!' @ [101:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'c' @ [101:17] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveType[ValueParameterDescriptorImpl]

'allowBareTypes' @ [101:19] ==> public final val allowBareTypes: Boolean defined in org.jetbrains.kotlin.resolve.TypeResolutionContext[JavaPropertyDescriptor]

'resolvePossiblyBareType' @ [102:16] ==> public final fun resolvePossiblyBareType(c: TypeResolutionContext, typeReference: KtTypeReference): PossiblyBareType defined in org.jetbrains.kotlin.resolve.TypeResolver[SimpleFunctionDescriptorImpl]

'c' @ [102:40] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveType[ValueParameterDescriptorImpl]

'typeReference' @ [102:43] ==> value-parameter typeReference: KtTypeReference defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveType[ValueParameterDescriptorImpl]

'actualType' @ [102:58] ==> public final val PossiblyBareType.actualType: KotlinType[MyPropertyDescriptor]

'c' @ [106:26] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolvePossiblyBareType[ValueParameterDescriptorImpl]

'trace' @ [106:28] ==> public final val trace: (BindingTrace..BindingTrace?) defined in org.jetbrains.kotlin.resolve.TypeResolutionContext[JavaPropertyDescriptor]

'bindingContext' @ [106:34] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'get' @ [106:49] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..ReadOnlySlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?), key: (KtTypeReference..KtTypeReference?)): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtTypeReference
    <V : (Any..Any?)> -> KotlinType

'TYPE' @ [106:68] ==> public final val TYPE: (WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'typeReference' @ [106:74] ==> value-parameter typeReference: KtTypeReference defined in org.jetbrains.kotlin.resolve.TypeResolver.resolvePossiblyBareType[ValueParameterDescriptorImpl]

'cachedType' @ [107:13] ==> val cachedType: KotlinType? defined in org.jetbrains.kotlin.resolve.TypeResolver.resolvePossiblyBareType[LocalVariableDescriptor]

'type' @ [107:40] ==> @NotNull public open fun type(@NotNull actualType: KotlinType): PossiblyBareType defined in org.jetbrains.kotlin.resolve.PossiblyBareType[JavaMethodDescriptor]

'cachedType' @ [107:45] ==> val cachedType: KotlinType? defined in org.jetbrains.kotlin.resolve.TypeResolver.resolvePossiblyBareType[LocalVariableDescriptor]

'if (c.abbreviated) BindingContext.ABBREVIATED_TYPE else BindingContext.TYPE' @ [109:33] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?), elseBranch: (WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?)): (WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (org.jetbrains.kotlin.util.slicedMap.WritableSlice<(org.jetbrains.kotlin.psi.KtTypeReference..org.jetbrains.kotlin.psi.KtTypeReference?), (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)>..org.jetbrains.kotlin.util.slicedMap.WritableSlice<(org.jetbrains.kotlin.psi.KtTypeReference..org.jetbrains.kotlin.psi.KtTypeReference?), (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)>?)

'c' @ [109:37] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolvePossiblyBareType[ValueParameterDescriptorImpl]

'abbreviated' @ [109:39] ==> public final val abbreviated: Boolean defined in org.jetbrains.kotlin.resolve.TypeResolutionContext[JavaPropertyDescriptor]

'ABBREVIATED_TYPE' @ [109:67] ==> public final val ABBREVIATED_TYPE: (WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'TYPE' @ [109:104] ==> public final val TYPE: (WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'typeReference' @ [111:25] ==> value-parameter typeReference: KtTypeReference defined in org.jetbrains.kotlin.resolve.TypeResolver.resolvePossiblyBareType[ValueParameterDescriptorImpl]

'debugTypeInfo' @ [111:39] ==> public var KtTypeReference.debugTypeInfo: KotlinType? defined in org.jetbrains.kotlin.psi.codeFragmentUtil in file codeFragmentUtil.kt[PropertyDescriptorImpl]

'debugType' @ [112:13] ==> val debugType: KotlinType? defined in org.jetbrains.kotlin.resolve.TypeResolver.resolvePossiblyBareType[LocalVariableDescriptor]

'c' @ [113:13] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolvePossiblyBareType[ValueParameterDescriptorImpl]

'trace' @ [113:15] ==> public final val trace: (BindingTrace..BindingTrace?) defined in org.jetbrains.kotlin.resolve.TypeResolutionContext[JavaPropertyDescriptor]

'record' @ [113:21] ==> public abstract fun <K : (Any..Any?), V : (Any..Any?)> record(slice: (WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?), key: (KtTypeReference..KtTypeReference?), value: (KotlinType..KotlinType?)): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtTypeReference
    <V : (Any..Any?)> -> KotlinType

'resolvedTypeSlice' @ [113:28] ==> val resolvedTypeSlice: (WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.resolve.TypeResolver.resolvePossiblyBareType[LocalVariableDescriptor]

'typeReference' @ [113:47] ==> value-parameter typeReference: KtTypeReference defined in org.jetbrains.kotlin.resolve.TypeResolver.resolvePossiblyBareType[ValueParameterDescriptorImpl]

'debugType' @ [113:62] ==> val debugType: KotlinType? defined in org.jetbrains.kotlin.resolve.TypeResolver.resolvePossiblyBareType[LocalVariableDescriptor]

'type' @ [114:20] ==> @NotNull public open fun type(@NotNull actualType: KotlinType): PossiblyBareType defined in org.jetbrains.kotlin.resolve.PossiblyBareType[JavaMethodDescriptor]

'debugType' @ [114:25] ==> val debugType: KotlinType? defined in org.jetbrains.kotlin.resolve.TypeResolver.resolvePossiblyBareType[LocalVariableDescriptor]

'resolveTypeAnnotations' @ [117:27] ==> private final fun resolveTypeAnnotations(c: TypeResolutionContext, modifierListsOwner: KtElementImplStub<*>): Annotations defined in org.jetbrains.kotlin.resolve.TypeResolver[SimpleFunctionDescriptorImpl]

'c' @ [117:50] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolvePossiblyBareType[ValueParameterDescriptorImpl]

'typeReference' @ [117:53] ==> value-parameter typeReference: KtTypeReference defined in org.jetbrains.kotlin.resolve.TypeResolver.resolvePossiblyBareType[ValueParameterDescriptorImpl]

'resolveTypeElement' @ [118:20] ==> private final fun resolveTypeElement(c: TypeResolutionContext, annotations: Annotations, outerModifierList: KtModifierList?, typeElement: KtTypeElement?): PossiblyBareType defined in org.jetbrains.kotlin.resolve.TypeResolver[SimpleFunctionDescriptorImpl]

'c' @ [118:39] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolvePossiblyBareType[ValueParameterDescriptorImpl]

'annotations' @ [118:42] ==> val annotations: Annotations defined in org.jetbrains.kotlin.resolve.TypeResolver.resolvePossiblyBareType[LocalVariableDescriptor]

'typeReference' @ [118:55] ==> value-parameter typeReference: KtTypeReference defined in org.jetbrains.kotlin.resolve.TypeResolver.resolvePossiblyBareType[ValueParameterDescriptorImpl]

'modifierList' @ [118:69] ==> public final val KtTypeReference.modifierList: KtModifierList?[MyPropertyDescriptor]

'typeReference' @ [118:83] ==> value-parameter typeReference: KtTypeReference defined in org.jetbrains.kotlin.resolve.TypeResolver.resolvePossiblyBareType[ValueParameterDescriptorImpl]

'typeElement' @ [118:97] ==> public final val typeElement: KtTypeElement? defined in org.jetbrains.kotlin.psi.KtTypeReference[PropertyDescriptorImpl]

'c' @ [119:9] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolvePossiblyBareType[ValueParameterDescriptorImpl]

'trace' @ [119:11] ==> public final val trace: (BindingTrace..BindingTrace?) defined in org.jetbrains.kotlin.resolve.TypeResolutionContext[JavaPropertyDescriptor]

'recordScope' @ [119:17] ==> public fun BindingTrace.recordScope(scope: LexicalScope, element: KtElement?): Unit defined in org.jetbrains.kotlin.resolve.bindingContextUtil in file BindingContextUtils.kt[SimpleFunctionDescriptorImpl]

'c' @ [119:29] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolvePossiblyBareType[ValueParameterDescriptorImpl]

'scope' @ [119:31] ==> public final val scope: (LexicalScope..LexicalScope?) defined in org.jetbrains.kotlin.resolve.TypeResolutionContext[JavaPropertyDescriptor]

'typeReference' @ [119:38] ==> value-parameter typeReference: KtTypeReference defined in org.jetbrains.kotlin.resolve.TypeResolver.resolvePossiblyBareType[ValueParameterDescriptorImpl]

'!' @ [121:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'type' @ [121:14] ==> val type: PossiblyBareType defined in org.jetbrains.kotlin.resolve.TypeResolver.resolvePossiblyBareType[LocalVariableDescriptor]

'isBare' @ [121:19] ==> public final val PossiblyBareType.isBare: Boolean[MyPropertyDescriptor]

'type' @ [122:30] ==> val type: PossiblyBareType defined in org.jetbrains.kotlin.resolve.TypeResolver.resolvePossiblyBareType[LocalVariableDescriptor]

'actualType' @ [122:35] ==> public final val PossiblyBareType.actualType: KotlinType[MyPropertyDescriptor]

'arguments' @ [122:46] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'forceResolveTypeContents' @ [123:17] ==> private final fun forceResolveTypeContents(type: KotlinType): Unit defined in org.jetbrains.kotlin.resolve.TypeResolver[SimpleFunctionDescriptorImpl]

'argument' @ [123:42] ==> val argument: TypeProjection defined in org.jetbrains.kotlin.resolve.TypeResolver.resolvePossiblyBareType[LocalVariableDescriptor]

'type' @ [123:51] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'c' @ [125:13] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolvePossiblyBareType[ValueParameterDescriptorImpl]

'trace' @ [125:15] ==> public final val trace: (BindingTrace..BindingTrace?) defined in org.jetbrains.kotlin.resolve.TypeResolutionContext[JavaPropertyDescriptor]

'record' @ [125:21] ==> public abstract fun <K : (Any..Any?), V : (Any..Any?)> record(slice: (WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?), key: (KtTypeReference..KtTypeReference?), value: (KotlinType..KotlinType?)): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtTypeReference
    <V : (Any..Any?)> -> KotlinType

'resolvedTypeSlice' @ [125:28] ==> val resolvedTypeSlice: (WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.resolve.TypeResolver.resolvePossiblyBareType[LocalVariableDescriptor]

'typeReference' @ [125:47] ==> value-parameter typeReference: KtTypeReference defined in org.jetbrains.kotlin.resolve.TypeResolver.resolvePossiblyBareType[ValueParameterDescriptorImpl]

'type' @ [125:62] ==> val type: PossiblyBareType defined in org.jetbrains.kotlin.resolve.TypeResolver.resolvePossiblyBareType[LocalVariableDescriptor]

'actualType' @ [125:67] ==> public final val PossiblyBareType.actualType: KotlinType[MyPropertyDescriptor]

'type' @ [127:16] ==> val type: PossiblyBareType defined in org.jetbrains.kotlin.resolve.TypeResolver.resolvePossiblyBareType[LocalVariableDescriptor]

'getStubOrPsiChildren' @ [131:13] ==> @NotNull public open fun <S : raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>?), Psi : (PsiElement..PsiElement?)> getStubOrPsiChildren(@NotNull p0: IStubElementType<(KotlinModifierListStub..KotlinModifierListStub?), out (KtDeclarationModifierList..KtDeclarationModifierList?)>, @NotNull p1: ArrayFactory<(KtDeclarationModifierList..KtDeclarationModifierList?)>): (Array<(KtDeclarationModifierList..KtDeclarationModifierList?)>..Array<out (KtDeclarationModifierList..KtDeclarationModifierList?)>) defined in org.jetbrains.kotlin.psi.KtElementImplStub[JavaMethodDescriptor]
Inferred types:
    <S : raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>?)> -> KotlinModifierListStub
    <Psi : (PsiElement..PsiElement?)> -> KtDeclarationModifierList

'MODIFIER_LIST' @ [131:53] ==> public final val MODIFIER_LIST: (KtModifierListElementType<(KtDeclarationModifierList..KtDeclarationModifierList?)>..KtModifierListElementType<(KtDeclarationModifierList..KtDeclarationModifierList?)>?) defined in org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes[JavaPropertyDescriptor]

'MODIFIER_LIST' @ [131:87] ==> public final val MODIFIER_LIST: (KtModifierListElementType<(KtDeclarationModifierList..KtDeclarationModifierList?)>..KtModifierListElementType<(KtDeclarationModifierList..KtDeclarationModifierList?)>?) defined in org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes[JavaPropertyDescriptor]

'arrayFactory' @ [131:101] ==> public final val <T : (KtModifierList..KtModifierList?)> KtModifierListElementType<(KtDeclarationModifierList..KtDeclarationModifierList?)>.arrayFactory: ArrayFactory<(KtDeclarationModifierList..KtDeclarationModifierList?)>[MyPropertyDescriptor]
Inferred types:
    <T : (KtModifierList..KtModifierList?)> -> (org.jetbrains.kotlin.psi.KtDeclarationModifierList..org.jetbrains.kotlin.psi.KtDeclarationModifierList?)

'modifierListsOwner' @ [134:29] ==> value-parameter modifierListsOwner: KtElementImplStub<*> defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeAnnotations[ValueParameterDescriptorImpl]

'getAllModifierLists' @ [134:48] ==> internal final fun KtElementImplStub<*>.getAllModifierLists(): Array<out KtDeclarationModifierList> defined in org.jetbrains.kotlin.resolve.TypeResolver[SimpleFunctionDescriptorImpl]

'Annotations' @ [136:22] ==> public companion object defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[FakeCallableDescriptorForObject]

'EMPTY' @ [136:34] ==> public final val EMPTY: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion[DeserializedPropertyDescriptor]

'modifierLists' @ [139:30] ==> val modifierLists: Array<out KtDeclarationModifierList> defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeAnnotations[LocalVariableDescriptor]

'isSplitModifierList' @ [140:17] ==> var isSplitModifierList: Boolean defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeAnnotations[LocalVariableDescriptor]

'c' @ [141:17] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeAnnotations[ValueParameterDescriptorImpl]

'trace' @ [141:19] ==> public final val trace: (BindingTrace..BindingTrace?) defined in org.jetbrains.kotlin.resolve.TypeResolutionContext[JavaPropertyDescriptor]

'report' @ [141:25] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'MODIFIER_LIST_NOT_ALLOWED' @ [141:32] ==> public final val MODIFIER_LIST_NOT_ALLOWED: (DiagnosticFactory0<(KtModifierList..KtModifierList?)>..DiagnosticFactory0<(KtModifierList..KtModifierList?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [141:58] ==> @NotNull public open fun on(@NotNull element: KtModifierList): SimpleDiagnostic<(KtModifierList..KtModifierList?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'modifierList' @ [141:61] ==> val modifierList: KtDeclarationModifierList defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeAnnotations[LocalVariableDescriptor]

'annotationResolver' @ [144:31] ==> private final val annotationResolver: AnnotationResolver defined in org.jetbrains.kotlin.resolve.TypeResolver[PropertyDescriptorImpl]

'resolveAnnotationsWithoutArguments' @ [144:50] ==> public final fun resolveAnnotationsWithoutArguments(scope: LexicalScope, annotationEntries: @JvmSuppressWildcards List<KtAnnotationEntry>, trace: BindingTrace): Annotations defined in org.jetbrains.kotlin.resolve.AnnotationResolver[SimpleFunctionDescriptorImpl]

'c' @ [144:85] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeAnnotations[ValueParameterDescriptorImpl]

'scope' @ [144:87] ==> public final val scope: (LexicalScope..LexicalScope?) defined in org.jetbrains.kotlin.resolve.TypeResolutionContext[JavaPropertyDescriptor]

'modifierList' @ [144:94] ==> val modifierList: KtDeclarationModifierList defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeAnnotations[LocalVariableDescriptor]

'annotationEntries' @ [144:107] ==> public final val KtDeclarationModifierList.annotationEntries: (MutableList<(KtAnnotationEntry..KtAnnotationEntry?)>..List<(KtAnnotationEntry..KtAnnotationEntry?)>)[MyPropertyDescriptor]

'c' @ [144:126] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeAnnotations[ValueParameterDescriptorImpl]

'trace' @ [144:128] ==> public final val trace: (BindingTrace..BindingTrace?) defined in org.jetbrains.kotlin.resolve.TypeResolutionContext[JavaPropertyDescriptor]

'result' @ [145:13] ==> var result: Annotations defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeAnnotations[LocalVariableDescriptor]

'composeAnnotations' @ [145:22] ==> public fun composeAnnotations(first: Annotations, second: Annotations): Annotations defined in org.jetbrains.kotlin.descriptors.annotations[DeserializedSimpleFunctionDescriptor]

'result' @ [145:41] ==> var result: Annotations defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeAnnotations[LocalVariableDescriptor]

'annotations' @ [145:49] ==> val annotations: Annotations defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeAnnotations[LocalVariableDescriptor]

'isSplitModifierList' @ [147:13] ==> var isSplitModifierList: Boolean defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeAnnotations[LocalVariableDescriptor]

'result' @ [150:16] ==> var result: Annotations defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeAnnotations[LocalVariableDescriptor]

'type' @ [167:9] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.resolve.TypeResolver.forceResolveTypeContents[ValueParameterDescriptorImpl]

'annotations' @ [167:14] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'if (type.isFlexible()) {
            forceResolveTypeContents(type.asFlexibleType().lowerBound)
            forceResolveTypeContents(type.asFlexibleType().upperBound)
        }
        else {
            type.constructor // force read type constructor
            for (projection in type.arguments) {
                if (!projection.isStarProjection) {
                    forceResolveTypeContents(projection.type)
                }
            }
        }' @ [168:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'type' @ [168:13] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.resolve.TypeResolver.forceResolveTypeContents[ValueParameterDescriptorImpl]

'isFlexible' @ [168:18] ==> public fun KotlinType.isFlexible(): Boolean defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'forceResolveTypeContents' @ [169:13] ==> private final fun forceResolveTypeContents(type: KotlinType): Unit defined in org.jetbrains.kotlin.resolve.TypeResolver[SimpleFunctionDescriptorImpl]

'type' @ [169:38] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.resolve.TypeResolver.forceResolveTypeContents[ValueParameterDescriptorImpl]

'asFlexibleType' @ [169:43] ==> public fun KotlinType.asFlexibleType(): FlexibleType defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'lowerBound' @ [169:60] ==> public final val lowerBound: SimpleType defined in org.jetbrains.kotlin.types.FlexibleType[DeserializedPropertyDescriptor]

'forceResolveTypeContents' @ [170:13] ==> private final fun forceResolveTypeContents(type: KotlinType): Unit defined in org.jetbrains.kotlin.resolve.TypeResolver[SimpleFunctionDescriptorImpl]

'type' @ [170:38] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.resolve.TypeResolver.forceResolveTypeContents[ValueParameterDescriptorImpl]

'asFlexibleType' @ [170:43] ==> public fun KotlinType.asFlexibleType(): FlexibleType defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'upperBound' @ [170:60] ==> public final val upperBound: SimpleType defined in org.jetbrains.kotlin.types.FlexibleType[DeserializedPropertyDescriptor]

'type' @ [173:13] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.resolve.TypeResolver.forceResolveTypeContents[ValueParameterDescriptorImpl]

'constructor' @ [173:18] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'type' @ [174:32] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.resolve.TypeResolver.forceResolveTypeContents[ValueParameterDescriptorImpl]

'arguments' @ [174:37] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'!' @ [175:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'projection' @ [175:22] ==> val projection: TypeProjection defined in org.jetbrains.kotlin.resolve.TypeResolver.forceResolveTypeContents[LocalVariableDescriptor]

'isStarProjection' @ [175:33] ==> public final val TypeProjection.isStarProjection: Boolean[MyPropertyDescriptor]

'forceResolveTypeContents' @ [176:21] ==> private final fun forceResolveTypeContents(type: KotlinType): Unit defined in org.jetbrains.kotlin.resolve.TypeResolver[SimpleFunctionDescriptorImpl]

'projection' @ [176:46] ==> val projection: TypeProjection defined in org.jetbrains.kotlin.resolve.TypeResolver.forceResolveTypeContents[LocalVariableDescriptor]

'type' @ [176:57] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'outerModifierList' @ [185:34] ==> value-parameter outerModifierList: KtModifierList? defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement[ValueParameterDescriptorImpl]

'hasModifier' @ [185:53] ==> public open fun hasModifier(@NotNull tokenType: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtModifierList[JavaMethodDescriptor]

'SUSPEND_KEYWORD' @ [185:74] ==> public final val SUSPEND_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'outerModifierList' @ [186:31] ==> value-parameter outerModifierList: KtModifierList? defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement[ValueParameterDescriptorImpl]

'getModifier' @ [186:50] ==> @Nullable public open fun getModifier(@NotNull tokenType: KtModifierKeywordToken): PsiElement? defined in org.jetbrains.kotlin.psi.KtModifierList[JavaMethodDescriptor]

'SUSPEND_KEYWORD' @ [186:71] ==> public final val SUSPEND_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'if (hasSuspendModifier && !typeElement.canHaveFunctionTypeModifiers()) {
            c.trace.report(Errors.WRONG_MODIFIER_TARGET.on(suspendModifier!!, KtTokens.SUSPEND_KEYWORD, "non-functional type"))
        }
        else if (hasSuspendModifier) {
            checkCoroutinesFeature(languageVersionSettings, c.trace, suspendModifier!!)
        }' @ [187:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'hasSuspendModifier' @ [187:13] ==> val hasSuspendModifier: Boolean defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement[LocalVariableDescriptor]

'!' @ [187:35] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'typeElement' @ [187:36] ==> value-parameter typeElement: KtTypeElement? defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement[ValueParameterDescriptorImpl]

'canHaveFunctionTypeModifiers' @ [187:48] ==> private final fun KtTypeElement?.canHaveFunctionTypeModifiers(): Boolean defined in org.jetbrains.kotlin.resolve.TypeResolver[SimpleFunctionDescriptorImpl]

'c' @ [188:13] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement[ValueParameterDescriptorImpl]

'trace' @ [188:15] ==> public final val trace: (BindingTrace..BindingTrace?) defined in org.jetbrains.kotlin.resolve.TypeResolutionContext[JavaPropertyDescriptor]

'report' @ [188:21] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'WRONG_MODIFIER_TARGET' @ [188:35] ==> public final val WRONG_MODIFIER_TARGET: (DiagnosticFactory2<(PsiElement..PsiElement?), (KtModifierKeywordToken..KtModifierKeywordToken?), (String..String?)>..DiagnosticFactory2<(PsiElement..PsiElement?), (KtModifierKeywordToken..KtModifierKeywordToken?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [188:57] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull a: KtModifierKeywordToken, @NotNull b: String): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'suspendModifier' @ [188:60] ==> val suspendModifier: PsiElement? defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement[LocalVariableDescriptor]

'SUSPEND_KEYWORD' @ [188:88] ==> public final val SUSPEND_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'hasSuspendModifier' @ [190:18] ==> val hasSuspendModifier: Boolean defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement[LocalVariableDescriptor]

'checkCoroutinesFeature' @ [191:13] ==> public fun checkCoroutinesFeature(languageVersionSettings: LanguageVersionSettings, diagnosticHolder: DiagnosticSink, reportOn: PsiElement): Unit defined in org.jetbrains.kotlin.resolve.calls.checkers in file coroutineCallChecker.kt[SimpleFunctionDescriptorImpl]

'languageVersionSettings' @ [191:36] ==> private final val languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.resolve.TypeResolver[PropertyDescriptorImpl]

'c' @ [191:61] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement[ValueParameterDescriptorImpl]

'trace' @ [191:63] ==> public final val trace: (BindingTrace..BindingTrace?) defined in org.jetbrains.kotlin.resolve.TypeResolutionContext[JavaPropertyDescriptor]

'suspendModifier' @ [191:70] ==> val suspendModifier: PsiElement? defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement[LocalVariableDescriptor]

'typeElement' @ [194:9] ==> value-parameter typeElement: KtTypeElement? defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement[ValueParameterDescriptorImpl]

'accept' @ [194:22] ==> public abstract fun accept(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtTypeElement[JavaMethodDescriptor]

'KtVisitorVoid' @ [194:38] ==> public constructor KtVisitorVoid() defined in org.jetbrains.kotlin.psi.KtVisitorVoid[JavaClassConstructorDescriptor]

'resolveDescriptorForType' @ [196:49] ==> public final fun resolveDescriptorForType(scope: LexicalScope, userType: KtUserType, trace: BindingTrace, isDebuggerContext: Boolean): QualifiedExpressionResolver.TypeQualifierResolutionResult defined in org.jetbrains.kotlin.resolve.TypeResolver[SimpleFunctionDescriptorImpl]

'c' @ [196:74] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement[ValueParameterDescriptorImpl]

'scope' @ [196:76] ==> public final val scope: (LexicalScope..LexicalScope?) defined in org.jetbrains.kotlin.resolve.TypeResolutionContext[JavaPropertyDescriptor]

'type' @ [196:83] ==> value-parameter type: KtUserType defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.visitUserType[ValueParameterDescriptorImpl]

'c' @ [196:89] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement[ValueParameterDescriptorImpl]

'trace' @ [196:91] ==> public final val trace: (BindingTrace..BindingTrace?) defined in org.jetbrains.kotlin.resolve.TypeResolutionContext[JavaPropertyDescriptor]

'c' @ [196:98] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement[ValueParameterDescriptorImpl]

'isDebuggerContext' @ [196:100] ==> public final val isDebuggerContext: Boolean defined in org.jetbrains.kotlin.resolve.TypeResolutionContext[JavaPropertyDescriptor]

'qualifierResolutionResult' @ [197:34] ==> val qualifierResolutionResult: QualifiedExpressionResolver.TypeQualifierResolutionResult defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.visitUserType[LocalVariableDescriptor]

'classifierDescriptor' @ [197:60] ==> public final val classifierDescriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.QualifiedExpressionResolver.TypeQualifierResolutionResult[PropertyDescriptorImpl]

'classifier' @ [199:21] ==> val classifier: ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.visitUserType[LocalVariableDescriptor]

'resolveTypeProjections' @ [200:37] ==> public final fun resolveTypeProjections(c: TypeResolutionContext, constructor: TypeConstructor, argumentElements: List<KtTypeProjection>): List<TypeProjection> defined in org.jetbrains.kotlin.resolve.TypeResolver[SimpleFunctionDescriptorImpl]

'c' @ [201:29] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement[ValueParameterDescriptorImpl]

'createErrorType' @ [201:43] ==> @NotNull public open fun createErrorType(@NotNull p0: String): SimpleType defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'constructor' @ [201:70] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.SimpleType[DeserializedPropertyDescriptor]

'qualifierResolutionResult' @ [201:83] ==> val qualifierResolutionResult: QualifiedExpressionResolver.TypeQualifierResolutionResult defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.visitUserType[LocalVariableDescriptor]

'allProjections' @ [201:109] ==> public final val allProjections: List<KtTypeProjection> defined in org.jetbrains.kotlin.resolve.QualifiedExpressionResolver.TypeQualifierResolutionResult[PropertyDescriptorImpl]

'result' @ [203:21] ==> var result: PossiblyBareType? defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement[LocalVariableDescriptor]

'type' @ [203:30] ==> @NotNull public open fun type(@NotNull actualType: KotlinType): PossiblyBareType defined in org.jetbrains.kotlin.resolve.PossiblyBareType[JavaMethodDescriptor]

'createUnresolvedType' @ [203:46] ==> @NotNull public open fun createUnresolvedType(@NotNull p0: String, @NotNull p1: (MutableList<(TypeProjection..TypeProjection?)>..List<(TypeProjection..TypeProjection?)>)): SimpleType defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'type' @ [203:67] ==> value-parameter type: KtUserType defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.visitUserType[ValueParameterDescriptorImpl]

'getDebugText' @ [203:72] ==> public fun KtElement.getDebugText(): String defined in org.jetbrains.kotlin.psi.debugText in file DebugTextUtil.kt[SimpleFunctionDescriptorImpl]

'arguments' @ [203:88] ==> val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.visitUserType[LocalVariableDescriptor]

'type' @ [207:43] ==> value-parameter type: KtUserType defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.visitUserType[ValueParameterDescriptorImpl]

'referenceExpression' @ [207:48] ==> public final val KtUserType.referenceExpression: KtSimpleNameExpression?[MyPropertyDescriptor]

'checkReservedYield' @ [209:17] ==> public fun checkReservedYield(expression: KtSimpleNameExpression?, sink: DiagnosticSink): Unit defined in org.jetbrains.kotlin.psi.psiUtil in file ktPsiUtil.kt[SimpleFunctionDescriptorImpl]

'referenceExpression' @ [209:36] ==> val referenceExpression: KtSimpleNameExpression defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.visitUserType[LocalVariableDescriptor]

'c' @ [209:57] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement[ValueParameterDescriptorImpl]

'trace' @ [209:59] ==> public final val trace: (BindingTrace..BindingTrace?) defined in org.jetbrains.kotlin.resolve.TypeResolutionContext[JavaPropertyDescriptor]

'c' @ [210:17] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement[ValueParameterDescriptorImpl]

'trace' @ [210:19] ==> public final val trace: (BindingTrace..BindingTrace?) defined in org.jetbrains.kotlin.resolve.TypeResolutionContext[JavaPropertyDescriptor]

'record' @ [210:25] ==> public abstract fun <K : (Any..Any?), V : (Any..Any?)> record(slice: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?), key: (KtReferenceExpression..KtReferenceExpression?), value: (DeclarationDescriptor..DeclarationDescriptor?)): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtReferenceExpression
    <V : (Any..Any?)> -> DeclarationDescriptor

'REFERENCE_TARGET' @ [210:47] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'referenceExpression' @ [210:65] ==> val referenceExpression: KtSimpleNameExpression defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.visitUserType[LocalVariableDescriptor]

'classifier' @ [210:86] ==> val classifier: ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.visitUserType[LocalVariableDescriptor]

'result' @ [212:17] ==> var result: PossiblyBareType? defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement[LocalVariableDescriptor]

'resolveTypeForClassifier' @ [212:26] ==> public final fun resolveTypeForClassifier(c: TypeResolutionContext, descriptor: ClassifierDescriptor, qualifierResolutionResult: QualifiedExpressionResolver.TypeQualifierResolutionResult, element: KtElement, annotations: Annotations): PossiblyBareType defined in org.jetbrains.kotlin.resolve.TypeResolver[SimpleFunctionDescriptorImpl]

'c' @ [212:51] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement[ValueParameterDescriptorImpl]

'classifier' @ [212:54] ==> val classifier: ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.visitUserType[LocalVariableDescriptor]

'qualifierResolutionResult' @ [212:66] ==> val qualifierResolutionResult: QualifiedExpressionResolver.TypeQualifierResolutionResult defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.visitUserType[LocalVariableDescriptor]

'type' @ [212:93] ==> value-parameter type: KtUserType defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.visitUserType[ValueParameterDescriptorImpl]

'annotations' @ [212:99] ==> value-parameter annotations: Annotations defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement[ValueParameterDescriptorImpl]

'nullableType' @ [216:41] ==> value-parameter nullableType: KtNullableType defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.visitNullableType[ValueParameterDescriptorImpl]

'modifierList' @ [216:54] ==> public final val KtNullableType.modifierList: KtModifierList?[MyPropertyDescriptor]

'innerModifierList' @ [217:21] ==> val innerModifierList: KtModifierList? defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.visitNullableType[LocalVariableDescriptor]

'outerModifierList' @ [217:50] ==> value-parameter outerModifierList: KtModifierList? defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement[ValueParameterDescriptorImpl]

'c' @ [218:21] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement[ValueParameterDescriptorImpl]

'trace' @ [218:23] ==> public final val trace: (BindingTrace..BindingTrace?) defined in org.jetbrains.kotlin.resolve.TypeResolutionContext[JavaPropertyDescriptor]

'report' @ [218:29] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'MODIFIER_LIST_NOT_ALLOWED' @ [218:36] ==> public final val MODIFIER_LIST_NOT_ALLOWED: (DiagnosticFactory0<(KtModifierList..KtModifierList?)>..DiagnosticFactory0<(KtModifierList..KtModifierList?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [218:62] ==> @NotNull public open fun on(@NotNull element: KtModifierList): SimpleDiagnostic<(KtModifierList..KtModifierList?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'innerModifierList' @ [218:65] ==> val innerModifierList: KtModifierList? defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.visitNullableType[LocalVariableDescriptor]

'composeAnnotations' @ [221:40] ==> public fun composeAnnotations(first: Annotations, second: Annotations): Annotations defined in org.jetbrains.kotlin.descriptors.annotations[DeserializedSimpleFunctionDescriptor]

'annotations' @ [221:59] ==> value-parameter annotations: Annotations defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement[ValueParameterDescriptorImpl]

'resolveTypeAnnotations' @ [221:72] ==> private final fun resolveTypeAnnotations(c: TypeResolutionContext, modifierListsOwner: KtElementImplStub<*>): Annotations defined in org.jetbrains.kotlin.resolve.TypeResolver[SimpleFunctionDescriptorImpl]

'c' @ [221:95] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement[ValueParameterDescriptorImpl]

'nullableType' @ [221:98] ==> value-parameter nullableType: KtNullableType defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.visitNullableType[ValueParameterDescriptorImpl]

'nullableType' @ [223:33] ==> value-parameter nullableType: KtNullableType defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.visitNullableType[ValueParameterDescriptorImpl]

'innerType' @ [223:46] ==> public final val KtNullableType.innerType: KtTypeElement?[MyPropertyDescriptor]

'resolveTypeElement' @ [224:32] ==> private final fun resolveTypeElement(c: TypeResolutionContext, annotations: Annotations, outerModifierList: KtModifierList?, typeElement: KtTypeElement?): PossiblyBareType defined in org.jetbrains.kotlin.resolve.TypeResolver[SimpleFunctionDescriptorImpl]

'c' @ [224:51] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement[ValueParameterDescriptorImpl]

'innerAnnotations' @ [224:54] ==> val innerAnnotations: Annotations defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.visitNullableType[LocalVariableDescriptor]

'outerModifierList' @ [224:72] ==> value-parameter outerModifierList: KtModifierList? defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement[ValueParameterDescriptorImpl]

'innerModifierList' @ [224:93] ==> val innerModifierList: KtModifierList? defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.visitNullableType[LocalVariableDescriptor]

'innerType' @ [224:112] ==> val innerType: KtTypeElement? defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.visitNullableType[LocalVariableDescriptor]

'baseType' @ [225:21] ==> val baseType: PossiblyBareType defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.visitNullableType[LocalVariableDescriptor]

'isNullable' @ [225:30] ==> public final val PossiblyBareType.isNullable: Boolean[MyPropertyDescriptor]

'innerType' @ [225:44] ==> val innerType: KtTypeElement? defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.visitNullableType[LocalVariableDescriptor]

'innerType' @ [225:75] ==> val innerType: KtTypeElement? defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.visitNullableType[LocalVariableDescriptor]

'c' @ [226:21] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement[ValueParameterDescriptorImpl]

'trace' @ [226:23] ==> public final val trace: (BindingTrace..BindingTrace?) defined in org.jetbrains.kotlin.resolve.TypeResolutionContext[JavaPropertyDescriptor]

'report' @ [226:29] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'REDUNDANT_NULLABLE' @ [226:36] ==> public final val REDUNDANT_NULLABLE: (DiagnosticFactory0<(KtNullableType..KtNullableType?)>..DiagnosticFactory0<(KtNullableType..KtNullableType?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [226:55] ==> @NotNull public open fun on(@NotNull element: KtNullableType): SimpleDiagnostic<(KtNullableType..KtNullableType?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'nullableType' @ [226:58] ==> value-parameter nullableType: KtNullableType defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.visitNullableType[ValueParameterDescriptorImpl]

'result' @ [228:17] ==> var result: PossiblyBareType? defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement[LocalVariableDescriptor]

'baseType' @ [228:26] ==> val baseType: PossiblyBareType defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.visitNullableType[LocalVariableDescriptor]

'makeNullable' @ [228:35] ==> public open fun makeNullable(): (PossiblyBareType..PossiblyBareType?) defined in org.jetbrains.kotlin.resolve.PossiblyBareType[JavaMethodDescriptor]

'type' @ [232:39] ==> value-parameter type: KtFunctionType defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.visitFunctionType[ValueParameterDescriptorImpl]

'receiverTypeReference' @ [232:44] ==> public final val KtFunctionType.receiverTypeReference: KtTypeReference?[MyPropertyDescriptor]

'if (receiverTypeRef == null) null else resolveType(c.noBareTypes(), receiverTypeRef)' @ [233:36] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinType?, elseBranch: KotlinType?): KotlinType?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinType?

'receiverTypeRef' @ [233:40] ==> val receiverTypeRef: KtTypeReference? defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.visitFunctionType[LocalVariableDescriptor]

'resolveType' @ [233:75] ==> private final fun resolveType(c: TypeResolutionContext, typeReference: KtTypeReference): KotlinType defined in org.jetbrains.kotlin.resolve.TypeResolver[SimpleFunctionDescriptorImpl]

'c' @ [233:87] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement[ValueParameterDescriptorImpl]

'noBareTypes' @ [233:89] ==> @NotNull public open fun noBareTypes(): TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolutionContext[JavaMethodDescriptor]

'receiverTypeRef' @ [233:104] ==> val receiverTypeRef: KtTypeReference? defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.visitFunctionType[LocalVariableDescriptor]

'resolveParametersOfFunctionType' @ [235:44] ==> private final fun resolveParametersOfFunctionType(parameters: List<KtParameter>): List<VariableDescriptor> defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>[SimpleFunctionDescriptorImpl]

'type' @ [235:76] ==> value-parameter type: KtFunctionType defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.visitFunctionType[ValueParameterDescriptorImpl]

'parameters' @ [235:81] ==> public final val KtFunctionType.parameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'checkParametersOfFunctionType' @ [236:17] ==> private final fun checkParametersOfFunctionType(parameterDescriptors: List<VariableDescriptor>): Unit defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>[SimpleFunctionDescriptorImpl]

'parameterDescriptors' @ [236:47] ==> val parameterDescriptors: List<VariableDescriptor> defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.visitFunctionType[LocalVariableDescriptor]

'type' @ [238:37] ==> value-parameter type: KtFunctionType defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.visitFunctionType[ValueParameterDescriptorImpl]

'returnTypeReference' @ [238:42] ==> public final val KtFunctionType.returnTypeReference: KtTypeReference?[MyPropertyDescriptor]

'if (returnTypeRef != null) resolveType(c.noBareTypes(), returnTypeRef)
                                 else moduleDescriptor.builtIns.unitType' @ [239:34] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinType, elseBranch: KotlinType): KotlinType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinType

'returnTypeRef' @ [239:38] ==> val returnTypeRef: KtTypeReference? defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.visitFunctionType[LocalVariableDescriptor]

'resolveType' @ [239:61] ==> private final fun resolveType(c: TypeResolutionContext, typeReference: KtTypeReference): KotlinType defined in org.jetbrains.kotlin.resolve.TypeResolver[SimpleFunctionDescriptorImpl]

'c' @ [239:73] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement[ValueParameterDescriptorImpl]

'noBareTypes' @ [239:75] ==> @NotNull public open fun noBareTypes(): TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolutionContext[JavaMethodDescriptor]

'returnTypeRef' @ [239:90] ==> val returnTypeRef: KtTypeReference? defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.visitFunctionType[LocalVariableDescriptor]

'moduleDescriptor' @ [240:39] ==> private final val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.resolve.TypeResolver[PropertyDescriptorImpl]

'builtIns' @ [240:56] ==> public abstract val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedPropertyDescriptor]

'unitType' @ [240:65] ==> public final val KotlinBuiltIns.unitType: SimpleType[MyPropertyDescriptor]

'result' @ [242:17] ==> var result: PossiblyBareType? defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement[LocalVariableDescriptor]

'type' @ [242:26] ==> @NotNull public open fun type(@NotNull actualType: KotlinType): PossiblyBareType defined in org.jetbrains.kotlin.resolve.PossiblyBareType[JavaMethodDescriptor]

'createFunctionType' @ [242:31] ==> @JvmOverloads public fun createFunctionType(builtIns: KotlinBuiltIns, annotations: Annotations, receiverType: KotlinType?, parameterTypes: List<KotlinType>, parameterNames: List<Name>?, returnType: KotlinType, suspendFunction: Boolean = ...): SimpleType defined in org.jetbrains.kotlin.builtins[DeserializedSimpleFunctionDescriptor]

'moduleDescriptor' @ [243:25] ==> private final val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.resolve.TypeResolver[PropertyDescriptorImpl]

'builtIns' @ [243:42] ==> public abstract val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedPropertyDescriptor]

'annotations' @ [243:52] ==> value-parameter annotations: Annotations defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement[ValueParameterDescriptorImpl]

'receiverType' @ [243:65] ==> val receiverType: KotlinType? defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.visitFunctionType[LocalVariableDescriptor]

'parameterDescriptors' @ [244:25] ==> val parameterDescriptors: List<VariableDescriptor> defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.visitFunctionType[LocalVariableDescriptor]

'map' @ [244:46] ==> public inline fun <T, R> Iterable<VariableDescriptor>.map(transform: (VariableDescriptor) -> KotlinType): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VariableDescriptor
    <R> -> KotlinType

'it' @ [244:52] ==> value-parameter it: VariableDescriptor defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.visitFunctionType.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [244:55] ==> public final val VariableDescriptor.type: KotlinType[MyPropertyDescriptor]

'parameterDescriptors' @ [245:25] ==> val parameterDescriptors: List<VariableDescriptor> defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.visitFunctionType[LocalVariableDescriptor]

'map' @ [245:46] ==> public inline fun <T, R> Iterable<VariableDescriptor>.map(transform: (VariableDescriptor) -> Name): List<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VariableDescriptor
    <R> -> Name

'it' @ [245:52] ==> value-parameter it: VariableDescriptor defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.visitFunctionType.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [245:55] ==> public final val VariableDescriptor.name: Name[MyPropertyDescriptor]

'returnType' @ [246:25] ==> val returnType: KotlinType defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.visitFunctionType[LocalVariableDescriptor]

'hasSuspendModifier' @ [247:43] ==> val hasSuspendModifier: Boolean defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement[LocalVariableDescriptor]

'parameterDescriptors' @ [252:40] ==> value-parameter parameterDescriptors: List<VariableDescriptor> defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.checkParametersOfFunctionType[ValueParameterDescriptorImpl]

'filter' @ [252:61] ==> public inline fun <T> Iterable<VariableDescriptor>.filter(predicate: (VariableDescriptor) -> Boolean): List<VariableDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VariableDescriptor

'!' @ [252:70] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [252:71] ==> value-parameter it: VariableDescriptor defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.checkParametersOfFunctionType.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [252:74] ==> public final val VariableDescriptor.name: Name[MyPropertyDescriptor]

'isSpecial' @ [252:79] ==> public final val Name.isSpecial: Boolean[MyPropertyDescriptor]

'groupBy' @ [252:91] ==> public inline fun <T, K> Iterable<VariableDescriptor>.groupBy(keySelector: (VariableDescriptor) -> Name): Map<Name, List<VariableDescriptor>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VariableDescriptor
    <K> -> Name

'it' @ [252:101] ==> value-parameter it: VariableDescriptor defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.checkParametersOfFunctionType.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [252:104] ==> public final val VariableDescriptor.name: Name[MyPropertyDescriptor]

'parametersByName' @ [253:41] ==> val parametersByName: Map<Name, List<VariableDescriptor>> defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.checkParametersOfFunctionType[LocalVariableDescriptor]

'values' @ [253:58] ==> public abstract val values: Collection<List<VariableDescriptor>> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'parametersGroup' @ [254:25] ==> val parametersGroup: List<VariableDescriptor> defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.checkParametersOfFunctionType[LocalVariableDescriptor]

'size' @ [254:41] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'parametersGroup' @ [255:39] ==> val parametersGroup: List<VariableDescriptor> defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.checkParametersOfFunctionType[LocalVariableDescriptor]

'parameter' @ [256:43] ==> val parameter: VariableDescriptor defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.checkParametersOfFunctionType[LocalVariableDescriptor]

'source' @ [256:53] ==> public final val VariableDescriptor.source: SourceElement[MyPropertyDescriptor]

'getPsi' @ [256:60] ==> public fun SourceElement.getPsi(): PsiElement? defined in org.jetbrains.kotlin.resolve.source in file KotlinSourceElement.kt[SimpleFunctionDescriptorImpl]

'safeAs' @ [256:70] ==> public inline fun <reified T : Any> Any?.safeAs(): KtParameter? defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> KtParameter

'c' @ [257:25] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement[ValueParameterDescriptorImpl]

'trace' @ [257:27] ==> public final val trace: (BindingTrace..BindingTrace?) defined in org.jetbrains.kotlin.resolve.TypeResolutionContext[JavaPropertyDescriptor]

'report' @ [257:33] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'DUPLICATE_PARAMETER_NAME_IN_FUNCTION_TYPE' @ [257:40] ==> public final val DUPLICATE_PARAMETER_NAME_IN_FUNCTION_TYPE: (DiagnosticFactory0<(KtParameter..KtParameter?)>..DiagnosticFactory0<(KtParameter..KtParameter?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [257:82] ==> @NotNull public open fun on(@NotNull element: KtParameter): SimpleDiagnostic<(KtParameter..KtParameter?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'ktParameter' @ [257:85] ==> val ktParameter: KtParameter defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.checkParametersOfFunctionType[LocalVariableDescriptor]

'VariableDescriptorImpl' @ [269:21] ==> public constructor VariableDescriptorImpl(@NotNull p0: DeclarationDescriptor, @NotNull p1: Annotations, @NotNull p2: Name, @Nullable p3: KotlinType?, @NotNull p4: SourceElement) defined in org.jetbrains.kotlin.descriptors.impl.VariableDescriptorImpl[JavaClassConstructorDescriptor]

'containingDeclaration' @ [269:44] ==> value-parameter containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.resolveParametersOfFunctionType.ParameterOfFunctionTypeDescriptor.<init>[ValueParameterDescriptorImpl]

'annotations' @ [269:67] ==> value-parameter annotations: Annotations defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.resolveParametersOfFunctionType.ParameterOfFunctionTypeDescriptor.<init>[ValueParameterDescriptorImpl]

'name' @ [269:80] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.resolveParametersOfFunctionType.ParameterOfFunctionTypeDescriptor.<init>[ValueParameterDescriptorImpl]

'type' @ [269:86] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.resolveParametersOfFunctionType.ParameterOfFunctionTypeDescriptor.<init>[ValueParameterDescriptorImpl]

'source' @ [269:92] ==> value-parameter source: SourceElement defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.resolveParametersOfFunctionType.ParameterOfFunctionTypeDescriptor.<init>[ValueParameterDescriptorImpl]

'LOCAL' @ [270:65] ==> @NotNull public final val LOCAL: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'UnsupportedOperationException' @ [273:31] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'this' @ [273:108] ==> <this> defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.resolveParametersOfFunctionType.ParameterOfFunctionTypeDescriptor[LazyClassReceiverParameterDescriptor]

'java' @ [273:120] ==> public val <T> KClass<out ParameterOfFunctionTypeDescriptor>.java: Class<out ParameterOfFunctionTypeDescriptor> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ParameterOfFunctionTypeDescriptor

'visitor' @ [281:32] ==> value-parameter visitor: DeclarationDescriptorVisitor<R, D> defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.resolveParametersOfFunctionType.ParameterOfFunctionTypeDescriptor.accept[ValueParameterDescriptorImpl]

'visitVariableDescriptor' @ [281:40] ==> public abstract fun visitVariableDescriptor(p0: (VariableDescriptor..VariableDescriptor?), p1: (D..D?)): (R..R?) defined in org.jetbrains.kotlin.descriptors.DeclarationDescriptorVisitor[JavaMethodDescriptor]

'this' @ [281:64] ==> <this> defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.resolveParametersOfFunctionType.ParameterOfFunctionTypeDescriptor[LazyClassReceiverParameterDescriptor]

'data' @ [281:70] ==> value-parameter data: D defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.resolveParametersOfFunctionType.ParameterOfFunctionTypeDescriptor.accept[ValueParameterDescriptorImpl]

'parameters' @ [285:17] ==> value-parameter parameters: List<KtParameter> defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.resolveParametersOfFunctionType[ValueParameterDescriptorImpl]

'forEach' @ [285:28] ==> @HidesMembers public inline fun <T> Iterable<KtParameter>.forEach(action: (KtParameter) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtParameter

'identifierChecker' @ [286:21] ==> private final val identifierChecker: IdentifierChecker defined in org.jetbrains.kotlin.resolve.TypeResolver[PropertyDescriptorImpl]

'checkDeclaration' @ [286:39] ==> public abstract fun checkDeclaration(declaration: KtDeclaration, diagnosticHolder: DiagnosticSink): Unit defined in org.jetbrains.kotlin.resolve.IdentifierChecker[SimpleFunctionDescriptorImpl]

'it' @ [286:56] ==> value-parameter it: KtParameter defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.resolveParametersOfFunctionType.<anonymous>[ValueParameterDescriptorImpl]

'c' @ [286:60] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement[ValueParameterDescriptorImpl]

'trace' @ [286:62] ==> public final val trace: (BindingTrace..BindingTrace?) defined in org.jetbrains.kotlin.resolve.TypeResolutionContext[JavaPropertyDescriptor]

'checkParameterInFunctionType' @ [287:21] ==> private final fun checkParameterInFunctionType(param: KtParameter): Unit defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>[SimpleFunctionDescriptorImpl]

'it' @ [287:50] ==> value-parameter it: KtParameter defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.resolveParametersOfFunctionType.<anonymous>[ValueParameterDescriptorImpl]

'parameters' @ [289:24] ==> value-parameter parameters: List<KtParameter> defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.resolveParametersOfFunctionType[ValueParameterDescriptorImpl]

'map' @ [289:35] ==> public inline fun <T, R> Iterable<KtParameter>.map(transform: (KtParameter) -> ParameterOfFunctionTypeDescriptor): List<ParameterOfFunctionTypeDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtParameter
    <R> -> ParameterOfFunctionTypeDescriptor

'resolveType' @ [290:41] ==> private final fun resolveType(c: TypeResolutionContext, typeReference: KtTypeReference): KotlinType defined in org.jetbrains.kotlin.resolve.TypeResolver[SimpleFunctionDescriptorImpl]

'c' @ [290:53] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement[ValueParameterDescriptorImpl]

'noBareTypes' @ [290:55] ==> @NotNull public open fun noBareTypes(): TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolutionContext[JavaMethodDescriptor]

'parameter' @ [290:70] ==> value-parameter parameter: KtParameter defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.resolveParametersOfFunctionType.<anonymous>[ValueParameterDescriptorImpl]

'typeReference' @ [290:80] ==> public final var KtParameter.typeReference: KtTypeReference?[MyPropertyDescriptor]

'ParameterOfFunctionTypeDescriptor' @ [291:38] ==> public constructor ParameterOfFunctionTypeDescriptor(containingDeclaration: DeclarationDescriptor, annotations: Annotations, name: Name, type: KotlinType, source: SourceElement) defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.resolveParametersOfFunctionType.ParameterOfFunctionTypeDescriptor[ClassConstructorDescriptorImpl]

'c' @ [292:29] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement[ValueParameterDescriptorImpl]

'scope' @ [292:31] ==> public final val scope: (LexicalScope..LexicalScope?) defined in org.jetbrains.kotlin.resolve.TypeResolutionContext[JavaPropertyDescriptor]

'ownerDescriptor' @ [292:37] ==> public abstract val ownerDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.LexicalScope[DeserializedPropertyDescriptor]

'annotationResolver' @ [293:29] ==> private final val annotationResolver: AnnotationResolver defined in org.jetbrains.kotlin.resolve.TypeResolver[PropertyDescriptorImpl]

'resolveAnnotationsWithoutArguments' @ [293:48] ==> public final fun resolveAnnotationsWithoutArguments(scope: LexicalScope, modifierList: KtModifierList?, trace: BindingTrace): Annotations defined in org.jetbrains.kotlin.resolve.AnnotationResolver[SimpleFunctionDescriptorImpl]

'c' @ [293:83] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement[ValueParameterDescriptorImpl]

'scope' @ [293:85] ==> public final val scope: (LexicalScope..LexicalScope?) defined in org.jetbrains.kotlin.resolve.TypeResolutionContext[JavaPropertyDescriptor]

'parameter' @ [293:92] ==> value-parameter parameter: KtParameter defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.resolveParametersOfFunctionType.<anonymous>[ValueParameterDescriptorImpl]

'modifierList' @ [293:102] ==> public final val KtParameter.modifierList: KtModifierList?[MyPropertyDescriptor]

'c' @ [293:116] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement[ValueParameterDescriptorImpl]

'trace' @ [293:118] ==> public final val trace: (BindingTrace..BindingTrace?) defined in org.jetbrains.kotlin.resolve.TypeResolutionContext[JavaPropertyDescriptor]

'parameter' @ [294:29] ==> value-parameter parameter: KtParameter defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.resolveParametersOfFunctionType.<anonymous>[ValueParameterDescriptorImpl]

'nameAsSafeName' @ [294:39] ==> public final val KtParameter.nameAsSafeName: Name[MyPropertyDescriptor]

'parameterType' @ [295:29] ==> val parameterType: KotlinType defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.resolveParametersOfFunctionType.<anonymous>[LocalVariableDescriptor]

'parameter' @ [296:29] ==> value-parameter parameter: KtParameter defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.resolveParametersOfFunctionType.<anonymous>[ValueParameterDescriptorImpl]

'toSourceElement' @ [296:39] ==> public fun KtPureElement?.toSourceElement(): SourceElement defined in org.jetbrains.kotlin.resolve.source in file KotlinSourceElement.kt[SimpleFunctionDescriptorImpl]

'c' @ [298:21] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement[ValueParameterDescriptorImpl]

'trace' @ [298:23] ==> public final val trace: (BindingTrace..BindingTrace?) defined in org.jetbrains.kotlin.resolve.TypeResolutionContext[JavaPropertyDescriptor]

'record' @ [298:29] ==> public abstract fun <K : (Any..Any?), V : (Any..Any?)> record(slice: (WritableSlice<(KtParameter..KtParameter?), (VariableDescriptor..VariableDescriptor?)>..WritableSlice<(KtParameter..KtParameter?), (VariableDescriptor..VariableDescriptor?)>?), key: (KtParameter..KtParameter?), value: (VariableDescriptor..VariableDescriptor?)): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtParameter
    <V : (Any..Any?)> -> VariableDescriptor

'VALUE_PARAMETER' @ [298:51] ==> public final val VALUE_PARAMETER: (WritableSlice<(KtParameter..KtParameter?), (VariableDescriptor..VariableDescriptor?)>..WritableSlice<(KtParameter..KtParameter?), (VariableDescriptor..VariableDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'parameter' @ [298:68] ==> value-parameter parameter: KtParameter defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.resolveParametersOfFunctionType.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [298:79] ==> val descriptor: ParameterOfFunctionTypeDescriptor defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.resolveParametersOfFunctionType.<anonymous>[LocalVariableDescriptor]

'descriptor' @ [299:21] ==> val descriptor: ParameterOfFunctionTypeDescriptor defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.resolveParametersOfFunctionType.<anonymous>[LocalVariableDescriptor]

'result' @ [304:17] ==> var result: PossiblyBareType? defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement[LocalVariableDescriptor]

'type' @ [304:26] ==> @NotNull public open fun type(@NotNull actualType: KotlinType): PossiblyBareType defined in org.jetbrains.kotlin.resolve.PossiblyBareType[JavaMethodDescriptor]

'dynamicCallableDescriptors' @ [304:31] ==> private final val dynamicCallableDescriptors: DynamicCallableDescriptors defined in org.jetbrains.kotlin.resolve.TypeResolver[PropertyDescriptorImpl]

'dynamicType' @ [304:58] ==> public final val dynamicType: DynamicType defined in org.jetbrains.kotlin.resolve.calls.tasks.DynamicCallableDescriptors[PropertyDescriptorImpl]

'replaceAnnotations' @ [304:70] ==> public open fun replaceAnnotations(newAnnotations: Annotations): DynamicType defined in org.jetbrains.kotlin.types.DynamicType[DeserializedSimpleFunctionDescriptor]

'annotations' @ [304:89] ==> value-parameter annotations: Annotations defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement[ValueParameterDescriptorImpl]

'!' @ [305:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'dynamicTypesSettings' @ [305:22] ==> private final val dynamicTypesSettings: DynamicTypesSettings defined in org.jetbrains.kotlin.resolve.TypeResolver[PropertyDescriptorImpl]

'dynamicTypesAllowed' @ [305:43] ==> public open val dynamicTypesAllowed: Boolean defined in org.jetbrains.kotlin.types.DynamicTypesSettings[DeserializedPropertyDescriptor]

'c' @ [306:21] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement[ValueParameterDescriptorImpl]

'trace' @ [306:23] ==> public final val trace: (BindingTrace..BindingTrace?) defined in org.jetbrains.kotlin.resolve.TypeResolutionContext[JavaPropertyDescriptor]

'report' @ [306:29] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'UNSUPPORTED' @ [306:36] ==> public final val UNSUPPORTED: (DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [306:48] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull argument: String): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'type' @ [306:51] ==> value-parameter type: KtDynamicType defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.visitDynamicType[ValueParameterDescriptorImpl]

'c' @ [311:17] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement[ValueParameterDescriptorImpl]

'trace' @ [311:19] ==> public final val trace: (BindingTrace..BindingTrace?) defined in org.jetbrains.kotlin.resolve.TypeResolutionContext[JavaPropertyDescriptor]

'report' @ [311:25] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'UNSUPPORTED' @ [311:32] ==> public final val UNSUPPORTED: (DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [311:44] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull argument: String): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'type' @ [311:47] ==> value-parameter type: KtSelfType defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.visitSelfType[ValueParameterDescriptorImpl]

'c' @ [315:17] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement[ValueParameterDescriptorImpl]

'trace' @ [315:19] ==> public final val trace: (BindingTrace..BindingTrace?) defined in org.jetbrains.kotlin.resolve.TypeResolutionContext[JavaPropertyDescriptor]

'report' @ [315:25] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'UNSUPPORTED' @ [315:32] ==> public final val UNSUPPORTED: (DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [315:44] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull argument: String): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'element' @ [315:47] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.visitKtElement[ValueParameterDescriptorImpl]

'param' @ [319:21] ==> value-parameter param: KtParameter defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.checkParameterInFunctionType[ValueParameterDescriptorImpl]

'hasDefaultValue' @ [319:27] ==> public open fun hasDefaultValue(): Boolean defined in org.jetbrains.kotlin.psi.KtParameter[JavaMethodDescriptor]

'c' @ [320:21] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement[ValueParameterDescriptorImpl]

'trace' @ [320:23] ==> public final val trace: (BindingTrace..BindingTrace?) defined in org.jetbrains.kotlin.resolve.TypeResolutionContext[JavaPropertyDescriptor]

'report' @ [320:29] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'UNSUPPORTED' @ [320:43] ==> public final val UNSUPPORTED: (DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [320:55] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull argument: String): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'param' @ [320:58] ==> value-parameter param: KtParameter defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.checkParameterInFunctionType[ValueParameterDescriptorImpl]

'defaultValue' @ [320:64] ==> public final val KtParameter.defaultValue: KtExpression?[MyPropertyDescriptor]

'param' @ [323:21] ==> value-parameter param: KtParameter defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.checkParameterInFunctionType[ValueParameterDescriptorImpl]

'name' @ [323:27] ==> public final val KtParameter.name: String?[MyPropertyDescriptor]

'param' @ [324:45] ==> value-parameter param: KtParameter defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.checkParameterInFunctionType[ValueParameterDescriptorImpl]

'annotationEntries' @ [324:51] ==> public final val KtParameter.annotationEntries: (MutableList<(KtAnnotationEntry..KtAnnotationEntry?)>..List<(KtAnnotationEntry..KtAnnotationEntry?)>)[MyPropertyDescriptor]

'c' @ [325:25] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement[ValueParameterDescriptorImpl]

'trace' @ [325:27] ==> public final val trace: (BindingTrace..BindingTrace?) defined in org.jetbrains.kotlin.resolve.TypeResolutionContext[JavaPropertyDescriptor]

'report' @ [325:33] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'UNSUPPORTED' @ [325:47] ==> public final val UNSUPPORTED: (DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [325:59] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull argument: String): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'annotationEntry' @ [325:62] ==> val annotationEntry: (KtAnnotationEntry..KtAnnotationEntry?) defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.checkParameterInFunctionType[LocalVariableDescriptor]

'param' @ [329:36] ==> value-parameter param: KtParameter defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.checkParameterInFunctionType[ValueParameterDescriptorImpl]

'modifierList' @ [329:42] ==> public final val KtParameter.modifierList: KtModifierList?[MyPropertyDescriptor]

'modifierList' @ [330:21] ==> val modifierList: KtModifierList? defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.checkParameterInFunctionType[LocalVariableDescriptor]

'MODIFIER_KEYWORDS_ARRAY' @ [331:30] ==> public final val MODIFIER_KEYWORDS_ARRAY: (Array<(KtModifierKeywordToken..KtModifierKeywordToken?)>..Array<out (KtModifierKeywordToken..KtModifierKeywordToken?)>?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'mapNotNull' @ [332:30] ==> public inline fun <T, R : Any> Array<out (KtModifierKeywordToken..KtModifierKeywordToken?)>.mapNotNull(transform: ((KtModifierKeywordToken..KtModifierKeywordToken?)) -> PsiElement?): List<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.lexer.KtModifierKeywordToken..org.jetbrains.kotlin.lexer.KtModifierKeywordToken?)
    <R : Any> -> PsiElement

'modifierList' @ [332:43] ==> val modifierList: KtModifierList? defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.checkParameterInFunctionType[LocalVariableDescriptor]

'getModifier' @ [332:56] ==> @Nullable public open fun getModifier(@NotNull tokenType: KtModifierKeywordToken): PsiElement? defined in org.jetbrains.kotlin.psi.KtModifierList[JavaMethodDescriptor]

'it' @ [332:68] ==> value-parameter it: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.checkParameterInFunctionType.<anonymous>[ValueParameterDescriptorImpl]

'forEach' @ [333:30] ==> @HidesMembers public inline fun <T> Iterable<PsiElement>.forEach(action: (PsiElement) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'c' @ [333:40] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement[ValueParameterDescriptorImpl]

'trace' @ [333:42] ==> public final val trace: (BindingTrace..BindingTrace?) defined in org.jetbrains.kotlin.resolve.TypeResolutionContext[JavaPropertyDescriptor]

'report' @ [333:48] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'UNSUPPORTED' @ [333:62] ==> public final val UNSUPPORTED: (DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [333:74] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull argument: String): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'it' @ [333:77] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.checkParameterInFunctionType.<anonymous>[ValueParameterDescriptorImpl]

'param' @ [337:17] ==> value-parameter param: KtParameter defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.checkParameterInFunctionType[ValueParameterDescriptorImpl]

'valOrVarKeyword' @ [337:23] ==> public final val KtParameter.valOrVarKeyword: PsiElement?[MyPropertyDescriptor]

'let' @ [337:40] ==> @InlineOnly public inline fun <T, R> PsiElement.let(block: (PsiElement) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> Unit

'c' @ [338:21] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement[ValueParameterDescriptorImpl]

'trace' @ [338:23] ==> public final val trace: (BindingTrace..BindingTrace?) defined in org.jetbrains.kotlin.resolve.TypeResolutionContext[JavaPropertyDescriptor]

'report' @ [338:29] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'UNSUPPORTED' @ [338:43] ==> public final val UNSUPPORTED: (DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [338:55] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull argument: String): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'it' @ [338:58] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement.<no name provided>.checkParameterInFunctionType.<anonymous>[ValueParameterDescriptorImpl]

'result' @ [343:16] ==> var result: PossiblyBareType? defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement[LocalVariableDescriptor]

'type' @ [343:26] ==> @NotNull public open fun type(@NotNull actualType: KotlinType): PossiblyBareType defined in org.jetbrains.kotlin.resolve.PossiblyBareType[JavaMethodDescriptor]

'createErrorType' @ [343:42] ==> @NotNull public open fun createErrorType(@NotNull p0: String): SimpleType defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'typeElement' @ [343:58] ==> value-parameter typeElement: KtTypeElement? defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement[ValueParameterDescriptorImpl]

'getDebugText' @ [343:71] ==> public fun KtElement.getDebugText(): String defined in org.jetbrains.kotlin.psi.debugText in file DebugTextUtil.kt[SimpleFunctionDescriptorImpl]

'this' @ [347:13] ==> <this> defined in org.jetbrains.kotlin.resolve.TypeResolver.canHaveFunctionTypeModifiers[ReceiverParameterDescriptorImpl]

'getScopeForTypeParameter' @ [355:37] ==> private final fun getScopeForTypeParameter(c: TypeResolutionContext, typeParameterDescriptor: TypeParameterDescriptor): MemberScope defined in org.jetbrains.kotlin.resolve.TypeResolver[SimpleFunctionDescriptorImpl]

'c' @ [355:62] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeParameter[ValueParameterDescriptorImpl]

'typeParameter' @ [355:65] ==> value-parameter typeParameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeParameter[ValueParameterDescriptorImpl]

'typeArgumentList' @ [357:13] ==> value-parameter typeArgumentList: KtTypeArgumentList? defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeParameter[ValueParameterDescriptorImpl]

'resolveTypeProjections' @ [358:13] ==> public final fun resolveTypeProjections(c: TypeResolutionContext, constructor: TypeConstructor, argumentElements: List<KtTypeProjection>): List<TypeProjection> defined in org.jetbrains.kotlin.resolve.TypeResolver[SimpleFunctionDescriptorImpl]

'c' @ [358:36] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeParameter[ValueParameterDescriptorImpl]

'createErrorType' @ [358:50] ==> @NotNull public open fun createErrorType(@NotNull p0: String): SimpleType defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'constructor' @ [358:77] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.SimpleType[DeserializedPropertyDescriptor]

'typeArgumentList' @ [358:90] ==> value-parameter typeArgumentList: KtTypeArgumentList? defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeParameter[ValueParameterDescriptorImpl]

'arguments' @ [358:107] ==> public final val KtTypeArgumentList.arguments: (MutableList<(KtTypeProjection..KtTypeProjection?)>..List<(KtTypeProjection..KtTypeProjection?)>)[MyPropertyDescriptor]

'c' @ [359:13] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeParameter[ValueParameterDescriptorImpl]

'trace' @ [359:15] ==> public final val trace: (BindingTrace..BindingTrace?) defined in org.jetbrains.kotlin.resolve.TypeResolutionContext[JavaPropertyDescriptor]

'report' @ [359:21] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'TYPE_ARGUMENTS_NOT_ALLOWED' @ [359:28] ==> public final val TYPE_ARGUMENTS_NOT_ALLOWED: (DiagnosticFactory1<(KtElement..KtElement?), (String..String?)>..DiagnosticFactory1<(KtElement..KtElement?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [359:55] ==> @NotNull public open fun on(@NotNull element: KtElement, @NotNull argument: String): ParametrizedDiagnostic<(KtElement..KtElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'typeArgumentList' @ [359:58] ==> value-parameter typeArgumentList: KtTypeArgumentList? defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeParameter[ValueParameterDescriptorImpl]

'typeParameter' @ [362:26] ==> value-parameter typeParameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeParameter[ValueParameterDescriptorImpl]

'containingDeclaration' @ [362:40] ==> public final val TypeParameterDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'containing' @ [363:13] ==> val containing: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeParameter[LocalVariableDescriptor]

'checkHasOuterClassInstance' @ [364:32] ==> public open fun checkHasOuterClassInstance(@NotNull scope: LexicalScope, @NotNull trace: BindingTrace, @NotNull reportErrorsOn: PsiElement, @NotNull target: ClassDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorResolver[JavaMethodDescriptor]

'c' @ [364:59] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeParameter[ValueParameterDescriptorImpl]

'scope' @ [364:61] ==> public final val scope: (LexicalScope..LexicalScope?) defined in org.jetbrains.kotlin.resolve.TypeResolutionContext[JavaPropertyDescriptor]

'c' @ [364:68] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeParameter[ValueParameterDescriptorImpl]

'trace' @ [364:70] ==> public final val trace: (BindingTrace..BindingTrace?) defined in org.jetbrains.kotlin.resolve.TypeResolutionContext[JavaPropertyDescriptor]

'referenceExpression' @ [364:77] ==> value-parameter referenceExpression: KtSimpleNameExpression defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeParameter[ValueParameterDescriptorImpl]

'containing' @ [364:98] ==> val containing: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeParameter[LocalVariableDescriptor]

'if (scopeForTypeParameter is ErrorUtils.ErrorScope)
            ErrorUtils.createErrorType("?")
        else
            KotlinTypeFactory.simpleType(annotations,
                                         typeParameter.typeConstructor,
                                         listOf(),
                                         false,
                                         scopeForTypeParameter)' @ [367:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinType, elseBranch: KotlinType): KotlinType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinType

'scopeForTypeParameter' @ [367:20] ==> val scopeForTypeParameter: MemberScope defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeParameter[LocalVariableDescriptor]

'createErrorType' @ [368:24] ==> @NotNull public open fun createErrorType(@NotNull p0: String): SimpleType defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'KotlinTypeFactory' @ [370:13] ==> public object KotlinTypeFactory defined in org.jetbrains.kotlin.types[FakeCallableDescriptorForObject]

'simpleType' @ [370:31] ==> @JvmStatic public final fun simpleType(annotations: Annotations, constructor: TypeConstructor, arguments: List<TypeProjection>, nullable: Boolean, memberScope: MemberScope): SimpleType defined in org.jetbrains.kotlin.types.KotlinTypeFactory[DeserializedSimpleFunctionDescriptor]

'annotations' @ [370:42] ==> value-parameter annotations: Annotations defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeParameter[ValueParameterDescriptorImpl]

'typeParameter' @ [371:42] ==> value-parameter typeParameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeParameter[ValueParameterDescriptorImpl]

'typeConstructor' @ [371:56] ==> public final val TypeParameterDescriptor.typeConstructor: TypeConstructor[MyPropertyDescriptor]

'listOf' @ [372:42] ==> @InlineOnly public inline fun <T> listOf(): List<TypeProjection> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection

'scopeForTypeParameter' @ [374:42] ==> val scopeForTypeParameter: MemberScope defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeParameter[LocalVariableDescriptor]

'when {
            c.checkBounds -> TypeIntersector.getUpperBoundsAsType(typeParameterDescriptor).memberScope
            else -> LazyScopeAdapter(LockBasedStorageManager.NO_LOCKS.createLazyValue {
                TypeIntersector.getUpperBoundsAsType(typeParameterDescriptor).memberScope
            })
        }' @ [378:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: MemberScope, entry1: MemberScope): MemberScope[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> MemberScope

'c' @ [379:13] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.getScopeForTypeParameter[ValueParameterDescriptorImpl]

'checkBounds' @ [379:15] ==> public final val checkBounds: Boolean defined in org.jetbrains.kotlin.resolve.TypeResolutionContext[JavaPropertyDescriptor]

'getUpperBoundsAsType' @ [379:46] ==> @NotNull public open fun getUpperBoundsAsType(@NotNull descriptor: TypeParameterDescriptor): KotlinType defined in org.jetbrains.kotlin.types.TypeIntersector[JavaMethodDescriptor]

'typeParameterDescriptor' @ [379:67] ==> value-parameter typeParameterDescriptor: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.TypeResolver.getScopeForTypeParameter[ValueParameterDescriptorImpl]

'memberScope' @ [379:92] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'LazyScopeAdapter' @ [380:21] ==> public constructor LazyScopeAdapter(scope: NotNullLazyValue<MemberScope>) defined in org.jetbrains.kotlin.resolve.scopes.LazyScopeAdapter[DeserializedClassConstructorDescriptor]

'NO_LOCKS' @ [380:62] ==> public final val NO_LOCKS: (StorageManager..StorageManager?) defined in org.jetbrains.kotlin.storage.LockBasedStorageManager[JavaPropertyDescriptor]

'createLazyValue' @ [380:71] ==> public abstract fun <T : Any> createLazyValue(computable: () -> MemberScope): NotNullLazyValue<MemberScope> defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> MemberScope

'getUpperBoundsAsType' @ [381:33] ==> @NotNull public open fun getUpperBoundsAsType(@NotNull descriptor: TypeParameterDescriptor): KotlinType defined in org.jetbrains.kotlin.types.TypeIntersector[JavaMethodDescriptor]

'typeParameterDescriptor' @ [381:54] ==> value-parameter typeParameterDescriptor: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.TypeResolver.getScopeForTypeParameter[ValueParameterDescriptorImpl]

'memberScope' @ [381:79] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'qualifierResolutionResult' @ [393:30] ==> value-parameter qualifierResolutionResult: QualifiedExpressionResolver.TypeQualifierResolutionResult defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClassifier[ValueParameterDescriptorImpl]

'qualifierParts' @ [393:56] ==> public final val qualifierParts: List<QualifiedExpressionResolver.QualifierPart> defined in org.jetbrains.kotlin.resolve.QualifiedExpressionResolver.TypeQualifierResolutionResult[PropertyDescriptorImpl]

'when (descriptor) {
            is TypeParameterDescriptor -> {
                assert(qualifierParts.size == 1) {
                    "Type parameter can be resolved only by it's short name, but '${element.text}' is contradiction " +
                    "with ${qualifierParts.size} qualifier parts"
                }

                val qualifierPart = qualifierParts.single()
                type(resolveTypeForTypeParameter(c, annotations, descriptor, qualifierPart.expression, qualifierPart.typeArguments))
            }
            is ClassDescriptor -> resolveTypeForClass(c, annotations, descriptor, element, qualifierResolutionResult)
            is TypeAliasDescriptor -> resolveTypeForTypeAlias(c, annotations, descriptor, element, qualifierResolutionResult)
            else -> error("Unexpected classifier type: ${descriptor::class.java}")
        }' @ [395:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PossiblyBareType, entry1: PossiblyBareType, entry2: PossiblyBareType, entry3: PossiblyBareType): PossiblyBareType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PossiblyBareType

'descriptor' @ [395:22] ==> value-parameter descriptor: ClassifierDescriptor defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClassifier[ValueParameterDescriptorImpl]

'assert' @ [397:17] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'qualifierParts' @ [397:24] ==> val qualifierParts: List<QualifiedExpressionResolver.QualifierPart> defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClassifier[LocalVariableDescriptor]

'size' @ [397:39] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'+' @ [398:21] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'element' @ [398:85] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClassifier[ValueParameterDescriptorImpl]

'text' @ [398:93] ==> public final val KtElement.text: (String..String?)[MyPropertyDescriptor]

'qualifierParts' @ [399:29] ==> val qualifierParts: List<QualifiedExpressionResolver.QualifierPart> defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClassifier[LocalVariableDescriptor]

'size' @ [399:44] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'qualifierParts' @ [402:37] ==> val qualifierParts: List<QualifiedExpressionResolver.QualifierPart> defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClassifier[LocalVariableDescriptor]

'single' @ [402:52] ==> public fun <T> List<QualifiedExpressionResolver.QualifierPart>.single(): QualifiedExpressionResolver.QualifierPart defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> QualifierPart

'type' @ [403:17] ==> @NotNull public open fun type(@NotNull actualType: KotlinType): PossiblyBareType defined in org.jetbrains.kotlin.resolve.PossiblyBareType[JavaMethodDescriptor]

'resolveTypeForTypeParameter' @ [403:22] ==> private final fun resolveTypeForTypeParameter(c: TypeResolutionContext, annotations: Annotations, typeParameter: TypeParameterDescriptor, referenceExpression: KtSimpleNameExpression, typeArgumentList: KtTypeArgumentList?): KotlinType defined in org.jetbrains.kotlin.resolve.TypeResolver[SimpleFunctionDescriptorImpl]

'c' @ [403:50] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClassifier[ValueParameterDescriptorImpl]

'annotations' @ [403:53] ==> value-parameter annotations: Annotations defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClassifier[ValueParameterDescriptorImpl]

'descriptor' @ [403:66] ==> value-parameter descriptor: ClassifierDescriptor defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClassifier[ValueParameterDescriptorImpl]

'qualifierPart' @ [403:78] ==> val qualifierPart: QualifiedExpressionResolver.QualifierPart defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClassifier[LocalVariableDescriptor]

'expression' @ [403:92] ==> public final val expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.resolve.QualifiedExpressionResolver.QualifierPart[PropertyDescriptorImpl]

'qualifierPart' @ [403:104] ==> val qualifierPart: QualifiedExpressionResolver.QualifierPart defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClassifier[LocalVariableDescriptor]

'typeArguments' @ [403:118] ==> public final val typeArguments: KtTypeArgumentList? defined in org.jetbrains.kotlin.resolve.QualifiedExpressionResolver.QualifierPart[PropertyDescriptorImpl]

'resolveTypeForClass' @ [405:35] ==> private final fun resolveTypeForClass(c: TypeResolutionContext, annotations: Annotations, classDescriptor: ClassDescriptor, element: KtElement, qualifierResolutionResult: QualifiedExpressionResolver.TypeQualifierResolutionResult): PossiblyBareType defined in org.jetbrains.kotlin.resolve.TypeResolver[SimpleFunctionDescriptorImpl]

'c' @ [405:55] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClassifier[ValueParameterDescriptorImpl]

'annotations' @ [405:58] ==> value-parameter annotations: Annotations defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClassifier[ValueParameterDescriptorImpl]

'descriptor' @ [405:71] ==> value-parameter descriptor: ClassifierDescriptor defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClassifier[ValueParameterDescriptorImpl]

'element' @ [405:83] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClassifier[ValueParameterDescriptorImpl]

'qualifierResolutionResult' @ [405:92] ==> value-parameter qualifierResolutionResult: QualifiedExpressionResolver.TypeQualifierResolutionResult defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClassifier[ValueParameterDescriptorImpl]

'resolveTypeForTypeAlias' @ [406:39] ==> private final fun resolveTypeForTypeAlias(c: TypeResolutionContext, annotations: Annotations, descriptor: TypeAliasDescriptor, type: KtElement, qualifierResolutionResult: QualifiedExpressionResolver.TypeQualifierResolutionResult): PossiblyBareType defined in org.jetbrains.kotlin.resolve.TypeResolver[SimpleFunctionDescriptorImpl]

'c' @ [406:63] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClassifier[ValueParameterDescriptorImpl]

'annotations' @ [406:66] ==> value-parameter annotations: Annotations defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClassifier[ValueParameterDescriptorImpl]

'descriptor' @ [406:79] ==> value-parameter descriptor: ClassifierDescriptor defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClassifier[ValueParameterDescriptorImpl]

'element' @ [406:91] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClassifier[ValueParameterDescriptorImpl]

'qualifierResolutionResult' @ [406:100] ==> value-parameter qualifierResolutionResult: QualifiedExpressionResolver.TypeQualifierResolutionResult defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClassifier[ValueParameterDescriptorImpl]

'error' @ [407:21] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [407:58] ==> value-parameter descriptor: ClassifierDescriptor defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClassifier[ValueParameterDescriptorImpl]

'java' @ [407:76] ==> public val <T> KClass<out ClassifierDescriptor>.java: Class<out ClassifierDescriptor> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ClassifierDescriptor

'classDescriptor' @ [416:31] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClass[ValueParameterDescriptorImpl]

'typeConstructor' @ [416:47] ==> public final val ClassDescriptor.typeConstructor: TypeConstructor[MyPropertyDescriptor]

'qualifierResolutionResult' @ [418:47] ==> value-parameter qualifierResolutionResult: QualifiedExpressionResolver.TypeQualifierResolutionResult defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClass[ValueParameterDescriptorImpl]

'allProjections' @ [418:73] ==> public final val allProjections: List<KtTypeProjection> defined in org.jetbrains.kotlin.resolve.QualifiedExpressionResolver.TypeQualifierResolutionResult[PropertyDescriptorImpl]

'typeConstructor' @ [419:26] ==> val typeConstructor: TypeConstructor defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClass[LocalVariableDescriptor]

'parameters' @ [419:42] ==> public final val TypeConstructor.parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'c' @ [420:13] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClass[ValueParameterDescriptorImpl]

'allowBareTypes' @ [420:15] ==> public final val allowBareTypes: Boolean defined in org.jetbrains.kotlin.resolve.TypeResolutionContext[JavaPropertyDescriptor]

'projectionFromAllQualifierParts' @ [420:33] ==> val projectionFromAllQualifierParts: List<KtTypeProjection> defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClass[LocalVariableDescriptor]

'isEmpty' @ [420:65] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'isPossibleToSpecifyTypeArgumentsFor' @ [420:78] ==> private final fun isPossibleToSpecifyTypeArgumentsFor(classifierDescriptor: ClassifierDescriptorWithTypeParameters): Boolean defined in org.jetbrains.kotlin.resolve.TypeResolver[SimpleFunctionDescriptorImpl]

'classDescriptor' @ [420:114] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClass[ValueParameterDescriptorImpl]

'bare' @ [422:37] ==> @NotNull public open fun bare(@NotNull bareTypeConstructor: TypeConstructor, nullable: Boolean): PossiblyBareType defined in org.jetbrains.kotlin.resolve.PossiblyBareType[JavaMethodDescriptor]

'typeConstructor' @ [422:42] ==> val typeConstructor: TypeConstructor defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClass[LocalVariableDescriptor]

'isError' @ [425:24] ==> public open fun isError(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'classDescriptor' @ [425:32] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClass[ValueParameterDescriptorImpl]

'createErrorTypeForTypeConstructor' @ [426:20] ==> private final fun createErrorTypeForTypeConstructor(c: TypeResolutionContext, arguments: List<KtTypeProjection>, typeConstructor: TypeConstructor): PossiblyBareType defined in org.jetbrains.kotlin.resolve.TypeResolver[SimpleFunctionDescriptorImpl]

'c' @ [426:54] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClass[ValueParameterDescriptorImpl]

'projectionFromAllQualifierParts' @ [426:57] ==> val projectionFromAllQualifierParts: List<KtTypeProjection> defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClass[LocalVariableDescriptor]

'typeConstructor' @ [426:90] ==> val typeConstructor: TypeConstructor defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClass[LocalVariableDescriptor]

'component1' @ [429:14] ==> public final operator fun component1(): List<KtTypeProjection> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [429:50] ==> public final operator fun component2(): List<TypeProjection>? defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'collectArgumentsForClassifierTypeConstructor' @ [430:17] ==> private final fun collectArgumentsForClassifierTypeConstructor(c: TypeResolutionContext, classifierDescriptor: ClassifierDescriptorWithTypeParameters, qualifierParts: List<QualifiedExpressionResolver.QualifierPart>): Pair<List<KtTypeProjection>, List<TypeProjection>?>? defined in org.jetbrains.kotlin.resolve.TypeResolver[SimpleFunctionDescriptorImpl]

'c' @ [430:62] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClass[ValueParameterDescriptorImpl]

'classDescriptor' @ [430:65] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClass[ValueParameterDescriptorImpl]

'qualifierResolutionResult' @ [430:82] ==> value-parameter qualifierResolutionResult: QualifiedExpressionResolver.TypeQualifierResolutionResult defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClass[ValueParameterDescriptorImpl]

'qualifierParts' @ [430:108] ==> public final val qualifierParts: List<QualifiedExpressionResolver.QualifierPart> defined in org.jetbrains.kotlin.resolve.QualifiedExpressionResolver.TypeQualifierResolutionResult[PropertyDescriptorImpl]

'createErrorTypeForTypeConstructor' @ [431:27] ==> private final fun createErrorTypeForTypeConstructor(c: TypeResolutionContext, arguments: List<KtTypeProjection>, typeConstructor: TypeConstructor): PossiblyBareType defined in org.jetbrains.kotlin.resolve.TypeResolver[SimpleFunctionDescriptorImpl]

'c' @ [431:61] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClass[ValueParameterDescriptorImpl]

'projectionFromAllQualifierParts' @ [431:64] ==> val projectionFromAllQualifierParts: List<KtTypeProjection> defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClass[LocalVariableDescriptor]

'typeConstructor' @ [431:97] ==> val typeConstructor: TypeConstructor defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClass[LocalVariableDescriptor]

'assert' @ [433:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'collectedArgumentAsTypeProjections' @ [433:16] ==> val collectedArgumentAsTypeProjections: List<KtTypeProjection> defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClass[LocalVariableDescriptor]

'size' @ [433:51] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'parameters' @ [433:59] ==> val parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClass[LocalVariableDescriptor]

'size' @ [433:70] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'+' @ [434:13] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'collectedArgumentAsTypeProjections' @ [435:21] ==> val collectedArgumentAsTypeProjections: List<KtTypeProjection> defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClass[LocalVariableDescriptor]

'size' @ [435:56] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'parameters' @ [435:75] ==> val parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClass[LocalVariableDescriptor]

'size' @ [435:86] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'element' @ [435:103] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClass[ValueParameterDescriptorImpl]

'text' @ [435:111] ==> public final val KtElement.text: (String..String?)[MyPropertyDescriptor]

'resolveTypeProjections' @ [438:37] ==> public final fun resolveTypeProjections(c: TypeResolutionContext, constructor: TypeConstructor, argumentElements: List<KtTypeProjection>): List<TypeProjection> defined in org.jetbrains.kotlin.resolve.TypeResolver[SimpleFunctionDescriptorImpl]

'c' @ [438:60] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClass[ValueParameterDescriptorImpl]

'typeConstructor' @ [438:63] ==> val typeConstructor: TypeConstructor defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClass[LocalVariableDescriptor]

'collectedArgumentAsTypeProjections' @ [438:80] ==> val collectedArgumentAsTypeProjections: List<KtTypeProjection> defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClass[LocalVariableDescriptor]

'buildFinalArgumentList' @ [439:25] ==> private final fun buildFinalArgumentList(argumentsFromUserType: List<TypeProjection>, argumentsForOuterClass: List<TypeProjection>?, parameters: List<TypeParameterDescriptor>): List<TypeProjection> defined in org.jetbrains.kotlin.resolve.TypeResolver[SimpleFunctionDescriptorImpl]

'argumentsFromUserType' @ [439:48] ==> val argumentsFromUserType: List<TypeProjection> defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClass[LocalVariableDescriptor]

'argumentsForOuterClass' @ [439:71] ==> val argumentsForOuterClass: List<TypeProjection>? defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClass[LocalVariableDescriptor]

'parameters' @ [439:95] ==> val parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClass[LocalVariableDescriptor]

'assert' @ [441:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'arguments' @ [441:16] ==> val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClass[LocalVariableDescriptor]

'size' @ [441:26] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'parameters' @ [441:34] ==> val parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClass[LocalVariableDescriptor]

'size' @ [441:45] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'+' @ [442:13] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'collectedArgumentAsTypeProjections' @ [443:21] ==> val collectedArgumentAsTypeProjections: List<KtTypeProjection> defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClass[LocalVariableDescriptor]

'size' @ [443:56] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'parameters' @ [443:75] ==> val parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClass[LocalVariableDescriptor]

'size' @ [443:86] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'element' @ [443:103] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClass[ValueParameterDescriptorImpl]

'text' @ [443:111] ==> public final val KtElement.text: (String..String?)[MyPropertyDescriptor]

'KotlinTypeFactory' @ [446:29] ==> public object KotlinTypeFactory defined in org.jetbrains.kotlin.types[FakeCallableDescriptorForObject]

'simpleNotNullType' @ [446:47] ==> @JvmStatic public final fun simpleNotNullType(annotations: Annotations, descriptor: ClassDescriptor, arguments: List<TypeProjection>): SimpleType defined in org.jetbrains.kotlin.types.KotlinTypeFactory[DeserializedSimpleFunctionDescriptor]

'annotations' @ [446:65] ==> value-parameter annotations: Annotations defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClass[ValueParameterDescriptorImpl]

'classDescriptor' @ [446:78] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClass[ValueParameterDescriptorImpl]

'arguments' @ [446:95] ==> val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClass[LocalVariableDescriptor]

'typeTransformerForTests' @ [450:9] ==> private final val typeTransformerForTests: TypeResolver.TypeTransformerForTests defined in org.jetbrains.kotlin.resolve.TypeResolver[PropertyDescriptorImpl]

'transformType' @ [450:33] ==> public open fun transformType(kotlinType: KotlinType): KotlinType? defined in org.jetbrains.kotlin.resolve.TypeResolver.TypeTransformerForTests[SimpleFunctionDescriptorImpl]

'resultingType' @ [450:47] ==> val resultingType: SimpleType defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClass[LocalVariableDescriptor]

'let' @ [450:63] ==> @InlineOnly public inline fun <T, R> KotlinType.let(block: (KotlinType) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> Nothing

'type' @ [450:76] ==> @NotNull public open fun type(@NotNull actualType: KotlinType): PossiblyBareType defined in org.jetbrains.kotlin.resolve.PossiblyBareType[JavaMethodDescriptor]

'it' @ [450:81] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClass.<anonymous>[ValueParameterDescriptorImpl]

'shouldCheckBounds' @ [452:13] ==> private final fun shouldCheckBounds(c: TypeResolutionContext, inType: KotlinType): Boolean defined in org.jetbrains.kotlin.resolve.TypeResolver[SimpleFunctionDescriptorImpl]

'c' @ [452:31] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClass[ValueParameterDescriptorImpl]

'resultingType' @ [452:34] ==> val resultingType: SimpleType defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClass[LocalVariableDescriptor]

'create' @ [453:47] ==> @NotNull public open fun create(@NotNull p0: KotlinType): TypeSubstitutor defined in org.jetbrains.kotlin.types.TypeSubstitutor[JavaMethodDescriptor]

'resultingType' @ [453:54] ==> val resultingType: SimpleType defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClass[LocalVariableDescriptor]

'parameters' @ [454:23] ==> val parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClass[LocalVariableDescriptor]

'indices' @ [454:34] ==> public val Collection<*>.indices: IntRange defined in kotlin.collections[DeserializedPropertyDescriptor]

'parameters' @ [455:33] ==> val parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClass[LocalVariableDescriptor]

'i' @ [455:44] ==> val i: Int defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClass[LocalVariableDescriptor]

'arguments' @ [456:32] ==> val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClass[LocalVariableDescriptor]

'i' @ [456:42] ==> val i: Int defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClass[LocalVariableDescriptor]

'type' @ [456:45] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'collectedArgumentAsTypeProjections' @ [458:37] ==> val collectedArgumentAsTypeProjections: List<KtTypeProjection> defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClass[LocalVariableDescriptor]

'getOrNull' @ [458:72] ==> public fun <T> List<KtTypeProjection>.getOrNull(index: Int): KtTypeProjection? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtTypeProjection

'i' @ [458:82] ==> val i: Int defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClass[LocalVariableDescriptor]

'typeReference' @ [458:86] ==> public final val KtTypeProjection.typeReference: KtTypeReference?[MyPropertyDescriptor]

'typeReference' @ [460:21] ==> val typeReference: KtTypeReference? defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClass[LocalVariableDescriptor]

'checkBounds' @ [461:40] ==> public open fun checkBounds(@NotNull jetTypeArgument: KtTypeReference, @NotNull typeArgument: KotlinType, @NotNull typeParameterDescriptor: TypeParameterDescriptor, @NotNull substitutor: TypeSubstitutor, @NotNull trace: BindingTrace): Unit defined in org.jetbrains.kotlin.resolve.DescriptorResolver[JavaMethodDescriptor]

'typeReference' @ [461:52] ==> val typeReference: KtTypeReference? defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClass[LocalVariableDescriptor]

'argument' @ [461:67] ==> val argument: KotlinType defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClass[LocalVariableDescriptor]

'parameter' @ [461:77] ==> val parameter: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClass[LocalVariableDescriptor]

'substitutor' @ [461:88] ==> val substitutor: TypeSubstitutor defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClass[LocalVariableDescriptor]

'c' @ [461:101] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClass[ValueParameterDescriptorImpl]

'trace' @ [461:103] ==> public final val trace: (BindingTrace..BindingTrace?) defined in org.jetbrains.kotlin.resolve.TypeResolutionContext[JavaPropertyDescriptor]

'resultingType' @ [466:13] ==> val resultingType: SimpleType defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClass[LocalVariableDescriptor]

'isArrayOfNothing' @ [466:27] ==> public fun KotlinType?.isArrayOfNothing(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'c' @ [467:13] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClass[ValueParameterDescriptorImpl]

'trace' @ [467:15] ==> public final val trace: (BindingTrace..BindingTrace?) defined in org.jetbrains.kotlin.resolve.TypeResolutionContext[JavaPropertyDescriptor]

'report' @ [467:21] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'UNSUPPORTED' @ [467:28] ==> public final val UNSUPPORTED: (DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [467:40] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull argument: String): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'element' @ [467:43] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClass[ValueParameterDescriptorImpl]

'type' @ [470:16] ==> @NotNull public open fun type(@NotNull actualType: KotlinType): PossiblyBareType defined in org.jetbrains.kotlin.resolve.PossiblyBareType[JavaMethodDescriptor]

'resultingType' @ [470:21] ==> val resultingType: SimpleType defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClass[LocalVariableDescriptor]

'argumentsFromUserType' @ [478:16] ==> value-parameter argumentsFromUserType: List<TypeProjection> defined in org.jetbrains.kotlin.resolve.TypeResolver.buildFinalArgumentList[ValueParameterDescriptorImpl]

'argumentsForOuterClass' @ [479:17] ==> value-parameter argumentsForOuterClass: List<TypeProjection>? defined in org.jetbrains.kotlin.resolve.TypeResolver.buildFinalArgumentList[ValueParameterDescriptorImpl]

'appendDefaultArgumentsForLocalClassifier' @ [479:43] ==> private final fun appendDefaultArgumentsForLocalClassifier(fromIndex: Int, constructorParameters: List<TypeParameterDescriptor>): List<TypeProjectionImpl> defined in org.jetbrains.kotlin.resolve.TypeResolver[SimpleFunctionDescriptorImpl]

'argumentsFromUserType' @ [479:84] ==> value-parameter argumentsFromUserType: List<TypeProjection> defined in org.jetbrains.kotlin.resolve.TypeResolver.buildFinalArgumentList[ValueParameterDescriptorImpl]

'size' @ [479:106] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'parameters' @ [479:112] ==> value-parameter parameters: List<TypeParameterDescriptor> defined in org.jetbrains.kotlin.resolve.TypeResolver.buildFinalArgumentList[ValueParameterDescriptorImpl]

'!' @ [483:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'c' @ [483:14] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.shouldCheckBounds[ValueParameterDescriptorImpl]

'checkBounds' @ [483:16] ==> public final val checkBounds: Boolean defined in org.jetbrains.kotlin.resolve.TypeResolutionContext[JavaPropertyDescriptor]

'inType' @ [484:13] ==> value-parameter inType: KotlinType defined in org.jetbrains.kotlin.resolve.TypeResolver.shouldCheckBounds[ValueParameterDescriptorImpl]

'containsTypeAliasParameters' @ [484:20] ==> public fun KotlinType.containsTypeAliasParameters(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'c' @ [485:13] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.shouldCheckBounds[ValueParameterDescriptorImpl]

'abbreviated' @ [485:15] ==> public final val abbreviated: Boolean defined in org.jetbrains.kotlin.resolve.TypeResolutionContext[JavaPropertyDescriptor]

'inType' @ [485:30] ==> value-parameter inType: KotlinType defined in org.jetbrains.kotlin.resolve.TypeResolver.shouldCheckBounds[ValueParameterDescriptorImpl]

'containsTypeAliases' @ [485:37] ==> public fun KotlinType.containsTypeAliases(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [497:31] ==> value-parameter descriptor: TypeAliasDescriptor defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeAlias[ValueParameterDescriptorImpl]

'typeConstructor' @ [497:42] ==> public final val TypeAliasDescriptor.typeConstructor: TypeConstructor[MyPropertyDescriptor]

'qualifierResolutionResult' @ [498:47] ==> value-parameter qualifierResolutionResult: QualifiedExpressionResolver.TypeQualifierResolutionResult defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeAlias[ValueParameterDescriptorImpl]

'allProjections' @ [498:73] ==> public final val allProjections: List<KtTypeProjection> defined in org.jetbrains.kotlin.resolve.QualifiedExpressionResolver.TypeQualifierResolutionResult[PropertyDescriptorImpl]

'isError' @ [500:24] ==> public open fun isError(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'descriptor' @ [500:32] ==> value-parameter descriptor: TypeAliasDescriptor defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeAlias[ValueParameterDescriptorImpl]

'createErrorTypeForTypeConstructor' @ [501:20] ==> private final fun createErrorTypeForTypeConstructor(c: TypeResolutionContext, arguments: List<KtTypeProjection>, typeConstructor: TypeConstructor): PossiblyBareType defined in org.jetbrains.kotlin.resolve.TypeResolver[SimpleFunctionDescriptorImpl]

'c' @ [501:54] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeAlias[ValueParameterDescriptorImpl]

'projectionFromAllQualifierParts' @ [501:57] ==> val projectionFromAllQualifierParts: List<KtTypeProjection> defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeAlias[LocalVariableDescriptor]

'typeConstructor' @ [501:90] ==> val typeConstructor: TypeConstructor defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeAlias[LocalVariableDescriptor]

'!' @ [503:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'languageVersionSettings' @ [503:14] ==> private final val languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.resolve.TypeResolver[PropertyDescriptorImpl]

'supportsFeature' @ [503:38] ==> public open fun supportsFeature(feature: LanguageFeature): Boolean defined in org.jetbrains.kotlin.config.LanguageVersionSettings[DeserializedSimpleFunctionDescriptor]

'LanguageFeature' @ [503:54] ==> public companion object defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'TypeAliases' @ [503:70] ==> enum entry TypeAliases defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'c' @ [504:13] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeAlias[ValueParameterDescriptorImpl]

'trace' @ [504:15] ==> public final val trace: (BindingTrace..BindingTrace?) defined in org.jetbrains.kotlin.resolve.TypeResolutionContext[JavaPropertyDescriptor]

'report' @ [504:21] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'UNSUPPORTED_FEATURE' @ [504:28] ==> public final val UNSUPPORTED_FEATURE: (DiagnosticFactory1<(PsiElement..PsiElement?), (Pair<(LanguageFeature..LanguageFeature?), (LanguageVersionSettings..LanguageVersionSettings?)>..Pair<(LanguageFeature..LanguageFeature?), (LanguageVersionSettings..LanguageVersionSettings?)>?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (Pair<(LanguageFeature..LanguageFeature?), (LanguageVersionSettings..LanguageVersionSettings?)>..Pair<(LanguageFeature..LanguageFeature?), (LanguageVersionSettings..LanguageVersionSettings?)>?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [504:48] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull argument: Pair<(LanguageFeature..LanguageFeature?), (LanguageVersionSettings..LanguageVersionSettings?)>): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'type' @ [504:51] ==> value-parameter type: KtElement defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeAlias[ValueParameterDescriptorImpl]

'LanguageFeature' @ [504:57] ==> public companion object defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'TypeAliases' @ [504:73] ==> enum entry TypeAliases defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'languageVersionSettings' @ [504:88] ==> private final val languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.resolve.TypeResolver[PropertyDescriptorImpl]

'createErrorTypeForTypeConstructor' @ [505:20] ==> private final fun createErrorTypeForTypeConstructor(c: TypeResolutionContext, arguments: List<KtTypeProjection>, typeConstructor: TypeConstructor): PossiblyBareType defined in org.jetbrains.kotlin.resolve.TypeResolver[SimpleFunctionDescriptorImpl]

'c' @ [505:54] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeAlias[ValueParameterDescriptorImpl]

'projectionFromAllQualifierParts' @ [505:57] ==> val projectionFromAllQualifierParts: List<KtTypeProjection> defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeAlias[LocalVariableDescriptor]

'typeConstructor' @ [505:90] ==> val typeConstructor: TypeConstructor defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeAlias[LocalVariableDescriptor]

'typeConstructor' @ [508:26] ==> val typeConstructor: TypeConstructor defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeAlias[LocalVariableDescriptor]

'parameters' @ [508:42] ==> public final val TypeConstructor.parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'c' @ [510:13] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeAlias[ValueParameterDescriptorImpl]

'allowBareTypes' @ [510:15] ==> public final val allowBareTypes: Boolean defined in org.jetbrains.kotlin.resolve.TypeResolutionContext[JavaPropertyDescriptor]

'projectionFromAllQualifierParts' @ [510:33] ==> val projectionFromAllQualifierParts: List<KtTypeProjection> defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeAlias[LocalVariableDescriptor]

'isEmpty' @ [510:65] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'isPossibleToSpecifyTypeArgumentsFor' @ [510:78] ==> private final fun isPossibleToSpecifyTypeArgumentsFor(classifierDescriptor: ClassifierDescriptorWithTypeParameters): Boolean defined in org.jetbrains.kotlin.resolve.TypeResolver[SimpleFunctionDescriptorImpl]

'descriptor' @ [510:114] ==> value-parameter descriptor: TypeAliasDescriptor defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeAlias[ValueParameterDescriptorImpl]

'descriptor' @ [511:35] ==> value-parameter descriptor: TypeAliasDescriptor defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeAlias[ValueParameterDescriptorImpl]

'classDescriptor' @ [511:46] ==> public abstract val classDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.descriptors.TypeAliasDescriptor[DeserializedPropertyDescriptor]

'classDescriptor' @ [512:17] ==> val classDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeAlias[LocalVariableDescriptor]

'canBeUsedAsBareType' @ [512:44] ==> private final fun canBeUsedAsBareType(descriptor: TypeAliasDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.TypeResolver[SimpleFunctionDescriptorImpl]

'descriptor' @ [512:64] ==> value-parameter descriptor: TypeAliasDescriptor defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeAlias[ValueParameterDescriptorImpl]

'bare' @ [513:24] ==> @NotNull public open fun bare(@NotNull bareTypeConstructor: TypeConstructor, nullable: Boolean): PossiblyBareType defined in org.jetbrains.kotlin.resolve.PossiblyBareType[JavaMethodDescriptor]

'descriptor' @ [513:29] ==> value-parameter descriptor: TypeAliasDescriptor defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeAlias[ValueParameterDescriptorImpl]

'classDescriptor' @ [513:40] ==> public abstract val classDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.descriptors.TypeAliasDescriptor[DeserializedPropertyDescriptor]

'typeConstructor' @ [513:58] ==> public final val ClassDescriptor.typeConstructor: TypeConstructor[MyPropertyDescriptor]

'isNullableType' @ [513:85] ==> public open fun isNullableType(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'descriptor' @ [513:100] ==> value-parameter descriptor: TypeAliasDescriptor defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeAlias[ValueParameterDescriptorImpl]

'expandedType' @ [513:111] ==> public abstract val expandedType: SimpleType defined in org.jetbrains.kotlin.descriptors.TypeAliasDescriptor[DeserializedPropertyDescriptor]

'qualifierResolutionResult' @ [518:17] ==> value-parameter qualifierResolutionResult: QualifiedExpressionResolver.TypeQualifierResolutionResult defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeAlias[ValueParameterDescriptorImpl]

'qualifierParts' @ [518:43] ==> public final val qualifierParts: List<QualifiedExpressionResolver.QualifierPart> defined in org.jetbrains.kotlin.resolve.QualifiedExpressionResolver.TypeQualifierResolutionResult[PropertyDescriptorImpl]

'lastOrNull' @ [518:58] ==> public fun <T> List<QualifiedExpressionResolver.QualifierPart>.lastOrNull(): QualifiedExpressionResolver.QualifierPart? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> QualifierPart

'createErrorTypeForTypeConstructor' @ [519:27] ==> private final fun createErrorTypeForTypeConstructor(c: TypeResolutionContext, arguments: List<KtTypeProjection>, typeConstructor: TypeConstructor): PossiblyBareType defined in org.jetbrains.kotlin.resolve.TypeResolver[SimpleFunctionDescriptorImpl]

'c' @ [519:61] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeAlias[ValueParameterDescriptorImpl]

'projectionFromAllQualifierParts' @ [519:64] ==> val projectionFromAllQualifierParts: List<KtTypeProjection> defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeAlias[LocalVariableDescriptor]

'typeConstructor' @ [519:97] ==> val typeConstructor: TypeConstructor defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeAlias[LocalVariableDescriptor]

'component1' @ [521:14] ==> public final operator fun component1(): List<KtTypeProjection> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [521:44] ==> public final operator fun component2(): List<TypeProjection>? defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'collectArgumentsForClassifierTypeConstructor' @ [522:17] ==> private final fun collectArgumentsForClassifierTypeConstructor(c: TypeResolutionContext, classifierDescriptor: ClassifierDescriptorWithTypeParameters, qualifierParts: List<QualifiedExpressionResolver.QualifierPart>): Pair<List<KtTypeProjection>, List<TypeProjection>?>? defined in org.jetbrains.kotlin.resolve.TypeResolver[SimpleFunctionDescriptorImpl]

'c' @ [522:62] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeAlias[ValueParameterDescriptorImpl]

'descriptor' @ [522:65] ==> value-parameter descriptor: TypeAliasDescriptor defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeAlias[ValueParameterDescriptorImpl]

'qualifierResolutionResult' @ [522:77] ==> value-parameter qualifierResolutionResult: QualifiedExpressionResolver.TypeQualifierResolutionResult defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeAlias[ValueParameterDescriptorImpl]

'qualifierParts' @ [522:103] ==> public final val qualifierParts: List<QualifiedExpressionResolver.QualifierPart> defined in org.jetbrains.kotlin.resolve.QualifiedExpressionResolver.TypeQualifierResolutionResult[PropertyDescriptorImpl]

'createErrorTypeForTypeConstructor' @ [523:27] ==> private final fun createErrorTypeForTypeConstructor(c: TypeResolutionContext, arguments: List<KtTypeProjection>, typeConstructor: TypeConstructor): PossiblyBareType defined in org.jetbrains.kotlin.resolve.TypeResolver[SimpleFunctionDescriptorImpl]

'c' @ [523:61] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeAlias[ValueParameterDescriptorImpl]

'projectionFromAllQualifierParts' @ [523:64] ==> val projectionFromAllQualifierParts: List<KtTypeProjection> defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeAlias[LocalVariableDescriptor]

'typeConstructor' @ [523:97] ==> val typeConstructor: TypeConstructor defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeAlias[LocalVariableDescriptor]

'resolveTypeProjections' @ [525:37] ==> public final fun resolveTypeProjections(c: TypeResolutionContext, constructor: TypeConstructor, argumentElements: List<KtTypeProjection>): List<TypeProjection> defined in org.jetbrains.kotlin.resolve.TypeResolver[SimpleFunctionDescriptorImpl]

'c' @ [525:60] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeAlias[ValueParameterDescriptorImpl]

'typeConstructor' @ [525:63] ==> val typeConstructor: TypeConstructor defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeAlias[LocalVariableDescriptor]

'argumentElementsFromUserType' @ [525:80] ==> val argumentElementsFromUserType: List<KtTypeProjection> defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeAlias[LocalVariableDescriptor]

'buildFinalArgumentList' @ [527:25] ==> private final fun buildFinalArgumentList(argumentsFromUserType: List<TypeProjection>, argumentsForOuterClass: List<TypeProjection>?, parameters: List<TypeParameterDescriptor>): List<TypeProjection> defined in org.jetbrains.kotlin.resolve.TypeResolver[SimpleFunctionDescriptorImpl]

'argumentsFromUserType' @ [527:48] ==> val argumentsFromUserType: List<TypeProjection> defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeAlias[LocalVariableDescriptor]

'argumentsForOuterClass' @ [527:71] ==> val argumentsForOuterClass: List<TypeProjection>? defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeAlias[LocalVariableDescriptor]

'parameters' @ [527:95] ==> val parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeAlias[LocalVariableDescriptor]

'TracingTypeAliasExpansionReportStrategy' @ [529:30] ==> public constructor TracingTypeAliasExpansionReportStrategy(trace: BindingTrace, type: KtElement?, typeArgumentsOrTypeName: KtElement?, typeAliasDescriptor: TypeAliasDescriptor, typeParameters: List<TypeParameterDescriptor>, typeArguments: List<KtTypeProjection>) defined in org.jetbrains.kotlin.resolve.TypeResolver.TracingTypeAliasExpansionReportStrategy[ClassConstructorDescriptorImpl]

'c' @ [530:17] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeAlias[ValueParameterDescriptorImpl]

'trace' @ [530:19] ==> public final val trace: (BindingTrace..BindingTrace?) defined in org.jetbrains.kotlin.resolve.TypeResolutionContext[JavaPropertyDescriptor]

'type' @ [531:17] ==> value-parameter type: KtElement defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeAlias[ValueParameterDescriptorImpl]

'typeAliasQualifierPart' @ [531:23] ==> val typeAliasQualifierPart: QualifiedExpressionResolver.QualifierPart defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeAlias[LocalVariableDescriptor]

'typeArguments' @ [531:46] ==> public final val typeArguments: KtTypeArgumentList? defined in org.jetbrains.kotlin.resolve.QualifiedExpressionResolver.QualifierPart[PropertyDescriptorImpl]

'typeAliasQualifierPart' @ [531:63] ==> val typeAliasQualifierPart: QualifiedExpressionResolver.QualifierPart defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeAlias[LocalVariableDescriptor]

'expression' @ [531:86] ==> public final val expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.resolve.QualifiedExpressionResolver.QualifierPart[PropertyDescriptorImpl]

'descriptor' @ [532:17] ==> value-parameter descriptor: TypeAliasDescriptor defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeAlias[ValueParameterDescriptorImpl]

'descriptor' @ [532:29] ==> value-parameter descriptor: TypeAliasDescriptor defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeAlias[ValueParameterDescriptorImpl]

'declaredTypeParameters' @ [532:40] ==> public final val TypeAliasDescriptor.declaredTypeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'argumentElementsFromUserType' @ [533:17] ==> val argumentElementsFromUserType: List<KtTypeProjection> defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeAlias[LocalVariableDescriptor]

'parameters' @ [536:13] ==> val parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeAlias[LocalVariableDescriptor]

'size' @ [536:24] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'arguments' @ [536:32] ==> val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeAlias[LocalVariableDescriptor]

'size' @ [536:42] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'reportStrategy' @ [537:13] ==> val reportStrategy: TypeResolver.TracingTypeAliasExpansionReportStrategy defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeAlias[LocalVariableDescriptor]

'wrongNumberOfTypeArguments' @ [537:28] ==> public open fun wrongNumberOfTypeArguments(typeAlias: TypeAliasDescriptor, numberOfParameters: Int): Unit defined in org.jetbrains.kotlin.resolve.TypeResolver.TracingTypeAliasExpansionReportStrategy[SimpleFunctionDescriptorImpl]

'descriptor' @ [537:55] ==> value-parameter descriptor: TypeAliasDescriptor defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeAlias[ValueParameterDescriptorImpl]

'parameters' @ [537:67] ==> val parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeAlias[LocalVariableDescriptor]

'size' @ [537:78] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'createErrorTypeForTypeConstructor' @ [538:20] ==> private final fun createErrorTypeForTypeConstructor(c: TypeResolutionContext, arguments: List<KtTypeProjection>, typeConstructor: TypeConstructor): PossiblyBareType defined in org.jetbrains.kotlin.resolve.TypeResolver[SimpleFunctionDescriptorImpl]

'c' @ [538:54] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeAlias[ValueParameterDescriptorImpl]

'projectionFromAllQualifierParts' @ [538:57] ==> val projectionFromAllQualifierParts: List<KtTypeProjection> defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeAlias[LocalVariableDescriptor]

'typeConstructor' @ [538:90] ==> val typeConstructor: TypeConstructor defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeAlias[LocalVariableDescriptor]

'if (c.abbreviated) {
            val abbreviatedType = KotlinTypeFactory.simpleType(annotations, descriptor.typeConstructor, arguments, false)
            type(abbreviatedType)
        }
        else {
            val typeAliasExpansion = TypeAliasExpansion.create(null, descriptor, arguments)
            val expandedType = TypeAliasExpander(reportStrategy, c.checkBounds).expand(typeAliasExpansion, annotations)
            type(expandedType)
        }' @ [541:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PossiblyBareType, elseBranch: PossiblyBareType): PossiblyBareType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PossiblyBareType

'c' @ [541:20] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeAlias[ValueParameterDescriptorImpl]

'abbreviated' @ [541:22] ==> public final val abbreviated: Boolean defined in org.jetbrains.kotlin.resolve.TypeResolutionContext[JavaPropertyDescriptor]

'KotlinTypeFactory' @ [542:35] ==> public object KotlinTypeFactory defined in org.jetbrains.kotlin.types[FakeCallableDescriptorForObject]

'simpleType' @ [542:53] ==> @JvmStatic public final fun simpleType(annotations: Annotations, constructor: TypeConstructor, arguments: List<TypeProjection>, nullable: Boolean): SimpleType defined in org.jetbrains.kotlin.types.KotlinTypeFactory[DeserializedSimpleFunctionDescriptor]

'annotations' @ [542:64] ==> value-parameter annotations: Annotations defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeAlias[ValueParameterDescriptorImpl]

'descriptor' @ [542:77] ==> value-parameter descriptor: TypeAliasDescriptor defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeAlias[ValueParameterDescriptorImpl]

'typeConstructor' @ [542:88] ==> public final val TypeAliasDescriptor.typeConstructor: TypeConstructor[MyPropertyDescriptor]

'arguments' @ [542:105] ==> val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeAlias[LocalVariableDescriptor]

'type' @ [543:13] ==> @NotNull public open fun type(@NotNull actualType: KotlinType): PossiblyBareType defined in org.jetbrains.kotlin.resolve.PossiblyBareType[JavaMethodDescriptor]

'abbreviatedType' @ [543:18] ==> val abbreviatedType: SimpleType defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeAlias[LocalVariableDescriptor]

'TypeAliasExpansion' @ [546:38] ==> public companion object defined in org.jetbrains.kotlin.resolve.TypeAliasExpansion[FakeCallableDescriptorForObject]

'create' @ [546:57] ==> public final fun create(parent: TypeAliasExpansion?, typeAliasDescriptor: TypeAliasDescriptor, arguments: List<TypeProjection>): TypeAliasExpansion defined in org.jetbrains.kotlin.resolve.TypeAliasExpansion.Companion[SimpleFunctionDescriptorImpl]

'descriptor' @ [546:70] ==> value-parameter descriptor: TypeAliasDescriptor defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeAlias[ValueParameterDescriptorImpl]

'arguments' @ [546:82] ==> val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeAlias[LocalVariableDescriptor]

'TypeAliasExpander' @ [547:32] ==> public constructor TypeAliasExpander(reportStrategy: TypeAliasExpansionReportStrategy, shouldCheckBounds: Boolean) defined in org.jetbrains.kotlin.resolve.TypeAliasExpander[ClassConstructorDescriptorImpl]

'reportStrategy' @ [547:50] ==> val reportStrategy: TypeResolver.TracingTypeAliasExpansionReportStrategy defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeAlias[LocalVariableDescriptor]

'c' @ [547:66] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeAlias[ValueParameterDescriptorImpl]

'checkBounds' @ [547:68] ==> public final val checkBounds: Boolean defined in org.jetbrains.kotlin.resolve.TypeResolutionContext[JavaPropertyDescriptor]

'expand' @ [547:81] ==> public final fun expand(typeAliasExpansion: TypeAliasExpansion, annotations: Annotations): SimpleType defined in org.jetbrains.kotlin.resolve.TypeAliasExpander[SimpleFunctionDescriptorImpl]

'typeAliasExpansion' @ [547:88] ==> val typeAliasExpansion: TypeAliasExpansion defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeAlias[LocalVariableDescriptor]

'annotations' @ [547:108] ==> value-parameter annotations: Annotations defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeAlias[ValueParameterDescriptorImpl]

'type' @ [548:13] ==> @NotNull public open fun type(@NotNull actualType: KotlinType): PossiblyBareType defined in org.jetbrains.kotlin.resolve.PossiblyBareType[JavaMethodDescriptor]

'expandedType' @ [548:18] ==> val expandedType: SimpleType defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeAlias[LocalVariableDescriptor]

'descriptor' @ [568:28] ==> value-parameter descriptor: TypeAliasDescriptor defined in org.jetbrains.kotlin.resolve.TypeResolver.canBeUsedAsBareType[ValueParameterDescriptorImpl]

'expandedType' @ [568:39] ==> public abstract val expandedType: SimpleType defined in org.jetbrains.kotlin.descriptors.TypeAliasDescriptor[DeserializedPropertyDescriptor]

'expandedType' @ [569:13] ==> val expandedType: SimpleType defined in org.jetbrains.kotlin.resolve.TypeResolver.canBeUsedAsBareType[LocalVariableDescriptor]

'isError' @ [569:26] ==> public val KotlinType.isError: Boolean defined in org.jetbrains.kotlin.types[DeserializedPropertyDescriptor]

'descriptor' @ [571:31] ==> value-parameter descriptor: TypeAliasDescriptor defined in org.jetbrains.kotlin.resolve.TypeResolver.canBeUsedAsBareType[ValueParameterDescriptorImpl]

'classDescriptor' @ [571:42] ==> public abstract val classDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.descriptors.TypeAliasDescriptor[DeserializedPropertyDescriptor]

'!' @ [572:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isPossibleToSpecifyTypeArgumentsFor' @ [572:14] ==> private final fun isPossibleToSpecifyTypeArgumentsFor(classifierDescriptor: ClassifierDescriptorWithTypeParameters): Boolean defined in org.jetbrains.kotlin.resolve.TypeResolver[SimpleFunctionDescriptorImpl]

'classDescriptor' @ [572:50] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.TypeResolver.canBeUsedAsBareType[LocalVariableDescriptor]

'linkedSetOf' @ [574:34] ==> @SinceKotlin @InlineOnly public inline fun <T> linkedSetOf(): LinkedHashSet<TypeParameterDescriptor> /* = LinkedHashSet<TypeParameterDescriptor> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameterDescriptor

'expandedType' @ [575:26] ==> val expandedType: SimpleType defined in org.jetbrains.kotlin.resolve.TypeResolver.canBeUsedAsBareType[LocalVariableDescriptor]

'arguments' @ [575:39] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.SimpleType[DeserializedPropertyDescriptor]

'argument' @ [576:17] ==> val argument: TypeProjection defined in org.jetbrains.kotlin.resolve.TypeResolver.canBeUsedAsBareType[LocalVariableDescriptor]

'isStarProjection' @ [576:26] ==> public final val TypeProjection.isStarProjection: Boolean[MyPropertyDescriptor]

'argument' @ [578:17] ==> val argument: TypeProjection defined in org.jetbrains.kotlin.resolve.TypeResolver.canBeUsedAsBareType[LocalVariableDescriptor]

'projectionKind' @ [578:26] ==> public final val TypeProjection.projectionKind: Variance[MyPropertyDescriptor]

'INVARIANT' @ [578:44] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'argument' @ [580:42] ==> val argument: TypeProjection defined in org.jetbrains.kotlin.resolve.TypeResolver.canBeUsedAsBareType[LocalVariableDescriptor]

'type' @ [580:51] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'constructor' @ [580:56] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [580:68] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'argumentTypeDescriptor' @ [581:17] ==> val argumentTypeDescriptor: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.TypeResolver.canBeUsedAsBareType[LocalVariableDescriptor]

'containingDeclaration' @ [581:40] ==> public final val TypeParameterDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'descriptor' @ [581:65] ==> value-parameter descriptor: TypeAliasDescriptor defined in org.jetbrains.kotlin.resolve.TypeResolver.canBeUsedAsBareType[ValueParameterDescriptorImpl]

'usedTypeParameters' @ [582:17] ==> val usedTypeParameters: LinkedHashSet<TypeParameterDescriptor> /* = LinkedHashSet<TypeParameterDescriptor> */ defined in org.jetbrains.kotlin.resolve.TypeResolver.canBeUsedAsBareType[LocalVariableDescriptor]

'contains' @ [582:36] ==> public open fun contains(element: TypeParameterDescriptor): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'argumentTypeDescriptor' @ [582:45] ==> val argumentTypeDescriptor: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.TypeResolver.canBeUsedAsBareType[LocalVariableDescriptor]

'usedTypeParameters' @ [584:13] ==> val usedTypeParameters: LinkedHashSet<TypeParameterDescriptor> /* = LinkedHashSet<TypeParameterDescriptor> */ defined in org.jetbrains.kotlin.resolve.TypeResolver.canBeUsedAsBareType[LocalVariableDescriptor]

'add' @ [584:32] ==> public open fun add(element: TypeParameterDescriptor): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'argumentTypeDescriptor' @ [584:36] ==> val argumentTypeDescriptor: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.TypeResolver.canBeUsedAsBareType[LocalVariableDescriptor]

'typeParameters' @ [599:39] ==> value-parameter typeParameters: List<TypeParameterDescriptor> defined in org.jetbrains.kotlin.resolve.TypeResolver.TracingTypeAliasExpansionReportStrategy.<init>[ValueParameterDescriptorImpl]

'zip' @ [599:54] ==> public infix fun <T, R> Iterable<TypeParameterDescriptor>.zip(other: Iterable<KtTypeProjection>): List<Pair<TypeParameterDescriptor, KtTypeProjection>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameterDescriptor
    <R> -> KtTypeProjection

'typeArguments' @ [599:58] ==> value-parameter typeArguments: List<KtTypeProjection> defined in org.jetbrains.kotlin.resolve.TypeResolver.TracingTypeAliasExpansionReportStrategy.<init>[ValueParameterDescriptorImpl]

'toMap' @ [599:73] ==> public fun <K, V> Iterable<Pair<TypeParameterDescriptor, KtTypeProjection>>.toMap(): Map<TypeParameterDescriptor, KtTypeProjection> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> TypeParameterDescriptor
    <V> -> KtTypeProjection

'typeArgumentsOrTypeName' @ [602:17] ==> public final val typeArgumentsOrTypeName: KtElement? defined in org.jetbrains.kotlin.resolve.TypeResolver.TracingTypeAliasExpansionReportStrategy[PropertyDescriptorImpl]

'trace' @ [603:17] ==> public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.TypeResolver.TracingTypeAliasExpansionReportStrategy[PropertyDescriptorImpl]

'report' @ [603:23] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'WRONG_NUMBER_OF_TYPE_ARGUMENTS' @ [603:30] ==> public final val WRONG_NUMBER_OF_TYPE_ARGUMENTS: (DiagnosticFactory2<(KtElement..KtElement?), (Int..Int?), (DeclarationDescriptor..DeclarationDescriptor?)>..DiagnosticFactory2<(KtElement..KtElement?), (Int..Int?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [603:61] ==> @NotNull public open fun on(@NotNull element: KtElement, @NotNull a: Int, @NotNull b: DeclarationDescriptor): ParametrizedDiagnostic<(KtElement..KtElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'typeArgumentsOrTypeName' @ [603:64] ==> public final val typeArgumentsOrTypeName: KtElement? defined in org.jetbrains.kotlin.resolve.TypeResolver.TracingTypeAliasExpansionReportStrategy[PropertyDescriptorImpl]

'numberOfParameters' @ [603:89] ==> value-parameter numberOfParameters: Int defined in org.jetbrains.kotlin.resolve.TypeResolver.TracingTypeAliasExpansionReportStrategy.wrongNumberOfTypeArguments[ValueParameterDescriptorImpl]

'typeAliasDescriptor' @ [603:109] ==> public final val typeAliasDescriptor: TypeAliasDescriptor defined in org.jetbrains.kotlin.resolve.TypeResolver.TracingTypeAliasExpansionReportStrategy[PropertyDescriptorImpl]

'typeParameter' @ [608:35] ==> value-parameter typeParameter: TypeParameterDescriptor? defined in org.jetbrains.kotlin.resolve.TypeResolver.TracingTypeAliasExpansionReportStrategy.conflictingProjection[ValueParameterDescriptorImpl]

'let' @ [608:50] ==> @InlineOnly public inline fun <T, R> TypeParameterDescriptor.let(block: (TypeParameterDescriptor) -> KtTypeProjection?): KtTypeProjection? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameterDescriptor
    <R> -> KtTypeProjection?

'mappedArguments' @ [608:56] ==> private final val mappedArguments: Map<TypeParameterDescriptor, KtTypeProjection> defined in org.jetbrains.kotlin.resolve.TypeResolver.TracingTypeAliasExpansionReportStrategy[PropertyDescriptorImpl]

'it' @ [608:72] ==> value-parameter it: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.TypeResolver.TracingTypeAliasExpansionReportStrategy.conflictingProjection.<anonymous>[ValueParameterDescriptorImpl]

'if (argumentElement != null) {
                trace.report(CONFLICTING_PROJECTION.on(argumentElement, typeParameter))
            }
            else if (type != null) {
                trace.report(CONFLICTING_PROJECTION_IN_TYPEALIAS_EXPANSION.on(type, typeAliasDescriptor.underlyingType))
            }' @ [609:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'argumentElement' @ [609:17] ==> val argumentElement: KtTypeProjection? defined in org.jetbrains.kotlin.resolve.TypeResolver.TracingTypeAliasExpansionReportStrategy.conflictingProjection[LocalVariableDescriptor]

'trace' @ [610:17] ==> public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.TypeResolver.TracingTypeAliasExpansionReportStrategy[PropertyDescriptorImpl]

'report' @ [610:23] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'CONFLICTING_PROJECTION' @ [610:30] ==> public final val CONFLICTING_PROJECTION: (DiagnosticFactory1<(KtTypeProjection..KtTypeProjection?), (ClassifierDescriptor..ClassifierDescriptor?)>..DiagnosticFactory1<(KtTypeProjection..KtTypeProjection?), (ClassifierDescriptor..ClassifierDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [610:53] ==> @NotNull public open fun on(@NotNull element: KtTypeProjection, @NotNull argument: ClassifierDescriptor): ParametrizedDiagnostic<(KtTypeProjection..KtTypeProjection?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'argumentElement' @ [610:56] ==> val argumentElement: KtTypeProjection? defined in org.jetbrains.kotlin.resolve.TypeResolver.TracingTypeAliasExpansionReportStrategy.conflictingProjection[LocalVariableDescriptor]

'typeParameter' @ [610:73] ==> value-parameter typeParameter: TypeParameterDescriptor? defined in org.jetbrains.kotlin.resolve.TypeResolver.TracingTypeAliasExpansionReportStrategy.conflictingProjection[ValueParameterDescriptorImpl]

'type' @ [612:22] ==> public final val type: KtElement? defined in org.jetbrains.kotlin.resolve.TypeResolver.TracingTypeAliasExpansionReportStrategy[PropertyDescriptorImpl]

'trace' @ [613:17] ==> public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.TypeResolver.TracingTypeAliasExpansionReportStrategy[PropertyDescriptorImpl]

'report' @ [613:23] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'CONFLICTING_PROJECTION_IN_TYPEALIAS_EXPANSION' @ [613:30] ==> public final val CONFLICTING_PROJECTION_IN_TYPEALIAS_EXPANSION: (DiagnosticFactory1<(KtElement..KtElement?), (KotlinType..KotlinType?)>..DiagnosticFactory1<(KtElement..KtElement?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [613:76] ==> @NotNull public open fun on(@NotNull element: KtElement, @NotNull argument: KotlinType): ParametrizedDiagnostic<(KtElement..KtElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'type' @ [613:79] ==> public final val type: KtElement? defined in org.jetbrains.kotlin.resolve.TypeResolver.TracingTypeAliasExpansionReportStrategy[PropertyDescriptorImpl]

'typeAliasDescriptor' @ [613:85] ==> public final val typeAliasDescriptor: TypeAliasDescriptor defined in org.jetbrains.kotlin.resolve.TypeResolver.TracingTypeAliasExpansionReportStrategy[PropertyDescriptorImpl]

'underlyingType' @ [613:105] ==> public abstract val underlyingType: SimpleType defined in org.jetbrains.kotlin.descriptors.TypeAliasDescriptor[DeserializedPropertyDescriptor]

'type' @ [618:17] ==> public final val type: KtElement? defined in org.jetbrains.kotlin.resolve.TypeResolver.TracingTypeAliasExpansionReportStrategy[PropertyDescriptorImpl]

'trace' @ [619:17] ==> public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.TypeResolver.TracingTypeAliasExpansionReportStrategy[PropertyDescriptorImpl]

'report' @ [619:23] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'RECURSIVE_TYPEALIAS_EXPANSION' @ [619:30] ==> public final val RECURSIVE_TYPEALIAS_EXPANSION: (DiagnosticFactory1<(KtElement..KtElement?), (ClassifierDescriptor..ClassifierDescriptor?)>..DiagnosticFactory1<(KtElement..KtElement?), (ClassifierDescriptor..ClassifierDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [619:60] ==> @NotNull public open fun on(@NotNull element: KtElement, @NotNull argument: ClassifierDescriptor): ParametrizedDiagnostic<(KtElement..KtElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'type' @ [619:63] ==> public final val type: KtElement? defined in org.jetbrains.kotlin.resolve.TypeResolver.TracingTypeAliasExpansionReportStrategy[PropertyDescriptorImpl]

'typeAlias' @ [619:69] ==> value-parameter typeAlias: TypeAliasDescriptor defined in org.jetbrains.kotlin.resolve.TypeResolver.TracingTypeAliasExpansionReportStrategy.recursiveTypeAlias[ValueParameterDescriptorImpl]

'unsubstitutedArgument' @ [624:54] ==> value-parameter unsubstitutedArgument: KotlinType defined in org.jetbrains.kotlin.resolve.TypeResolver.TracingTypeAliasExpansionReportStrategy.boundsViolationInSubstitution[ValueParameterDescriptorImpl]

'constructor' @ [624:76] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [624:88] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'mappedArguments' @ [625:35] ==> private final val mappedArguments: Map<TypeParameterDescriptor, KtTypeProjection> defined in org.jetbrains.kotlin.resolve.TypeResolver.TracingTypeAliasExpansionReportStrategy[PropertyDescriptorImpl]

'descriptorForUnsubstitutedArgument' @ [625:51] ==> val descriptorForUnsubstitutedArgument: ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.TypeResolver.TracingTypeAliasExpansionReportStrategy.boundsViolationInSubstitution[LocalVariableDescriptor]

'argumentElement' @ [626:48] ==> val argumentElement: KtTypeProjection? defined in org.jetbrains.kotlin.resolve.TypeResolver.TracingTypeAliasExpansionReportStrategy.boundsViolationInSubstitution[LocalVariableDescriptor]

'typeReference' @ [626:65] ==> public final val KtTypeProjection.typeReference: KtTypeReference?[MyPropertyDescriptor]

'if (argumentTypeReferenceElement != null) {
                trace.report(UPPER_BOUND_VIOLATED.on(argumentTypeReferenceElement, bound, argument))
            }
            else if (type != null) {
                trace.report(UPPER_BOUND_VIOLATED_IN_TYPEALIAS_EXPANSION.on(type, bound, argument, typeParameter))
            }' @ [627:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'argumentTypeReferenceElement' @ [627:17] ==> val argumentTypeReferenceElement: KtTypeReference? defined in org.jetbrains.kotlin.resolve.TypeResolver.TracingTypeAliasExpansionReportStrategy.boundsViolationInSubstitution[LocalVariableDescriptor]

'trace' @ [628:17] ==> public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.TypeResolver.TracingTypeAliasExpansionReportStrategy[PropertyDescriptorImpl]

'report' @ [628:23] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'UPPER_BOUND_VIOLATED' @ [628:30] ==> public final val UPPER_BOUND_VIOLATED: (DiagnosticFactory2<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?), (KotlinType..KotlinType?)>..DiagnosticFactory2<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [628:51] ==> @NotNull public open fun on(@NotNull element: KtTypeReference, @NotNull a: KotlinType, @NotNull b: KotlinType): ParametrizedDiagnostic<(KtTypeReference..KtTypeReference?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'argumentTypeReferenceElement' @ [628:54] ==> val argumentTypeReferenceElement: KtTypeReference? defined in org.jetbrains.kotlin.resolve.TypeResolver.TracingTypeAliasExpansionReportStrategy.boundsViolationInSubstitution[LocalVariableDescriptor]

'bound' @ [628:84] ==> value-parameter bound: KotlinType defined in org.jetbrains.kotlin.resolve.TypeResolver.TracingTypeAliasExpansionReportStrategy.boundsViolationInSubstitution[ValueParameterDescriptorImpl]

'argument' @ [628:91] ==> value-parameter argument: KotlinType defined in org.jetbrains.kotlin.resolve.TypeResolver.TracingTypeAliasExpansionReportStrategy.boundsViolationInSubstitution[ValueParameterDescriptorImpl]

'type' @ [630:22] ==> public final val type: KtElement? defined in org.jetbrains.kotlin.resolve.TypeResolver.TracingTypeAliasExpansionReportStrategy[PropertyDescriptorImpl]

'trace' @ [631:17] ==> public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.TypeResolver.TracingTypeAliasExpansionReportStrategy[PropertyDescriptorImpl]

'report' @ [631:23] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'UPPER_BOUND_VIOLATED_IN_TYPEALIAS_EXPANSION' @ [631:30] ==> public final val UPPER_BOUND_VIOLATED_IN_TYPEALIAS_EXPANSION: (DiagnosticFactory3<(KtElement..KtElement?), (KotlinType..KotlinType?), (KotlinType..KotlinType?), (ClassifierDescriptor..ClassifierDescriptor?)>..DiagnosticFactory3<(KtElement..KtElement?), (KotlinType..KotlinType?), (KotlinType..KotlinType?), (ClassifierDescriptor..ClassifierDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [631:74] ==> @NotNull public open fun on(@NotNull element: KtElement, @NotNull a: KotlinType, @NotNull b: KotlinType, @NotNull c: ClassifierDescriptor): ParametrizedDiagnostic<(KtElement..KtElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory3[JavaMethodDescriptor]

'type' @ [631:77] ==> public final val type: KtElement? defined in org.jetbrains.kotlin.resolve.TypeResolver.TracingTypeAliasExpansionReportStrategy[PropertyDescriptorImpl]

'bound' @ [631:83] ==> value-parameter bound: KotlinType defined in org.jetbrains.kotlin.resolve.TypeResolver.TracingTypeAliasExpansionReportStrategy.boundsViolationInSubstitution[ValueParameterDescriptorImpl]

'argument' @ [631:90] ==> value-parameter argument: KotlinType defined in org.jetbrains.kotlin.resolve.TypeResolver.TracingTypeAliasExpansionReportStrategy.boundsViolationInSubstitution[ValueParameterDescriptorImpl]

'typeParameter' @ [631:100] ==> value-parameter typeParameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.TypeResolver.TracingTypeAliasExpansionReportStrategy.boundsViolationInSubstitution[ValueParameterDescriptorImpl]

'?:' @ [636:35] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtAnnotationEntry?, right: KtAnnotationEntry): KtAnnotationEntry[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtAnnotationEntry

'annotation' @ [636:36] ==> value-parameter annotation: AnnotationDescriptor defined in org.jetbrains.kotlin.resolve.TypeResolver.TracingTypeAliasExpansionReportStrategy.repeatedAnnotation[ValueParameterDescriptorImpl]

'source' @ [636:47] ==> public abstract val source: SourceElement defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationDescriptor[DeserializedPropertyDescriptor]

'psi' @ [636:80] ==> public open val psi: KtElement defined in org.jetbrains.kotlin.resolve.source.KotlinSourceElement[PropertyDescriptorImpl]

'trace' @ [637:13] ==> public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.TypeResolver.TracingTypeAliasExpansionReportStrategy[PropertyDescriptorImpl]

'report' @ [637:19] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'REPEATED_ANNOTATION' @ [637:26] ==> public final val REPEATED_ANNOTATION: (DiagnosticFactory0<(KtAnnotationEntry..KtAnnotationEntry?)>..DiagnosticFactory0<(KtAnnotationEntry..KtAnnotationEntry?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [637:46] ==> @NotNull public open fun on(@NotNull element: KtAnnotationEntry): SimpleDiagnostic<(KtAnnotationEntry..KtAnnotationEntry?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'annotationEntry' @ [637:49] ==> val annotationEntry: KtAnnotationEntry defined in org.jetbrains.kotlin.resolve.TypeResolver.TracingTypeAliasExpansionReportStrategy.repeatedAnnotation[LocalVariableDescriptor]

'type' @ [646:13] ==> @NotNull public open fun type(@NotNull actualType: KotlinType): PossiblyBareType defined in org.jetbrains.kotlin.resolve.PossiblyBareType[JavaMethodDescriptor]

'createErrorTypeWithArguments' @ [646:29] ==> @NotNull public open fun createErrorTypeWithArguments(@NotNull p0: String, @NotNull p1: (MutableList<(TypeProjection..TypeProjection?)>..List<(TypeProjection..TypeProjection?)>)): SimpleType defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'typeConstructor' @ [647:21] ==> value-parameter typeConstructor: TypeConstructor defined in org.jetbrains.kotlin.resolve.TypeResolver.createErrorTypeForTypeConstructor[ValueParameterDescriptorImpl]

'declarationDescriptor' @ [647:37] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'name' @ [647:60] ==> public final val ClassifierDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [647:66] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'typeConstructor' @ [647:80] ==> value-parameter typeConstructor: TypeConstructor defined in org.jetbrains.kotlin.resolve.TypeResolver.createErrorTypeForTypeConstructor[ValueParameterDescriptorImpl]

'toString' @ [647:96] ==> public open fun toString(): String defined in org.jetbrains.kotlin.types.TypeConstructor[DeserializedSimpleFunctionDescriptor]

'resolveTypeProjectionsWithErrorConstructor' @ [648:21] ==> private final fun resolveTypeProjectionsWithErrorConstructor(c: TypeResolutionContext, argumentElements: List<KtTypeProjection>, message: String = ...): List<TypeProjection> defined in org.jetbrains.kotlin.resolve.TypeResolver[SimpleFunctionDescriptorImpl]

'c' @ [648:64] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.createErrorTypeForTypeConstructor[ValueParameterDescriptorImpl]

'arguments' @ [648:67] ==> value-parameter arguments: List<KtTypeProjection> defined in org.jetbrains.kotlin.resolve.TypeResolver.createErrorTypeForTypeConstructor[ValueParameterDescriptorImpl]

'classifierDescriptor' @ [665:34] ==> value-parameter classifierDescriptor: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.resolve.TypeResolver.isPossibleToSpecifyTypeArgumentsFor[ValueParameterDescriptorImpl]

'typeConstructor' @ [665:55] ==> public final val ClassifierDescriptorWithTypeParameters.typeConstructor: TypeConstructor[MyPropertyDescriptor]

'parameters' @ [665:71] ==> public final val TypeConstructor.parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'firstOrNull' @ [665:82] ==> public fun <T> List<(TypeParameterDescriptor..TypeParameterDescriptor?)>.firstOrNull(): TypeParameterDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)

'firstTypeParameter' @ [666:16] ==> val firstTypeParameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.TypeResolver.isPossibleToSpecifyTypeArgumentsFor[LocalVariableDescriptor]

'original' @ [666:35] ==> public final val TypeParameterDescriptor.original: TypeParameterDescriptor[MyPropertyDescriptor]

'containingDeclaration' @ [666:44] ==> public final val TypeParameterDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'classifierDescriptor' @ [680:41] ==> value-parameter classifierDescriptor: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[ValueParameterDescriptorImpl]

'classifierDescriptorsFromInnerToOuter' @ [680:62] ==> private final fun ClassifierDescriptor?.classifierDescriptorsFromInnerToOuter(): List<ClassifierDescriptorWithTypeParameters> defined in org.jetbrains.kotlin.resolve.TypeResolver[SimpleFunctionDescriptorImpl]

'qualifierParts' @ [681:38] ==> value-parameter qualifierParts: List<QualifiedExpressionResolver.QualifierPart> defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[ValueParameterDescriptorImpl]

'asReversed' @ [681:53] ==> public fun <T> List<QualifiedExpressionResolver.QualifierPart>.asReversed(): List<QualifiedExpressionResolver.QualifierPart> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> QualifierPart

'SmartList' @ [684:22] ==> public constructor SmartList<E : (Any..Any?)>() defined in com.intellij.util.SmartList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtTypeProjection

'-' @ [686:40] ==> public final operator fun minus(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'min' @ [686:45] ==> public open fun min(p0: Int, p1: Int): Int defined in java.lang.Math[JavaMethodDescriptor]

'classifierDescriptorChain' @ [686:49] ==> val classifierDescriptorChain: List<ClassifierDescriptorWithTypeParameters> defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[LocalVariableDescriptor]

'size' @ [686:75] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'reversedQualifierParts' @ [686:81] ==> val reversedQualifierParts: List<QualifiedExpressionResolver.QualifierPart> defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[LocalVariableDescriptor]

'size' @ [686:104] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'..' @ [688:23] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'classifierChainLastIndex' @ [688:26] ==> val classifierChainLastIndex: Int defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[LocalVariableDescriptor]

'reversedQualifierParts' @ [689:33] ==> val reversedQualifierParts: List<QualifiedExpressionResolver.QualifierPart> defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[LocalVariableDescriptor]

'index' @ [689:56] ==> val index: Int defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[LocalVariableDescriptor]

'qualifierPart' @ [690:36] ==> val qualifierPart: QualifiedExpressionResolver.QualifierPart defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[LocalVariableDescriptor]

'typeArguments' @ [690:50] ==> public final val typeArguments: KtTypeArgumentList? defined in org.jetbrains.kotlin.resolve.QualifiedExpressionResolver.QualifierPart[PropertyDescriptorImpl]

'arguments' @ [690:65] ==> public final val KtTypeArgumentList.arguments: (MutableList<(KtTypeProjection..KtTypeProjection?)>..List<(KtTypeProjection..KtTypeProjection?)>)[MyPropertyDescriptor]

'orEmpty' @ [690:75] ==> @InlineOnly public inline fun <T> List<(KtTypeProjection..KtTypeProjection?)>?.orEmpty(): List<(KtTypeProjection..KtTypeProjection?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtTypeProjection..org.jetbrains.kotlin.psi.KtTypeProjection?)

'classifierDescriptorChain' @ [691:42] ==> val classifierDescriptorChain: List<ClassifierDescriptorWithTypeParameters> defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[LocalVariableDescriptor]

'index' @ [691:68] ==> val index: Int defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[LocalVariableDescriptor]

'declaredTypeParameters' @ [691:75] ==> public final val ClassifierDescriptorWithTypeParameters.declaredTypeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'if (wasStatic) emptyList() else declaredTypeParameters' @ [692:37] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>, elseBranch: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>): List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<(org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)>

'wasStatic' @ [692:41] ==> var wasStatic: Boolean defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[LocalVariableDescriptor]

'emptyList' @ [692:52] ==> public fun <T> emptyList(): List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)

'declaredTypeParameters' @ [692:69] ==> val declaredTypeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[LocalVariableDescriptor]

'wasStatic' @ [694:17] ==> var wasStatic: Boolean defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[LocalVariableDescriptor]

'currentArguments' @ [694:30] ==> val currentArguments: List<(KtTypeProjection..KtTypeProjection?)> defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[LocalVariableDescriptor]

'isNotEmpty' @ [694:47] ==> @InlineOnly public inline fun <T> Collection<(KtTypeProjection..KtTypeProjection?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtTypeProjection..org.jetbrains.kotlin.psi.KtTypeProjection?)

'declaredTypeParameters' @ [694:63] ==> val declaredTypeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[LocalVariableDescriptor]

'isNotEmpty' @ [694:86] ==> @InlineOnly public inline fun <T> Collection<(TypeParameterDescriptor..TypeParameterDescriptor?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)

'c' @ [695:17] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[ValueParameterDescriptorImpl]

'trace' @ [695:19] ==> public final val trace: (BindingTrace..BindingTrace?) defined in org.jetbrains.kotlin.resolve.TypeResolutionContext[JavaPropertyDescriptor]

'report' @ [695:25] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'TYPE_ARGUMENTS_FOR_OUTER_CLASS_WHEN_NESTED_REFERENCED' @ [695:32] ==> public final val TYPE_ARGUMENTS_FOR_OUTER_CLASS_WHEN_NESTED_REFERENCED: (DiagnosticFactory0<(KtTypeArgumentList..KtTypeArgumentList?)>..DiagnosticFactory0<(KtTypeArgumentList..KtTypeArgumentList?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [695:86] ==> @NotNull public open fun on(@NotNull element: KtTypeArgumentList): SimpleDiagnostic<(KtTypeArgumentList..KtTypeArgumentList?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'qualifierPart' @ [695:89] ==> val qualifierPart: QualifiedExpressionResolver.QualifierPart defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[LocalVariableDescriptor]

'typeArguments' @ [695:103] ==> public final val typeArguments: KtTypeArgumentList? defined in org.jetbrains.kotlin.resolve.QualifiedExpressionResolver.QualifierPart[PropertyDescriptorImpl]

'currentArguments' @ [699:17] ==> val currentArguments: List<(KtTypeProjection..KtTypeProjection?)> defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[LocalVariableDescriptor]

'size' @ [699:34] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'currentParameters' @ [699:42] ==> val currentParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[LocalVariableDescriptor]

'size' @ [699:60] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'c' @ [700:17] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[ValueParameterDescriptorImpl]

'trace' @ [700:19] ==> public final val trace: (BindingTrace..BindingTrace?) defined in org.jetbrains.kotlin.resolve.TypeResolutionContext[JavaPropertyDescriptor]

'report' @ [700:25] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'WRONG_NUMBER_OF_TYPE_ARGUMENTS' @ [701:25] ==> public final val WRONG_NUMBER_OF_TYPE_ARGUMENTS: (DiagnosticFactory2<(KtElement..KtElement?), (Int..Int?), (DeclarationDescriptor..DeclarationDescriptor?)>..DiagnosticFactory2<(KtElement..KtElement?), (Int..Int?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [701:56] ==> @NotNull public open fun on(@NotNull element: KtElement, @NotNull a: Int, @NotNull b: DeclarationDescriptor): ParametrizedDiagnostic<(KtElement..KtElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'qualifierPart' @ [702:33] ==> val qualifierPart: QualifiedExpressionResolver.QualifierPart defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[LocalVariableDescriptor]

'typeArguments' @ [702:47] ==> public final val typeArguments: KtTypeArgumentList? defined in org.jetbrains.kotlin.resolve.QualifiedExpressionResolver.QualifierPart[PropertyDescriptorImpl]

'qualifierPart' @ [702:64] ==> val qualifierPart: QualifiedExpressionResolver.QualifierPart defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[LocalVariableDescriptor]

'expression' @ [702:78] ==> public final val expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.resolve.QualifiedExpressionResolver.QualifierPart[PropertyDescriptorImpl]

'currentParameters' @ [703:33] ==> val currentParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[LocalVariableDescriptor]

'size' @ [703:51] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'classifierDescriptorChain' @ [703:57] ==> val classifierDescriptorChain: List<ClassifierDescriptorWithTypeParameters> defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[LocalVariableDescriptor]

'index' @ [703:83] ==> val index: Int defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[LocalVariableDescriptor]

'result' @ [709:13] ==> val result: SmartList<KtTypeProjection> defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[LocalVariableDescriptor]

'addAll' @ [709:20] ==> public open fun addAll(elements: Collection<(KtTypeProjection..KtTypeProjection?)>): Boolean defined in com.intellij.util.SmartList[JavaMethodDescriptor]

'currentArguments' @ [709:27] ==> val currentArguments: List<(KtTypeProjection..KtTypeProjection?)> defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[LocalVariableDescriptor]

'wasStatic' @ [711:13] ==> var wasStatic: Boolean defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[LocalVariableDescriptor]

'wasStatic' @ [711:25] ==> var wasStatic: Boolean defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[LocalVariableDescriptor]

'!' @ [711:38] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'classifierDescriptorChain' @ [711:39] ==> val classifierDescriptorChain: List<ClassifierDescriptorWithTypeParameters> defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[LocalVariableDescriptor]

'index' @ [711:65] ==> val index: Int defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[LocalVariableDescriptor]

'isInner' @ [711:72] ==> public final val ClassifierDescriptorWithTypeParameters.isInner: Boolean[MyPropertyDescriptor]

'reversedQualifierParts' @ [715:17] ==> val reversedQualifierParts: List<QualifiedExpressionResolver.QualifierPart> defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[LocalVariableDescriptor]

'subList' @ [715:40] ==> public abstract fun subList(fromIndex: Int, toIndex: Int): List<QualifiedExpressionResolver.QualifierPart> defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'min' @ [716:30] ==> public open fun min(p0: Int, p1: Int): Int defined in java.lang.Math[JavaMethodDescriptor]

'classifierChainLastIndex' @ [716:34] ==> val classifierChainLastIndex: Int defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[LocalVariableDescriptor]

'reversedQualifierParts' @ [716:64] ==> val reversedQualifierParts: List<QualifiedExpressionResolver.QualifierPart> defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[LocalVariableDescriptor]

'size' @ [716:87] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'reversedQualifierParts' @ [717:25] ==> val reversedQualifierParts: List<QualifiedExpressionResolver.QualifierPart> defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[LocalVariableDescriptor]

'size' @ [717:48] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'component1' @ [719:15] ==> public final operator fun component1(): Name defined in org.jetbrains.kotlin.resolve.QualifiedExpressionResolver.QualifierPart[SimpleFunctionDescriptorImpl]

'component2' @ [719:18] ==> public final operator fun component2(): KtSimpleNameExpression defined in org.jetbrains.kotlin.resolve.QualifiedExpressionResolver.QualifierPart[SimpleFunctionDescriptorImpl]

'component3' @ [719:21] ==> public final operator fun component3(): KtTypeArgumentList? defined in org.jetbrains.kotlin.resolve.QualifiedExpressionResolver.QualifierPart[SimpleFunctionDescriptorImpl]

'nonClassQualifierParts' @ [719:39] ==> val nonClassQualifierParts: List<QualifiedExpressionResolver.QualifierPart> defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[LocalVariableDescriptor]

'typeArguments' @ [720:17] ==> val typeArguments: KtTypeArgumentList? defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[LocalVariableDescriptor]

'c' @ [721:17] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[ValueParameterDescriptorImpl]

'trace' @ [721:19] ==> public final val trace: (BindingTrace..BindingTrace?) defined in org.jetbrains.kotlin.resolve.TypeResolutionContext[JavaPropertyDescriptor]

'report' @ [721:25] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'TYPE_ARGUMENTS_NOT_ALLOWED' @ [721:32] ==> public final val TYPE_ARGUMENTS_NOT_ALLOWED: (DiagnosticFactory1<(KtElement..KtElement?), (String..String?)>..DiagnosticFactory1<(KtElement..KtElement?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [721:59] ==> @NotNull public open fun on(@NotNull element: KtElement, @NotNull argument: String): ParametrizedDiagnostic<(KtElement..KtElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'typeArguments' @ [721:62] ==> val typeArguments: KtTypeArgumentList? defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[LocalVariableDescriptor]

'classifierDescriptor' @ [726:26] ==> value-parameter classifierDescriptor: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[ValueParameterDescriptorImpl]

'typeConstructor' @ [726:47] ==> public final val ClassifierDescriptorWithTypeParameters.typeConstructor: TypeConstructor[MyPropertyDescriptor]

'parameters' @ [726:63] ==> public final val TypeConstructor.parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'result' @ [727:13] ==> val result: SmartList<KtTypeProjection> defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[LocalVariableDescriptor]

'size' @ [727:20] ==> public open val size: Int defined in com.intellij.util.SmartList[JavaPropertyDescriptor]

'parameters' @ [727:27] ==> val parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[LocalVariableDescriptor]

'size' @ [727:38] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'parameters' @ [729:21] ==> val parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[LocalVariableDescriptor]

'result' @ [729:32] ==> val result: SmartList<KtTypeProjection> defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[LocalVariableDescriptor]

'size' @ [729:39] ==> public open val size: Int defined in com.intellij.util.SmartList[JavaPropertyDescriptor]

'original' @ [729:45] ==> public final val TypeParameterDescriptor.original: TypeParameterDescriptor[MyPropertyDescriptor]

'containingDeclaration' @ [729:54] ==> public final val TypeParameterDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'Pair' @ [732:31] ==> public constructor Pair<out A, out B>(first: SmartList<KtTypeProjection>, second: Nothing?) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> SmartList<KtTypeProjection>
    <out B> -> Nothing?

'result' @ [732:36] ==> val result: SmartList<KtTypeProjection> defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[LocalVariableDescriptor]

'c' @ [734:33] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[ValueParameterDescriptorImpl]

'scope' @ [734:35] ==> public final val scope: (LexicalScope..LexicalScope?) defined in org.jetbrains.kotlin.resolve.TypeResolutionContext[JavaPropertyDescriptor]

'findImplicitOuterClassArguments' @ [734:41] ==> private final fun LexicalScope.findImplicitOuterClassArguments(outerClass: ClassDescriptor): List<TypeProjection>? defined in org.jetbrains.kotlin.resolve.TypeResolver[SimpleFunctionDescriptorImpl]

'nextParameterOwner' @ [734:73] ==> val nextParameterOwner: ClassDescriptor defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[LocalVariableDescriptor]

'parameters' @ [735:34] ==> val parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[LocalVariableDescriptor]

'subList' @ [735:45] ==> public abstract fun subList(fromIndex: Int, toIndex: Int): List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'result' @ [735:53] ==> val result: SmartList<KtTypeProjection> defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[LocalVariableDescriptor]

'size' @ [735:60] ==> public open val size: Int defined in com.intellij.util.SmartList[JavaPropertyDescriptor]

'parameters' @ [735:66] ==> val parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[LocalVariableDescriptor]

'size' @ [735:77] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'classifierDescriptor' @ [738:21] ==> value-parameter classifierDescriptor: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[ValueParameterDescriptorImpl]

'classifierDescriptorsFromInnerToOuter' @ [738:42] ==> private final fun ClassifierDescriptor?.classifierDescriptorsFromInnerToOuter(): List<ClassifierDescriptorWithTypeParameters> defined in org.jetbrains.kotlin.resolve.TypeResolver[SimpleFunctionDescriptorImpl]

'sumBy' @ [738:82] ==> public inline fun <T> Iterable<ClassifierDescriptorWithTypeParameters>.sumBy(selector: (ClassifierDescriptorWithTypeParameters) -> Int): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassifierDescriptorWithTypeParameters

'it' @ [738:90] ==> value-parameter it: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor.<anonymous>[ValueParameterDescriptorImpl]

'declaredTypeParameters' @ [738:93] ==> public final val ClassifierDescriptorWithTypeParameters.declaredTypeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'size' @ [738:116] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'if (restArguments == null && typeArgumentsCanBeSpecifiedCount > result.size) {
                c.trace.report(
                        OUTER_CLASS_ARGUMENTS_REQUIRED.on(qualifierParts.first().expression, nextParameterOwner))
                return null
            }
            else if (restArguments == null) {
                assert(typeArgumentsCanBeSpecifiedCount == result.size) {
                    "Number of type arguments that can be specified ($typeArgumentsCanBeSpecifiedCount) " +
                    "should be equal to actual arguments number ${result.size}, (classifier: $classifierDescriptor)"
                }
                return Pair(result, null)
            }
            else {
                assert(restParameters.size == restArguments.size) {
                    "Number of type of restParameters should be equal to ${restArguments.size}, " +
                    "but ${restArguments.size} were found for $classifierDescriptor/$nextParameterOwner"
                }

                return Pair(result, restArguments)
            }' @ [740:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'restArguments' @ [740:17] ==> val restArguments: List<TypeProjection>? defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[LocalVariableDescriptor]

'typeArgumentsCanBeSpecifiedCount' @ [740:42] ==> val typeArgumentsCanBeSpecifiedCount: Int defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[LocalVariableDescriptor]

'result' @ [740:77] ==> val result: SmartList<KtTypeProjection> defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[LocalVariableDescriptor]

'size' @ [740:84] ==> public open val size: Int defined in com.intellij.util.SmartList[JavaPropertyDescriptor]

'c' @ [741:17] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[ValueParameterDescriptorImpl]

'trace' @ [741:19] ==> public final val trace: (BindingTrace..BindingTrace?) defined in org.jetbrains.kotlin.resolve.TypeResolutionContext[JavaPropertyDescriptor]

'report' @ [741:25] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'OUTER_CLASS_ARGUMENTS_REQUIRED' @ [742:25] ==> public final val OUTER_CLASS_ARGUMENTS_REQUIRED: (DiagnosticFactory1<(KtElement..KtElement?), (ClassDescriptor..ClassDescriptor?)>..DiagnosticFactory1<(KtElement..KtElement?), (ClassDescriptor..ClassDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [742:56] ==> @NotNull public open fun on(@NotNull element: KtElement, @NotNull argument: ClassDescriptor): ParametrizedDiagnostic<(KtElement..KtElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'qualifierParts' @ [742:59] ==> value-parameter qualifierParts: List<QualifiedExpressionResolver.QualifierPart> defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[ValueParameterDescriptorImpl]

'first' @ [742:74] ==> public fun <T> List<QualifiedExpressionResolver.QualifierPart>.first(): QualifiedExpressionResolver.QualifierPart defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> QualifierPart

'expression' @ [742:82] ==> public final val expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.resolve.QualifiedExpressionResolver.QualifierPart[PropertyDescriptorImpl]

'nextParameterOwner' @ [742:94] ==> val nextParameterOwner: ClassDescriptor defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[LocalVariableDescriptor]

'if (restArguments == null) {
                assert(typeArgumentsCanBeSpecifiedCount == result.size) {
                    "Number of type arguments that can be specified ($typeArgumentsCanBeSpecifiedCount) " +
                    "should be equal to actual arguments number ${result.size}, (classifier: $classifierDescriptor)"
                }
                return Pair(result, null)
            }
            else {
                assert(restParameters.size == restArguments.size) {
                    "Number of type of restParameters should be equal to ${restArguments.size}, " +
                    "but ${restArguments.size} were found for $classifierDescriptor/$nextParameterOwner"
                }

                return Pair(result, restArguments)
            }' @ [745:18] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'restArguments' @ [745:22] ==> val restArguments: List<TypeProjection>? defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[LocalVariableDescriptor]

'assert' @ [746:17] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'typeArgumentsCanBeSpecifiedCount' @ [746:24] ==> val typeArgumentsCanBeSpecifiedCount: Int defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[LocalVariableDescriptor]

'result' @ [746:60] ==> val result: SmartList<KtTypeProjection> defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[LocalVariableDescriptor]

'size' @ [746:67] ==> public open val size: Int defined in com.intellij.util.SmartList[JavaPropertyDescriptor]

'+' @ [747:21] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'typeArgumentsCanBeSpecifiedCount' @ [747:71] ==> val typeArgumentsCanBeSpecifiedCount: Int defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[LocalVariableDescriptor]

'result' @ [748:67] ==> val result: SmartList<KtTypeProjection> defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[LocalVariableDescriptor]

'size' @ [748:74] ==> public open val size: Int defined in com.intellij.util.SmartList[JavaPropertyDescriptor]

'classifierDescriptor' @ [748:95] ==> value-parameter classifierDescriptor: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[ValueParameterDescriptorImpl]

'Pair' @ [750:24] ==> public constructor Pair<out A, out B>(first: SmartList<KtTypeProjection>, second: Nothing?) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> SmartList<KtTypeProjection>
    <out B> -> Nothing?

'result' @ [750:29] ==> val result: SmartList<KtTypeProjection> defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[LocalVariableDescriptor]

'assert' @ [753:17] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'restParameters' @ [753:24] ==> val restParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[LocalVariableDescriptor]

'size' @ [753:39] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'restArguments' @ [753:47] ==> val restArguments: List<TypeProjection>? defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[LocalVariableDescriptor]

'size' @ [753:61] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'+' @ [754:21] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'restArguments' @ [754:76] ==> val restArguments: List<TypeProjection>? defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[LocalVariableDescriptor]

'size' @ [754:90] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'restArguments' @ [755:28] ==> val restArguments: List<TypeProjection>? defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[LocalVariableDescriptor]

'size' @ [755:42] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'classifierDescriptor' @ [755:64] ==> value-parameter classifierDescriptor: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[ValueParameterDescriptorImpl]

'nextParameterOwner' @ [755:86] ==> val nextParameterOwner: ClassDescriptor defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[LocalVariableDescriptor]

'Pair' @ [758:24] ==> public constructor Pair<out A, out B>(first: SmartList<KtTypeProjection>, second: List<TypeProjection>) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> SmartList<KtTypeProjection>
    <out B> -> List<TypeProjection>

'result' @ [758:29] ==> val result: SmartList<KtTypeProjection> defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[LocalVariableDescriptor]

'restArguments' @ [758:37] ==> val restArguments: List<TypeProjection>? defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[LocalVariableDescriptor]

'Pair' @ [762:16] ==> public constructor Pair<out A, out B>(first: SmartList<KtTypeProjection>, second: Nothing?) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> SmartList<KtTypeProjection>
    <out B> -> Nothing?

'result' @ [762:21] ==> val result: SmartList<KtTypeProjection> defined in org.jetbrains.kotlin.resolve.TypeResolver.collectArgumentsForClassifierTypeConstructor[LocalVariableDescriptor]

'generateSequence' @ [766:13] ==> public fun <T : Any> generateSequence(seedFunction: () -> ClassifierDescriptorWithTypeParameters?, nextFunction: (ClassifierDescriptorWithTypeParameters) -> ClassifierDescriptorWithTypeParameters?): Sequence<ClassifierDescriptorWithTypeParameters> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> ClassifierDescriptorWithTypeParameters

'this' @ [767:23] ==> <this> defined in org.jetbrains.kotlin.resolve.TypeResolver.classifierDescriptorsFromInnerToOuter[ReceiverParameterDescriptorImpl]

'it' @ [768:23] ==> value-parameter it: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.resolve.TypeResolver.classifierDescriptorsFromInnerToOuter.<anonymous>[ValueParameterDescriptorImpl]

'containingDeclaration' @ [768:26] ==> public final val ClassifierDescriptorWithTypeParameters.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'toList' @ [769:15] ==> public fun <T> Sequence<ClassifierDescriptorWithTypeParameters>.toList(): List<ClassifierDescriptorWithTypeParameters> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassifierDescriptorWithTypeParameters

'resolveTypeProjections' @ [775:9] ==> public final fun resolveTypeProjections(c: TypeResolutionContext, constructor: TypeConstructor, argumentElements: List<KtTypeProjection>): List<TypeProjection> defined in org.jetbrains.kotlin.resolve.TypeResolver[SimpleFunctionDescriptorImpl]

'c' @ [775:32] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeProjectionsWithErrorConstructor[ValueParameterDescriptorImpl]

'createErrorTypeConstructor' @ [775:46] ==> @NotNull public open fun createErrorTypeConstructor(@NotNull p0: String): TypeConstructor defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'message' @ [775:73] ==> value-parameter message: String = ... defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeProjectionsWithErrorConstructor[ValueParameterDescriptorImpl]

'argumentElements' @ [775:83] ==> value-parameter argumentElements: List<KtTypeProjection> defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeProjectionsWithErrorConstructor[ValueParameterDescriptorImpl]

'constructorParameters' @ [789:9] ==> value-parameter constructorParameters: List<TypeParameterDescriptor> defined in org.jetbrains.kotlin.resolve.TypeResolver.appendDefaultArgumentsForLocalClassifier[ValueParameterDescriptorImpl]

'subList' @ [789:31] ==> public abstract fun subList(fromIndex: Int, toIndex: Int): List<TypeParameterDescriptor> defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'fromIndex' @ [789:39] ==> value-parameter fromIndex: Int defined in org.jetbrains.kotlin.resolve.TypeResolver.appendDefaultArgumentsForLocalClassifier[ValueParameterDescriptorImpl]

'constructorParameters' @ [789:50] ==> value-parameter constructorParameters: List<TypeParameterDescriptor> defined in org.jetbrains.kotlin.resolve.TypeResolver.appendDefaultArgumentsForLocalClassifier[ValueParameterDescriptorImpl]

'size' @ [789:72] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'map' @ [789:78] ==> public inline fun <T, R> Iterable<TypeParameterDescriptor>.map(transform: (TypeParameterDescriptor) -> TypeProjectionImpl): List<TypeProjectionImpl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameterDescriptor
    <R> -> TypeProjectionImpl

'TypeProjectionImpl' @ [790:9] ==> public constructor TypeProjectionImpl(@NotNull p0: KotlinType) defined in org.jetbrains.kotlin.types.TypeProjectionImpl[JavaClassConstructorDescriptor]

'it' @ [790:28] ==> value-parameter it: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.TypeResolver.appendDefaultArgumentsForLocalClassifier.<anonymous>[ValueParameterDescriptorImpl]

'original' @ [790:31] ==> public final val TypeParameterDescriptor.original: TypeParameterDescriptor[MyPropertyDescriptor]

'defaultType' @ [790:40] ==> public final val TypeParameterDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'argumentElements' @ [798:16] ==> value-parameter argumentElements: List<KtTypeProjection> defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeProjections[ValueParameterDescriptorImpl]

'mapIndexed' @ [798:33] ==> public inline fun <T, R> Iterable<KtTypeProjection>.mapIndexed(transform: (index: Int, KtTypeProjection) -> TypeProjection): List<TypeProjection> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtTypeProjection
    <R> -> TypeProjection

'argumentElement' @ [799:34] ==> value-parameter argumentElement: KtTypeProjection defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeProjections.<anonymous>[ValueParameterDescriptorImpl]

'projectionKind' @ [799:50] ==> public final val KtTypeProjection.projectionKind: KtProjectionKind[MyPropertyDescriptor]

'ModifierCheckerCore' @ [800:13] ==> public object ModifierCheckerCore defined in org.jetbrains.kotlin.resolve in file ModifiersChecker.kt[FakeCallableDescriptorForObject]

'check' @ [800:33] ==> public final fun check(listOwner: KtModifierListOwner, trace: BindingTrace, descriptor: DeclarationDescriptor?, languageVersionSettings: LanguageVersionSettings): Unit defined in org.jetbrains.kotlin.resolve.ModifierCheckerCore[SimpleFunctionDescriptorImpl]

'argumentElement' @ [800:39] ==> value-parameter argumentElement: KtTypeProjection defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeProjections.<anonymous>[ValueParameterDescriptorImpl]

'c' @ [800:56] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeProjections[ValueParameterDescriptorImpl]

'trace' @ [800:58] ==> public final val trace: (BindingTrace..BindingTrace?) defined in org.jetbrains.kotlin.resolve.TypeResolutionContext[JavaPropertyDescriptor]

'languageVersionSettings' @ [800:71] ==> private final val languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.resolve.TypeResolver[PropertyDescriptorImpl]

'if (projectionKind == KtProjectionKind.STAR) {
                val parameters = constructor.parameters
                if (parameters.size > i) {
                    val parameterDescriptor = parameters[i]
                    TypeUtils.makeStarProjection(parameterDescriptor)
                }
                else {
                    TypeProjectionImpl(OUT_VARIANCE, ErrorUtils.createErrorType("*"))
                }
            }
            else {
                val type = resolveType(c.noBareTypes(), argumentElement.typeReference!!)
                val kind = resolveProjectionKind(projectionKind)
                if (constructor.parameters.size > i) {
                    val parameterDescriptor = constructor.parameters[i]
                    if (kind != INVARIANT && parameterDescriptor.variance != INVARIANT) {
                        if (kind == parameterDescriptor.variance) {
                            c.trace.report(REDUNDANT_PROJECTION.on(argumentElement, constructor.declarationDescriptor!!))
                        }
                        else {
                            c.trace.report(CONFLICTING_PROJECTION.on(argumentElement, constructor.declarationDescriptor!!))
                        }
                    }
                }
                TypeProjectionImpl(kind, type)
            }' @ [801:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: TypeProjection, elseBranch: TypeProjection): TypeProjection[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> TypeProjection

'projectionKind' @ [801:17] ==> val projectionKind: KtProjectionKind defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeProjections.<anonymous>[LocalVariableDescriptor]

'STAR' @ [801:52] ==> enum entry STAR defined in org.jetbrains.kotlin.psi.KtProjectionKind[FakeCallableDescriptorForObject]

'constructor' @ [802:34] ==> value-parameter constructor: TypeConstructor defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeProjections[ValueParameterDescriptorImpl]

'parameters' @ [802:46] ==> public final val TypeConstructor.parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'if (parameters.size > i) {
                    val parameterDescriptor = parameters[i]
                    TypeUtils.makeStarProjection(parameterDescriptor)
                }
                else {
                    TypeProjectionImpl(OUT_VARIANCE, ErrorUtils.createErrorType("*"))
                }' @ [803:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: TypeProjection, elseBranch: TypeProjection): TypeProjection[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> TypeProjection

'parameters' @ [803:21] ==> val parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeProjections.<anonymous>[LocalVariableDescriptor]

'size' @ [803:32] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'i' @ [803:39] ==> value-parameter i: Int defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeProjections.<anonymous>[ValueParameterDescriptorImpl]

'parameters' @ [804:47] ==> val parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeProjections.<anonymous>[LocalVariableDescriptor]

'i' @ [804:58] ==> value-parameter i: Int defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeProjections.<anonymous>[ValueParameterDescriptorImpl]

'makeStarProjection' @ [805:31] ==> @NotNull public open fun makeStarProjection(@NotNull p0: TypeParameterDescriptor): TypeProjection defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'parameterDescriptor' @ [805:50] ==> val parameterDescriptor: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeProjections.<anonymous>[LocalVariableDescriptor]

'TypeProjectionImpl' @ [808:21] ==> public constructor TypeProjectionImpl(@NotNull p0: Variance, @NotNull p1: KotlinType) defined in org.jetbrains.kotlin.types.TypeProjectionImpl[JavaClassConstructorDescriptor]

'OUT_VARIANCE' @ [808:40] ==> enum entry OUT_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'createErrorType' @ [808:65] ==> @NotNull public open fun createErrorType(@NotNull p0: String): SimpleType defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'resolveType' @ [812:28] ==> private final fun resolveType(c: TypeResolutionContext, typeReference: KtTypeReference): KotlinType defined in org.jetbrains.kotlin.resolve.TypeResolver[SimpleFunctionDescriptorImpl]

'c' @ [812:40] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeProjections[ValueParameterDescriptorImpl]

'noBareTypes' @ [812:42] ==> @NotNull public open fun noBareTypes(): TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolutionContext[JavaMethodDescriptor]

'argumentElement' @ [812:57] ==> value-parameter argumentElement: KtTypeProjection defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeProjections.<anonymous>[ValueParameterDescriptorImpl]

'typeReference' @ [812:73] ==> public final val KtTypeProjection.typeReference: KtTypeReference?[MyPropertyDescriptor]

'resolveProjectionKind' @ [813:28] ==> @JvmStatic public final fun resolveProjectionKind(projectionKind: KtProjectionKind): Variance defined in org.jetbrains.kotlin.resolve.TypeResolver.Companion[SimpleFunctionDescriptorImpl]

'projectionKind' @ [813:50] ==> val projectionKind: KtProjectionKind defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeProjections.<anonymous>[LocalVariableDescriptor]

'constructor' @ [814:21] ==> value-parameter constructor: TypeConstructor defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeProjections[ValueParameterDescriptorImpl]

'parameters' @ [814:33] ==> public final val TypeConstructor.parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'size' @ [814:44] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'i' @ [814:51] ==> value-parameter i: Int defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeProjections.<anonymous>[ValueParameterDescriptorImpl]

'constructor' @ [815:47] ==> value-parameter constructor: TypeConstructor defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeProjections[ValueParameterDescriptorImpl]

'parameters' @ [815:59] ==> public final val TypeConstructor.parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'i' @ [815:70] ==> value-parameter i: Int defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeProjections.<anonymous>[ValueParameterDescriptorImpl]

'kind' @ [816:25] ==> val kind: Variance defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeProjections.<anonymous>[LocalVariableDescriptor]

'INVARIANT' @ [816:33] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'parameterDescriptor' @ [816:46] ==> val parameterDescriptor: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeProjections.<anonymous>[LocalVariableDescriptor]

'variance' @ [816:66] ==> public final val TypeParameterDescriptor.variance: Variance[MyPropertyDescriptor]

'INVARIANT' @ [816:78] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'if (kind == parameterDescriptor.variance) {
                            c.trace.report(REDUNDANT_PROJECTION.on(argumentElement, constructor.declarationDescriptor!!))
                        }
                        else {
                            c.trace.report(CONFLICTING_PROJECTION.on(argumentElement, constructor.declarationDescriptor!!))
                        }' @ [817:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'kind' @ [817:29] ==> val kind: Variance defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeProjections.<anonymous>[LocalVariableDescriptor]

'parameterDescriptor' @ [817:37] ==> val parameterDescriptor: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeProjections.<anonymous>[LocalVariableDescriptor]

'variance' @ [817:57] ==> public final val TypeParameterDescriptor.variance: Variance[MyPropertyDescriptor]

'c' @ [818:29] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeProjections[ValueParameterDescriptorImpl]

'trace' @ [818:31] ==> public final val trace: (BindingTrace..BindingTrace?) defined in org.jetbrains.kotlin.resolve.TypeResolutionContext[JavaPropertyDescriptor]

'report' @ [818:37] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'REDUNDANT_PROJECTION' @ [818:44] ==> public final val REDUNDANT_PROJECTION: (DiagnosticFactory1<(KtTypeProjection..KtTypeProjection?), (ClassifierDescriptor..ClassifierDescriptor?)>..DiagnosticFactory1<(KtTypeProjection..KtTypeProjection?), (ClassifierDescriptor..ClassifierDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [818:65] ==> @NotNull public open fun on(@NotNull element: KtTypeProjection, @NotNull argument: ClassifierDescriptor): ParametrizedDiagnostic<(KtTypeProjection..KtTypeProjection?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'argumentElement' @ [818:68] ==> value-parameter argumentElement: KtTypeProjection defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeProjections.<anonymous>[ValueParameterDescriptorImpl]

'constructor' @ [818:85] ==> value-parameter constructor: TypeConstructor defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeProjections[ValueParameterDescriptorImpl]

'declarationDescriptor' @ [818:97] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'c' @ [821:29] ==> value-parameter c: TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeProjections[ValueParameterDescriptorImpl]

'trace' @ [821:31] ==> public final val trace: (BindingTrace..BindingTrace?) defined in org.jetbrains.kotlin.resolve.TypeResolutionContext[JavaPropertyDescriptor]

'report' @ [821:37] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'CONFLICTING_PROJECTION' @ [821:44] ==> public final val CONFLICTING_PROJECTION: (DiagnosticFactory1<(KtTypeProjection..KtTypeProjection?), (ClassifierDescriptor..ClassifierDescriptor?)>..DiagnosticFactory1<(KtTypeProjection..KtTypeProjection?), (ClassifierDescriptor..ClassifierDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [821:67] ==> @NotNull public open fun on(@NotNull element: KtTypeProjection, @NotNull argument: ClassifierDescriptor): ParametrizedDiagnostic<(KtTypeProjection..KtTypeProjection?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'argumentElement' @ [821:70] ==> value-parameter argumentElement: KtTypeProjection defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeProjections.<anonymous>[ValueParameterDescriptorImpl]

'constructor' @ [821:87] ==> value-parameter constructor: TypeConstructor defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeProjections[ValueParameterDescriptorImpl]

'declarationDescriptor' @ [821:99] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'TypeProjectionImpl' @ [825:17] ==> public constructor TypeProjectionImpl(@NotNull p0: Variance, @NotNull p1: KotlinType) defined in org.jetbrains.kotlin.types.TypeProjectionImpl[JavaClassConstructorDescriptor]

'kind' @ [825:36] ==> val kind: Variance defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeProjections.<anonymous>[LocalVariableDescriptor]

'type' @ [825:42] ==> val type: KotlinType defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeProjections.<anonymous>[LocalVariableDescriptor]

'findFirstFromMeAndParent' @ [834:30] ==> public inline fun <T : Any> HierarchicalScope.findFirstFromMeAndParent(fetch: (HierarchicalScope) -> ClassDescriptor?): ClassDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> ClassDescriptor

'if (scope is LexicalScope && scope.kind == LexicalScopeKind.CLASS_MEMBER_SCOPE)
                scope.ownerDescriptor as ClassDescriptor
            else
                null' @ [835:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ClassDescriptor?, elseBranch: ClassDescriptor?): ClassDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ClassDescriptor?

'scope' @ [835:17] ==> value-parameter scope: HierarchicalScope defined in org.jetbrains.kotlin.resolve.TypeResolver.findImplicitOuterClassArguments.<anonymous>[ValueParameterDescriptorImpl]

'scope' @ [835:42] ==> value-parameter scope: HierarchicalScope defined in org.jetbrains.kotlin.resolve.TypeResolver.findImplicitOuterClassArguments.<anonymous>[ValueParameterDescriptorImpl]

'kind' @ [835:48] ==> public abstract val kind: LexicalScopeKind defined in org.jetbrains.kotlin.resolve.scopes.LexicalScope[DeserializedPropertyDescriptor]

'CLASS_MEMBER_SCOPE' @ [835:73] ==> enum entry CLASS_MEMBER_SCOPE defined in org.jetbrains.kotlin.resolve.scopes.LexicalScopeKind[FakeCallableDescriptorForObject]

'scope' @ [836:17] ==> value-parameter scope: HierarchicalScope defined in org.jetbrains.kotlin.resolve.TypeResolver.findImplicitOuterClassArguments.<anonymous>[ValueParameterDescriptorImpl]

'ownerDescriptor' @ [836:23] ==> public abstract val ownerDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.LexicalScope[DeserializedPropertyDescriptor]

'findImplicitOuterClassArguments' @ [841:16] ==> public fun findImplicitOuterClassArguments(scopeOwner: ClassDescriptor, outerClass: ClassDescriptor): List<TypeProjection>? defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'enclosingClass' @ [841:48] ==> val enclosingClass: ClassDescriptor defined in org.jetbrains.kotlin.resolve.TypeResolver.findImplicitOuterClassArguments[LocalVariableDescriptor]

'outerClass' @ [841:64] ==> value-parameter outerClass: ClassDescriptor defined in org.jetbrains.kotlin.resolve.TypeResolver.findImplicitOuterClassArguments[ValueParameterDescriptorImpl]

'resolveDescriptorForType' @ [846:32] ==> public final fun resolveDescriptorForType(scope: LexicalScope, userType: KtUserType, trace: BindingTrace, isDebuggerContext: Boolean): QualifiedExpressionResolver.TypeQualifierResolutionResult defined in org.jetbrains.kotlin.resolve.TypeResolver[SimpleFunctionDescriptorImpl]

'scope' @ [846:57] ==> value-parameter scope: LexicalScope defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveClass[ValueParameterDescriptorImpl]

'userType' @ [846:64] ==> value-parameter userType: KtUserType defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveClass[ValueParameterDescriptorImpl]

'trace' @ [846:74] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveClass[ValueParameterDescriptorImpl]

'isDebuggerContext' @ [846:81] ==> value-parameter isDebuggerContext: Boolean defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveClass[ValueParameterDescriptorImpl]

'classifierDescriptor' @ [846:100] ==> public final val classifierDescriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.QualifiedExpressionResolver.TypeQualifierResolutionResult[PropertyDescriptorImpl]

'userType' @ [851:13] ==> value-parameter userType: KtUserType defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveDescriptorForType[ValueParameterDescriptorImpl]

'qualifier' @ [851:22] ==> public final val KtUserType.qualifier: KtUserType?[MyPropertyDescriptor]

'userType' @ [852:34] ==> value-parameter userType: KtUserType defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveDescriptorForType[ValueParameterDescriptorImpl]

'qualifier' @ [852:43] ==> public final val KtUserType.qualifier: KtUserType?[MyPropertyDescriptor]

'typeArguments' @ [852:55] ==> public final val KtUserType.typeArguments: (MutableList<(KtTypeProjection..KtTypeProjection?)>..List<(KtTypeProjection..KtTypeProjection?)>)[MyPropertyDescriptor]

'typeArgument' @ [853:17] ==> val typeArgument: (KtTypeProjection..KtTypeProjection?) defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveDescriptorForType[LocalVariableDescriptor]

'typeReference' @ [853:30] ==> public final val KtTypeProjection.typeReference: KtTypeReference?[MyPropertyDescriptor]

'let' @ [853:45] ==> @InlineOnly public inline fun <T, R> KtTypeReference.let(block: (KtTypeReference) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtTypeReference
    <R> -> Unit

'forceResolveTypeContents' @ [854:21] ==> private final fun forceResolveTypeContents(type: KotlinType): Unit defined in org.jetbrains.kotlin.resolve.TypeResolver[SimpleFunctionDescriptorImpl]

'resolveType' @ [854:46] ==> public final fun resolveType(scope: LexicalScope, typeReference: KtTypeReference, trace: BindingTrace, checkBounds: Boolean): KotlinType defined in org.jetbrains.kotlin.resolve.TypeResolver[SimpleFunctionDescriptorImpl]

'scope' @ [854:58] ==> value-parameter scope: LexicalScope defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveDescriptorForType[ValueParameterDescriptorImpl]

'it' @ [854:65] ==> value-parameter it: KtTypeReference defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveDescriptorForType.<anonymous>[ValueParameterDescriptorImpl]

'trace' @ [854:69] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveDescriptorForType[ValueParameterDescriptorImpl]

'qualifiedExpressionResolver' @ [859:16] ==> private final val qualifiedExpressionResolver: QualifiedExpressionResolver defined in org.jetbrains.kotlin.resolve.TypeResolver[PropertyDescriptorImpl]

'resolveDescriptorForType' @ [859:44] ==> public final fun resolveDescriptorForType(userType: KtUserType, scope: LexicalScope, trace: BindingTrace, isDebuggerContext: Boolean): QualifiedExpressionResolver.TypeQualifierResolutionResult defined in org.jetbrains.kotlin.resolve.QualifiedExpressionResolver[SimpleFunctionDescriptorImpl]

'userType' @ [859:69] ==> value-parameter userType: KtUserType defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveDescriptorForType[ValueParameterDescriptorImpl]

'scope' @ [859:79] ==> value-parameter scope: LexicalScope defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveDescriptorForType[ValueParameterDescriptorImpl]

'trace' @ [859:86] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveDescriptorForType[ValueParameterDescriptorImpl]

'isDebuggerContext' @ [859:93] ==> value-parameter isDebuggerContext: Boolean defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveDescriptorForType[ValueParameterDescriptorImpl]

'apply' @ [859:112] ==> @InlineOnly public inline fun <T> QualifiedExpressionResolver.TypeQualifierResolutionResult.apply(block: QualifiedExpressionResolver.TypeQualifierResolutionResult.() -> Unit): QualifiedExpressionResolver.TypeQualifierResolutionResult defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeQualifierResolutionResult

'classifierDescriptor' @ [860:17] ==> public final val classifierDescriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.QualifiedExpressionResolver.TypeQualifierResolutionResult[PropertyDescriptorImpl]

'reportPlatformClassMappedToKotlin' @ [861:54] ==> public open fun reportPlatformClassMappedToKotlin(@NotNull platformToKotlinMap: PlatformToKotlinClassMap, @NotNull trace: BindingTrace, @NotNull element: KtElement, @NotNull descriptor: DeclarationDescriptor): Unit defined in org.jetbrains.kotlin.resolve.PlatformClassesMappedToKotlinChecker[JavaMethodDescriptor]

'platformToKotlinClassMap' @ [862:25] ==> private final val platformToKotlinClassMap: PlatformToKotlinClassMap defined in org.jetbrains.kotlin.resolve.TypeResolver[PropertyDescriptorImpl]

'trace' @ [862:51] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveDescriptorForType[ValueParameterDescriptorImpl]

'userType' @ [862:58] ==> value-parameter userType: KtUserType defined in org.jetbrains.kotlin.resolve.TypeResolver.resolveDescriptorForType[ValueParameterDescriptorImpl]

'classifierDescriptor' @ [862:68] ==> public final val classifierDescriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.QualifiedExpressionResolver.TypeQualifierResolutionResult[PropertyDescriptorImpl]

'JvmStatic' @ [869:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'when (projectionKind) {
                KtProjectionKind.IN -> IN_VARIANCE
                KtProjectionKind.OUT -> OUT_VARIANCE
                KtProjectionKind.NONE -> INVARIANT
                else -> // NOTE: Star projections must be handled before this method is called
                    throw IllegalStateException("Illegal projection kind:" + projectionKind)
            }' @ [871:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Variance, entry1: Variance, entry2: Variance, entry3: Variance): Variance[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Variance

'projectionKind' @ [871:26] ==> value-parameter projectionKind: KtProjectionKind defined in org.jetbrains.kotlin.resolve.TypeResolver.Companion.resolveProjectionKind[ValueParameterDescriptorImpl]

'IN' @ [872:34] ==> enum entry IN defined in org.jetbrains.kotlin.psi.KtProjectionKind[FakeCallableDescriptorForObject]

'IN_VARIANCE' @ [872:40] ==> enum entry IN_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'OUT' @ [873:34] ==> enum entry OUT defined in org.jetbrains.kotlin.psi.KtProjectionKind[FakeCallableDescriptorForObject]

'OUT_VARIANCE' @ [873:41] ==> enum entry OUT_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'NONE' @ [874:34] ==> enum entry NONE defined in org.jetbrains.kotlin.psi.KtProjectionKind[FakeCallableDescriptorForObject]

'INVARIANT' @ [874:42] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'IllegalStateException' @ [876:27] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'+' @ [876:49] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'projectionKind' @ [876:78] ==> value-parameter projectionKind: KtProjectionKind defined in org.jetbrains.kotlin.resolve.TypeResolver.Companion.resolveProjectionKind[ValueParameterDescriptorImpl]

