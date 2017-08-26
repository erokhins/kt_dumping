'setOf' @ [32:38] ==> public fun <T> setOf(vararg elements: String): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'AbstractReflectionApiCallChecker' @ [39:5] ==> public constructor AbstractReflectionApiCallChecker(module: ModuleDescriptor, notFoundClasses: NotFoundClasses, storageManager: StorageManager) defined in org.jetbrains.kotlin.resolve.calls.checkers.AbstractReflectionApiCallChecker[DeserializedClassConstructorDescriptor]

'module' @ [39:38] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsReflectionAPICallChecker.<init>[ValueParameterDescriptorImpl]

'notFoundClasses' @ [39:46] ==> value-parameter notFoundClasses: NotFoundClasses defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsReflectionAPICallChecker.<init>[ValueParameterDescriptorImpl]

'storageManager' @ [39:63] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsReflectionAPICallChecker.<init>[ValueParameterDescriptorImpl]

'context' @ [44:9] ==> value-parameter context: CallCheckerContext defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsReflectionAPICallChecker.report[ValueParameterDescriptorImpl]

'trace' @ [44:17] ==> public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.checkers.CallCheckerContext[DeserializedPropertyDescriptor]

'report' @ [44:23] ==> public abstract fun report(@NotNull p0: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'UNSUPPORTED' @ [44:30] ==> public final val UNSUPPORTED: (DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [44:42] ==> @NotNull public open fun on(@NotNull p0: PsiElement, @NotNull p1: String): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'element' @ [44:45] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsReflectionAPICallChecker.report[ValueParameterDescriptorImpl]

'storageManager' @ [47:27] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsReflectionAPICallChecker.<init>[ValueParameterDescriptorImpl]

'createLazyValue' @ [47:42] ==> public abstract fun <T : Any> createLazyValue(computable: () -> ClassDescriptor): NotNullLazyValue<ClassDescriptor> defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> ClassDescriptor

'reflectionTypes' @ [47:60] ==> private final val reflectionTypes: ReflectionTypes defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsReflectionAPICallChecker[PropertyDescriptorImpl]

'kClass' @ [47:76] ==> public final val kClass: ClassDescriptor defined in org.jetbrains.kotlin.builtins.ReflectionTypes[DeserializedPropertyDescriptor]

'super' @ [50:13] ==> <this> defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsReflectionAPICallChecker[LazyClassReceiverParameterDescriptor]

'isAllowedReflectionApi' @ [50:19] ==> protected open fun isAllowedReflectionApi(descriptor: CallableDescriptor, containingClass: ClassDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.calls.checkers.AbstractReflectionApiCallChecker[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [50:42] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsReflectionAPICallChecker.isAllowedReflectionApi[ValueParameterDescriptorImpl]

'containingClass' @ [50:54] ==> value-parameter containingClass: ClassDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsReflectionAPICallChecker.isAllowedReflectionApi[ValueParameterDescriptorImpl]

'isSubclass' @ [51:29] ==> public open fun isSubclass(@NotNull p0: ClassDescriptor, @NotNull p1: ClassDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'containingClass' @ [51:40] ==> value-parameter containingClass: ClassDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsReflectionAPICallChecker.isAllowedReflectionApi[ValueParameterDescriptorImpl]

'kClass' @ [51:57] ==> private final val kClass: ClassDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsReflectionAPICallChecker[PropertyDescriptorImpl]

'descriptor' @ [51:68] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsReflectionAPICallChecker.isAllowedReflectionApi[ValueParameterDescriptorImpl]

'name' @ [51:79] ==> public final val CallableDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [51:84] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'ALLOWED_KCLASS_MEMBERS' @ [51:98] ==> private val ALLOWED_KCLASS_MEMBERS: Set<String> defined in org.jetbrains.kotlin.js.resolve.diagnostics in file JsReflectionAPICallChecker.kt[PropertyDescriptorImpl]

