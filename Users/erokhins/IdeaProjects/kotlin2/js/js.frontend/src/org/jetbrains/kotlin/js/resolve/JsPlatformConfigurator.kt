'PlatformConfigurator' @ [33:33] ==> public constructor PlatformConfigurator(dynamicTypesSettings: DynamicTypesSettings, additionalDeclarationCheckers: List<DeclarationChecker>, additionalCallCheckers: List<CallChecker>, additionalTypeCheckers: List<AdditionalTypeChecker>, additionalClassifierUsageCheckers: List<ClassifierUsageChecker>, additionalAnnotationCheckers: List<AdditionalAnnotationChecker>, identifierChecker: IdentifierChecker, overloadFilter: OverloadFilter, platformToKotlinClassMap: PlatformToKotlinClassMap, delegationFilter: DelegationFilter, overridesBackwardCompatibilityHelper: OverridesBackwardCompatibilityHelper) defined in org.jetbrains.kotlin.resolve.PlatformConfigurator[DeserializedClassConstructorDescriptor]

'DynamicTypesAllowed' @ [34:9] ==> public constructor DynamicTypesAllowed() defined in org.jetbrains.kotlin.types.DynamicTypesAllowed[DeserializedClassConstructorDescriptor]

'listOf' @ [35:41] ==> public fun <T> listOf(vararg elements: DeclarationChecker): List<DeclarationChecker> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationChecker

'NativeInvokeChecker' @ [36:17] ==> public constructor NativeInvokeChecker() defined in org.jetbrains.kotlin.js.resolve.NativeInvokeChecker[ClassConstructorDescriptorImpl]

'NativeGetterChecker' @ [36:40] ==> public constructor NativeGetterChecker() defined in org.jetbrains.kotlin.js.resolve.NativeGetterChecker[ClassConstructorDescriptorImpl]

'NativeSetterChecker' @ [36:63] ==> public constructor NativeSetterChecker() defined in org.jetbrains.kotlin.js.resolve.NativeSetterChecker[ClassConstructorDescriptorImpl]

'JsNameChecker' @ [37:17] ==> public object JsNameChecker : SimpleDeclarationChecker defined in org.jetbrains.kotlin.js.resolve.diagnostics in file JsNameChecker.kt[FakeCallableDescriptorForObject]

'JsModuleChecker' @ [37:32] ==> public object JsModuleChecker : SimpleDeclarationChecker defined in org.jetbrains.kotlin.js.resolve.diagnostics in file JsModuleChecker.kt[FakeCallableDescriptorForObject]

'JsExternalFileChecker' @ [37:49] ==> public object JsExternalFileChecker : SimpleDeclarationChecker defined in org.jetbrains.kotlin.js.resolve.diagnostics in file JsExternalFileChecker.kt[FakeCallableDescriptorForObject]

'JsExternalChecker' @ [38:17] ==> public object JsExternalChecker : SimpleDeclarationChecker defined in org.jetbrains.kotlin.js.resolve.diagnostics in file JsExternalChecker.kt[FakeCallableDescriptorForObject]

'JsInheritanceChecker' @ [38:36] ==> public object JsInheritanceChecker : SimpleDeclarationChecker defined in org.jetbrains.kotlin.js.resolve.diagnostics in file JsInheritanceChecker.kt[FakeCallableDescriptorForObject]

'JsRuntimeAnnotationChecker' @ [39:17] ==> public object JsRuntimeAnnotationChecker : SimpleDeclarationChecker defined in org.jetbrains.kotlin.js.resolve.diagnostics in file JsRuntimeAnnotationChecker.kt[FakeCallableDescriptorForObject]

'JsDynamicDeclarationChecker' @ [40:17] ==> public object JsDynamicDeclarationChecker : SimpleDeclarationChecker defined in org.jetbrains.kotlin.js.resolve.diagnostics in file JsDynamicDeclarationChecker.kt[FakeCallableDescriptorForObject]

'HeaderImplDeclarationChecker' @ [41:17] ==> public object HeaderImplDeclarationChecker : DeclarationChecker defined in org.jetbrains.kotlin.resolve.checkers[FakeCallableDescriptorForObject]

'listOf' @ [43:34] ==> public fun <T> listOf(vararg elements: CallChecker): List<CallChecker> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallChecker

'ReifiedTypeParameterSubstitutionChecker' @ [44:17] ==> public constructor ReifiedTypeParameterSubstitutionChecker() defined in org.jetbrains.kotlin.resolve.calls.checkers.ReifiedTypeParameterSubstitutionChecker[JavaClassConstructorDescriptor]

'JsModuleCallChecker' @ [45:17] ==> public object JsModuleCallChecker : CallChecker defined in org.jetbrains.kotlin.js.resolve.diagnostics in file JsModuleCallChecker.kt[FakeCallableDescriptorForObject]

'JsDynamicCallChecker' @ [46:17] ==> public object JsDynamicCallChecker : CallChecker defined in org.jetbrains.kotlin.js.resolve.diagnostics in file JsDynamicCallChecker.kt[FakeCallableDescriptorForObject]

'JsDefinedExternallyCallChecker' @ [47:17] ==> public object JsDefinedExternallyCallChecker : CallChecker defined in org.jetbrains.kotlin.js.resolve.diagnostics in file JsDefinedExternallyCallChecker.kt[FakeCallableDescriptorForObject]

'listOf' @ [49:34] ==> @InlineOnly public inline fun <T> listOf(): List<AdditionalTypeChecker> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AdditionalTypeChecker

'listOf' @ [50:45] ==> @InlineOnly public inline fun <T> listOf(): List<ClassifierUsageChecker> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassifierUsageChecker

'listOf' @ [51:40] ==> @InlineOnly public inline fun <T> listOf(): List<AdditionalAnnotationChecker> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AdditionalAnnotationChecker

'JsIdentifierChecker' @ [52:29] ==> public object JsIdentifierChecker : IdentifierChecker defined in org.jetbrains.kotlin.js.resolve.diagnostics in file JsIdentifierChecker.kt[FakeCallableDescriptorForObject]

'DEFAULT' @ [53:41] ==> public object DEFAULT : OverloadFilter defined in org.jetbrains.kotlin.resolve.OverloadFilter[FakeCallableDescriptorForObject]

'EMPTY' @ [54:61] ==> public final val EMPTY: (PlatformToKotlinClassMap..PlatformToKotlinClassMap?) defined in org.jetbrains.kotlin.platform.PlatformToKotlinClassMap[JavaPropertyDescriptor]

'DEFAULT' @ [55:45] ==> public object DEFAULT : DelegationFilter defined in org.jetbrains.kotlin.resolve.lazy.DelegationFilter[FakeCallableDescriptorForObject]

'DEFAULT' @ [56:85] ==> public object DEFAULT : OverridesBackwardCompatibilityHelper defined in org.jetbrains.kotlin.resolve.OverridesBackwardCompatibilityHelper[FakeCallableDescriptorForObject]

'container' @ [59:9] ==> value-parameter container: StorageComponentContainer defined in org.jetbrains.kotlin.js.resolve.JsPlatformConfigurator.configureModuleComponents[ValueParameterDescriptorImpl]

'useImpl' @ [59:19] ==> public inline fun <reified T : Any> StorageComponentContainer.useImpl(): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> JsCallChecker

'container' @ [60:9] ==> value-parameter container: StorageComponentContainer defined in org.jetbrains.kotlin.js.resolve.JsPlatformConfigurator.configureModuleComponents[ValueParameterDescriptorImpl]

'useInstance' @ [60:19] ==> public fun StorageComponentContainer.useInstance(instance: Any): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]

'Empty' @ [60:47] ==> public object Empty : SyntheticScopes defined in org.jetbrains.kotlin.resolve.scopes.SyntheticScopes[FakeCallableDescriptorForObject]

'container' @ [61:9] ==> value-parameter container: StorageComponentContainer defined in org.jetbrains.kotlin.js.resolve.JsPlatformConfigurator.configureModuleComponents[ValueParameterDescriptorImpl]

'useInstance' @ [61:19] ==> public fun StorageComponentContainer.useInstance(instance: Any): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]

'JsTypeSpecificityComparator' @ [61:31] ==> public object JsTypeSpecificityComparator : TypeSpecificityComparator defined in org.jetbrains.kotlin.js.resolve in file JsTypeSpecificityComparator.kt[FakeCallableDescriptorForObject]

'container' @ [62:9] ==> value-parameter container: StorageComponentContainer defined in org.jetbrains.kotlin.js.resolve.JsPlatformConfigurator.configureModuleComponents[ValueParameterDescriptorImpl]

'useInstance' @ [62:19] ==> public fun StorageComponentContainer.useInstance(instance: Any): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]

'JsNameClashChecker' @ [62:31] ==> public constructor JsNameClashChecker() defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsNameClashChecker[ClassConstructorDescriptorImpl]

'container' @ [63:9] ==> value-parameter container: StorageComponentContainer defined in org.jetbrains.kotlin.js.resolve.JsPlatformConfigurator.configureModuleComponents[ValueParameterDescriptorImpl]

'useInstance' @ [63:19] ==> public fun StorageComponentContainer.useInstance(instance: Any): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]

'JsNameCharsChecker' @ [63:31] ==> public constructor JsNameCharsChecker() defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsNameCharsChecker[ClassConstructorDescriptorImpl]

'container' @ [64:9] ==> value-parameter container: StorageComponentContainer defined in org.jetbrains.kotlin.js.resolve.JsPlatformConfigurator.configureModuleComponents[ValueParameterDescriptorImpl]

'useInstance' @ [64:19] ==> public fun StorageComponentContainer.useInstance(instance: Any): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]

'JsModuleClassLiteralChecker' @ [64:31] ==> public object JsModuleClassLiteralChecker : ClassLiteralChecker defined in org.jetbrains.kotlin.js.resolve.diagnostics in file JsModuleClassLiteralChecker.kt[FakeCallableDescriptorForObject]

'container' @ [65:9] ==> value-parameter container: StorageComponentContainer defined in org.jetbrains.kotlin.js.resolve.JsPlatformConfigurator.configureModuleComponents[ValueParameterDescriptorImpl]

'useImpl' @ [65:19] ==> public inline fun <reified T : Any> StorageComponentContainer.useImpl(): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> JsReflectionAPICallChecker

'container' @ [66:9] ==> value-parameter container: StorageComponentContainer defined in org.jetbrains.kotlin.js.resolve.JsPlatformConfigurator.configureModuleComponents[ValueParameterDescriptorImpl]

'useImpl' @ [66:19] ==> public inline fun <reified T : Any> StorageComponentContainer.useImpl(): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> JsNativeRttiChecker

'container' @ [67:9] ==> value-parameter container: StorageComponentContainer defined in org.jetbrains.kotlin.js.resolve.JsPlatformConfigurator.configureModuleComponents[ValueParameterDescriptorImpl]

'useImpl' @ [67:19] ==> public inline fun <reified T : Any> StorageComponentContainer.useImpl(): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> JsReifiedNativeChecker

'container' @ [68:9] ==> value-parameter container: StorageComponentContainer defined in org.jetbrains.kotlin.js.resolve.JsPlatformConfigurator.configureModuleComponents[ValueParameterDescriptorImpl]

'useInstance' @ [68:19] ==> public fun StorageComponentContainer.useInstance(instance: Any): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]

'ExtensionFunctionToExternalIsInlinable' @ [68:31] ==> public object ExtensionFunctionToExternalIsInlinable : ReasonableInlineRule defined in org.jetbrains.kotlin.js.resolve in file ExtensionFunctionToExternalIsInlinable.kt[FakeCallableDescriptorForObject]

'container' @ [69:9] ==> value-parameter container: StorageComponentContainer defined in org.jetbrains.kotlin.js.resolve.JsPlatformConfigurator.configureModuleComponents[ValueParameterDescriptorImpl]

'useInstance' @ [69:19] ==> public fun StorageComponentContainer.useInstance(instance: Any): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]

'JsQualifierChecker' @ [69:31] ==> public object JsQualifierChecker : AdditionalAnnotationChecker defined in org.jetbrains.kotlin.js.resolve.diagnostics in file JsQualifierChecker.kt[FakeCallableDescriptorForObject]

