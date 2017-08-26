'if (descriptor is FunctionDescriptor && !descriptor.isEffectivelyExternal() &&
            isOverridingExternalWithOptionalParams(descriptor)
        ) {
            diagnosticHolder.report(ErrorsJs.OVERRIDING_EXTERNAL_FUN_WITH_OPTIONAL_PARAMS.on(declaration))
        }
        else if (descriptor is ClassDescriptor && !descriptor.isEffectivelyExternal()) {
            val fakeOverriddenMethod = findFakeMethodOverridingExternalWithOptionalParams(descriptor)
            if (fakeOverriddenMethod != null) {
                diagnosticHolder.report(ErrorsJs.OVERRIDING_EXTERNAL_FUN_WITH_OPTIONAL_PARAMS_WITH_FAKE.on(
                        declaration, fakeOverriddenMethod))
            }
        }' @ [41:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'descriptor' @ [41:13] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsInheritanceChecker.check[ValueParameterDescriptorImpl]

'!' @ [41:49] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [41:50] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsInheritanceChecker.check[ValueParameterDescriptorImpl]

'isEffectivelyExternal' @ [41:61] ==> public fun MemberDescriptor.isEffectivelyExternal(): Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'isOverridingExternalWithOptionalParams' @ [42:13] ==> private final fun isOverridingExternalWithOptionalParams(function: FunctionDescriptor): Boolean defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsInheritanceChecker[SimpleFunctionDescriptorImpl]

'descriptor' @ [42:52] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsInheritanceChecker.check[ValueParameterDescriptorImpl]

'diagnosticHolder' @ [44:13] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsInheritanceChecker.check[ValueParameterDescriptorImpl]

'report' @ [44:30] ==> public abstract fun report(@NotNull p0: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'OVERRIDING_EXTERNAL_FUN_WITH_OPTIONAL_PARAMS' @ [44:46] ==> public final val OVERRIDING_EXTERNAL_FUN_WITH_OPTIONAL_PARAMS: (DiagnosticFactory0<(KtElement..KtElement?)>..DiagnosticFactory0<(KtElement..KtElement?)>?) defined in org.jetbrains.kotlin.js.resolve.diagnostics.ErrorsJs[JavaPropertyDescriptor]

'on' @ [44:91] ==> @NotNull public open fun on(@NotNull p0: KtElement): SimpleDiagnostic<(KtElement..KtElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'declaration' @ [44:94] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsInheritanceChecker.check[ValueParameterDescriptorImpl]

'descriptor' @ [46:18] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsInheritanceChecker.check[ValueParameterDescriptorImpl]

'!' @ [46:51] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [46:52] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsInheritanceChecker.check[ValueParameterDescriptorImpl]

'isEffectivelyExternal' @ [46:63] ==> public fun MemberDescriptor.isEffectivelyExternal(): Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'findFakeMethodOverridingExternalWithOptionalParams' @ [47:40] ==> private final fun findFakeMethodOverridingExternalWithOptionalParams(cls: ClassDescriptor): FunctionDescriptor? defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsInheritanceChecker[SimpleFunctionDescriptorImpl]

'descriptor' @ [47:91] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsInheritanceChecker.check[ValueParameterDescriptorImpl]

'fakeOverriddenMethod' @ [48:17] ==> val fakeOverriddenMethod: FunctionDescriptor? defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsInheritanceChecker.check[LocalVariableDescriptor]

'diagnosticHolder' @ [49:17] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsInheritanceChecker.check[ValueParameterDescriptorImpl]

'report' @ [49:34] ==> public abstract fun report(@NotNull p0: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'OVERRIDING_EXTERNAL_FUN_WITH_OPTIONAL_PARAMS_WITH_FAKE' @ [49:50] ==> public final val OVERRIDING_EXTERNAL_FUN_WITH_OPTIONAL_PARAMS_WITH_FAKE: (DiagnosticFactory1<(KtElement..KtElement?), (FunctionDescriptor..FunctionDescriptor?)>..DiagnosticFactory1<(KtElement..KtElement?), (FunctionDescriptor..FunctionDescriptor?)>?) defined in org.jetbrains.kotlin.js.resolve.diagnostics.ErrorsJs[JavaPropertyDescriptor]

'on' @ [49:105] ==> @NotNull public open fun on(@NotNull p0: KtElement, @NotNull p1: FunctionDescriptor): ParametrizedDiagnostic<(KtElement..KtElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'declaration' @ [50:25] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsInheritanceChecker.check[ValueParameterDescriptorImpl]

'fakeOverriddenMethod' @ [50:38] ==> val fakeOverriddenMethod: FunctionDescriptor? defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsInheritanceChecker.check[LocalVariableDescriptor]

'descriptor' @ [54:13] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsInheritanceChecker.check[ValueParameterDescriptorImpl]

'descriptor' @ [55:13] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsInheritanceChecker.check[ValueParameterDescriptorImpl]

'defaultType' @ [55:24] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'immediateSupertypes' @ [55:36] ==> public fun KotlinType.immediateSupertypes(): Collection<KotlinType> defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'any' @ [55:58] ==> public inline fun <T> Iterable<KotlinType>.any(predicate: (KotlinType) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'it' @ [55:64] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsInheritanceChecker.check.<anonymous>[ValueParameterDescriptorImpl]

'isBuiltinFunctionalTypeOrSubtype' @ [55:67] ==> public val KotlinType.isBuiltinFunctionalTypeOrSubtype: Boolean defined in org.jetbrains.kotlin.builtins[DeserializedPropertyDescriptor]

'diagnosticHolder' @ [57:13] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsInheritanceChecker.check[ValueParameterDescriptorImpl]

'report' @ [57:30] ==> public abstract fun report(@NotNull p0: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'IMPLEMENTING_FUNCTION_INTERFACE' @ [57:46] ==> public final val IMPLEMENTING_FUNCTION_INTERFACE: (DiagnosticFactory0<(KtClassOrObject..KtClassOrObject?)>..DiagnosticFactory0<(KtClassOrObject..KtClassOrObject?)>?) defined in org.jetbrains.kotlin.js.resolve.diagnostics.ErrorsJs[JavaPropertyDescriptor]

'on' @ [57:78] ==> @NotNull public open fun on(@NotNull p0: KtClassOrObject): SimpleDiagnostic<(KtClassOrObject..KtClassOrObject?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'declaration' @ [57:81] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsInheritanceChecker.check[ValueParameterDescriptorImpl]

'!' @ [62:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'function' @ [62:14] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsInheritanceChecker.isOverridingExternalWithOptionalParams[ValueParameterDescriptorImpl]

'kind' @ [62:23] ==> public final val FunctionDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'isReal' @ [62:28] ==> public final val CallableMemberDescriptor.Kind.isReal: Boolean[MyPropertyDescriptor]

'function' @ [62:38] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsInheritanceChecker.isOverridingExternalWithOptionalParams[ValueParameterDescriptorImpl]

'modality' @ [62:47] ==> public final val FunctionDescriptor.modality: Modality[MyPropertyDescriptor]

'Modality' @ [62:59] ==> public companion object defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'ABSTRACT' @ [62:68] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'function' @ [64:36] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsInheritanceChecker.isOverridingExternalWithOptionalParams[ValueParameterDescriptorImpl]

'overriddenDescriptors' @ [64:45] ==> public final var FunctionDescriptor.overriddenDescriptors: (MutableCollection<out (FunctionDescriptor..FunctionDescriptor?)>..Collection<(FunctionDescriptor..FunctionDescriptor?)>)[MyPropertyDescriptor]

'filter' @ [64:67] ==> public inline fun <T> Iterable<(FunctionDescriptor..FunctionDescriptor?)>.filter(predicate: ((FunctionDescriptor..FunctionDescriptor?)) -> Boolean): List<(FunctionDescriptor..FunctionDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)

'it' @ [64:76] ==> value-parameter it: (FunctionDescriptor..FunctionDescriptor?) defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsInheritanceChecker.isOverridingExternalWithOptionalParams.<anonymous>[ValueParameterDescriptorImpl]

'isEffectivelyExternal' @ [64:79] ==> public fun MemberDescriptor.isEffectivelyExternal(): Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'overriddenFunction' @ [65:17] ==> val overriddenFunction: (FunctionDescriptor..FunctionDescriptor?) defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsInheritanceChecker.isOverridingExternalWithOptionalParams[LocalVariableDescriptor]

'valueParameters' @ [65:36] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'any' @ [65:52] ==> public inline fun <T> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.any(predicate: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'it' @ [65:58] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsInheritanceChecker.isOverridingExternalWithOptionalParams.<anonymous>[ValueParameterDescriptorImpl]

'hasDefaultValue' @ [65:61] ==> public fun ValueParameterDescriptor.hasDefaultValue(): Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'cls' @ [72:23] ==> value-parameter cls: ClassDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsInheritanceChecker.findFakeMethodOverridingExternalWithOptionalParams[ValueParameterDescriptorImpl]

'unsubstitutedMemberScope' @ [72:27] ==> public final val ClassDescriptor.unsubstitutedMemberScope: MemberScope[MyPropertyDescriptor]

'getContributedDescriptors' @ [72:52] ==> public abstract fun getContributedDescriptors(kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'DescriptorKindFilter' @ [72:78] ==> public companion object defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[FakeCallableDescriptorForObject]

'CALLABLES' @ [72:99] ==> @field:JvmField public final val CALLABLES: DescriptorKindFilter defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[DeserializedPropertyDescriptor]

'mapNotNull' @ [73:18] ==> public inline fun <T, R : Any> Iterable<DeclarationDescriptor>.mapNotNull(transform: (DeclarationDescriptor) -> FunctionDescriptor?): List<FunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor
    <R : Any> -> FunctionDescriptor

'it' @ [73:31] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsInheritanceChecker.findFakeMethodOverridingExternalWithOptionalParams.<anonymous>[ValueParameterDescriptorImpl]

'filter' @ [74:18] ==> public inline fun <T> Iterable<FunctionDescriptor>.filter(predicate: (FunctionDescriptor) -> Boolean): List<FunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor

'it' @ [74:27] ==> value-parameter it: FunctionDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsInheritanceChecker.findFakeMethodOverridingExternalWithOptionalParams.<anonymous>[ValueParameterDescriptorImpl]

'containingDeclaration' @ [74:30] ==> public final val FunctionDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'cls' @ [74:55] ==> value-parameter cls: ClassDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsInheritanceChecker.findFakeMethodOverridingExternalWithOptionalParams[ValueParameterDescriptorImpl]

'!' @ [74:62] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [74:63] ==> value-parameter it: FunctionDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsInheritanceChecker.findFakeMethodOverridingExternalWithOptionalParams.<anonymous>[ValueParameterDescriptorImpl]

'kind' @ [74:66] ==> public final val FunctionDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'isReal' @ [74:71] ==> public final val CallableMemberDescriptor.Kind.isReal: Boolean[MyPropertyDescriptor]

'it' @ [74:81] ==> value-parameter it: FunctionDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsInheritanceChecker.findFakeMethodOverridingExternalWithOptionalParams.<anonymous>[ValueParameterDescriptorImpl]

'overriddenDescriptors' @ [74:84] ==> public final var FunctionDescriptor.overriddenDescriptors: (MutableCollection<out (FunctionDescriptor..FunctionDescriptor?)>..Collection<(FunctionDescriptor..FunctionDescriptor?)>)[MyPropertyDescriptor]

'size' @ [74:106] ==> public abstract val size: Int defined in kotlin.collections.MutableCollection[DeserializedPropertyDescriptor]

'members' @ [76:16] ==> val members: List<FunctionDescriptor> defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsInheritanceChecker.findFakeMethodOverridingExternalWithOptionalParams[LocalVariableDescriptor]

'firstOrNull' @ [76:24] ==> public inline fun <T> Iterable<FunctionDescriptor>.firstOrNull(predicate: (FunctionDescriptor) -> Boolean): FunctionDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor

'isOverridingExternalWithOptionalParams' @ [76:38] ==> private final fun isOverridingExternalWithOptionalParams(function: FunctionDescriptor): Boolean defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsInheritanceChecker[SimpleFunctionDescriptorImpl]

'it' @ [76:77] ==> value-parameter it: FunctionDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsInheritanceChecker.findFakeMethodOverridingExternalWithOptionalParams.<anonymous>[ValueParameterDescriptorImpl]

