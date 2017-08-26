'AbstractReflectionApiCallChecker' @ [38:5] ==> public constructor AbstractReflectionApiCallChecker(module: ModuleDescriptor, notFoundClasses: NotFoundClasses, storageManager: StorageManager) defined in org.jetbrains.kotlin.resolve.calls.checkers.AbstractReflectionApiCallChecker[DeserializedClassConstructorDescriptor]

'module' @ [38:38] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmReflectionAPICallChecker.<init>[ValueParameterDescriptorImpl]

'notFoundClasses' @ [38:46] ==> value-parameter notFoundClasses: NotFoundClasses defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmReflectionAPICallChecker.<init>[ValueParameterDescriptorImpl]

'storageManager' @ [38:63] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmReflectionAPICallChecker.<init>[ValueParameterDescriptorImpl]

'storageManager' @ [39:51] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmReflectionAPICallChecker.<init>[ValueParameterDescriptorImpl]

'createLazyValue' @ [39:66] ==> public abstract fun <T : Any> createLazyValue(computable: () -> Boolean): NotNullLazyValue<Boolean> defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Boolean

'module' @ [40:9] ==> private final val module: ModuleDescriptor defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmReflectionAPICallChecker[PropertyDescriptorImpl]

'findClassAcrossModuleDependencies' @ [40:16] ==> public fun ModuleDescriptor.findClassAcrossModuleDependencies(classId: ClassId): ClassDescriptor? defined in org.jetbrains.kotlin.descriptors[DeserializedSimpleFunctionDescriptor]

'REFLECTION_FACTORY_IMPL' @ [40:57] ==> public final val REFLECTION_FACTORY_IMPL: (ClassId..ClassId?) defined in org.jetbrains.kotlin.load.java.JvmAbi[JavaPropertyDescriptor]

'context' @ [44:9] ==> value-parameter context: CallCheckerContext defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmReflectionAPICallChecker.report[ValueParameterDescriptorImpl]

'trace' @ [44:17] ==> public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.checkers.CallCheckerContext[DeserializedPropertyDescriptor]

'report' @ [44:23] ==> public abstract fun report(@NotNull p0: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'NO_REFLECTION_IN_CLASS_PATH' @ [44:30] ==> public final val NO_REFLECTION_IN_CLASS_PATH: (DiagnosticFactory0<(PsiElement..PsiElement?)>..DiagnosticFactory0<(PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.ErrorsJvm[JavaPropertyDescriptor]

'on' @ [44:58] ==> @NotNull public open fun on(@NotNull p0: PsiElement): SimpleDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'element' @ [44:61] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmReflectionAPICallChecker.report[ValueParameterDescriptorImpl]

