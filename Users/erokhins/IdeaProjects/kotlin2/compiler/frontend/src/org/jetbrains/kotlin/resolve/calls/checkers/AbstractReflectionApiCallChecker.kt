'setOf' @ [33:32] ==> public fun <T> setOf(vararg elements: String): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'storageManager' @ [46:37] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.resolve.calls.checkers.AbstractReflectionApiCallChecker.<init>[ValueParameterDescriptorImpl]

'createLazyValue' @ [46:52] ==> public abstract fun <T : Any> createLazyValue(computable: () -> Set<ClassDescriptor>): NotNullLazyValue<Set<ClassDescriptor>> defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Set<ClassDescriptor>

'ReflectionTypes' @ [47:31] ==> public constructor ReflectionTypes(module: ModuleDescriptor, notFoundClasses: NotFoundClasses) defined in org.jetbrains.kotlin.builtins.ReflectionTypes[DeserializedClassConstructorDescriptor]

'module' @ [47:47] ==> private final val module: ModuleDescriptor defined in org.jetbrains.kotlin.resolve.calls.checkers.AbstractReflectionApiCallChecker[PropertyDescriptorImpl]

'notFoundClasses' @ [47:55] ==> private final val notFoundClasses: NotFoundClasses defined in org.jetbrains.kotlin.resolve.calls.checkers.AbstractReflectionApiCallChecker[PropertyDescriptorImpl]

'setOf' @ [48:9] ==> public fun <T> setOf(vararg elements: ClassDescriptor): Set<ClassDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor

'reflectionTypes' @ [48:15] ==> val reflectionTypes: ReflectionTypes defined in org.jetbrains.kotlin.resolve.calls.checkers.AbstractReflectionApiCallChecker.kPropertyClasses.<anonymous>[LocalVariableDescriptor]

'kProperty0' @ [48:31] ==> public final val kProperty0: ClassDescriptor defined in org.jetbrains.kotlin.builtins.ReflectionTypes[DeserializedPropertyDescriptor]

'reflectionTypes' @ [48:43] ==> val reflectionTypes: ReflectionTypes defined in org.jetbrains.kotlin.resolve.calls.checkers.AbstractReflectionApiCallChecker.kPropertyClasses.<anonymous>[LocalVariableDescriptor]

'kProperty1' @ [48:59] ==> public final val kProperty1: ClassDescriptor defined in org.jetbrains.kotlin.builtins.ReflectionTypes[DeserializedPropertyDescriptor]

'reflectionTypes' @ [48:71] ==> val reflectionTypes: ReflectionTypes defined in org.jetbrains.kotlin.resolve.calls.checkers.AbstractReflectionApiCallChecker.kPropertyClasses.<anonymous>[LocalVariableDescriptor]

'kProperty2' @ [48:87] ==> public final val kProperty2: ClassDescriptor defined in org.jetbrains.kotlin.builtins.ReflectionTypes[DeserializedPropertyDescriptor]

'isWholeReflectionApiAvailable' @ [52:13] ==> protected abstract val isWholeReflectionApiAvailable: Boolean defined in org.jetbrains.kotlin.resolve.calls.checkers.AbstractReflectionApiCallChecker[PropertyDescriptorImpl]

'isReflectionSource' @ [55:13] ==> private final fun isReflectionSource(reportOn: PsiElement): Boolean defined in org.jetbrains.kotlin.resolve.calls.checkers.AbstractReflectionApiCallChecker[SimpleFunctionDescriptorImpl]

'reportOn' @ [55:32] ==> value-parameter reportOn: PsiElement defined in org.jetbrains.kotlin.resolve.calls.checkers.AbstractReflectionApiCallChecker.check[ValueParameterDescriptorImpl]

'resolvedCall' @ [57:26] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.resolve.calls.checkers.AbstractReflectionApiCallChecker.check[ValueParameterDescriptorImpl]

'resultingDescriptor' @ [57:39] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.resultingDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'descriptor' @ [58:31] ==> val descriptor: (CallableDescriptor..CallableDescriptor?) defined in org.jetbrains.kotlin.resolve.calls.checkers.AbstractReflectionApiCallChecker.check[LocalVariableDescriptor]

'containingDeclaration' @ [58:42] ==> public final val CallableDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'!' @ [59:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'ReflectionTypes' @ [59:14] ==> public companion object defined in org.jetbrains.kotlin.builtins.ReflectionTypes[FakeCallableDescriptorForObject]

'isReflectionClass' @ [59:30] ==> public final fun isReflectionClass(descriptor: ClassDescriptor): Boolean defined in org.jetbrains.kotlin.builtins.ReflectionTypes.Companion[DeserializedSimpleFunctionDescriptor]

'containingClass' @ [59:48] ==> val containingClass: ClassDescriptor defined in org.jetbrains.kotlin.resolve.calls.checkers.AbstractReflectionApiCallChecker.check[LocalVariableDescriptor]

'!' @ [61:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isAllowedReflectionApi' @ [61:14] ==> protected open fun isAllowedReflectionApi(descriptor: CallableDescriptor, containingClass: ClassDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.calls.checkers.AbstractReflectionApiCallChecker[SimpleFunctionDescriptorImpl]

'descriptor' @ [61:37] ==> val descriptor: (CallableDescriptor..CallableDescriptor?) defined in org.jetbrains.kotlin.resolve.calls.checkers.AbstractReflectionApiCallChecker.check[LocalVariableDescriptor]

'containingClass' @ [61:49] ==> val containingClass: ClassDescriptor defined in org.jetbrains.kotlin.resolve.calls.checkers.AbstractReflectionApiCallChecker.check[LocalVariableDescriptor]

'report' @ [62:13] ==> protected abstract fun report(element: PsiElement, context: CallCheckerContext): Unit defined in org.jetbrains.kotlin.resolve.calls.checkers.AbstractReflectionApiCallChecker[SimpleFunctionDescriptorImpl]

'reportOn' @ [62:20] ==> value-parameter reportOn: PsiElement defined in org.jetbrains.kotlin.resolve.calls.checkers.AbstractReflectionApiCallChecker.check[ValueParameterDescriptorImpl]

'context' @ [62:30] ==> value-parameter context: CallCheckerContext defined in org.jetbrains.kotlin.resolve.calls.checkers.AbstractReflectionApiCallChecker.check[ValueParameterDescriptorImpl]

'descriptor' @ [67:20] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.checkers.AbstractReflectionApiCallChecker.isAllowedReflectionApi[ValueParameterDescriptorImpl]

'name' @ [67:31] ==> public final val CallableDescriptor.name: Name[MyPropertyDescriptor]

'name' @ [68:16] ==> val name: Name defined in org.jetbrains.kotlin.resolve.calls.checkers.AbstractReflectionApiCallChecker.isAllowedReflectionApi[LocalVariableDescriptor]

'asString' @ [68:21] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'ANY_MEMBER_NAMES' @ [68:35] ==> private val ANY_MEMBER_NAMES: Set<String> defined in org.jetbrains.kotlin.resolve.calls.checkers in file AbstractReflectionApiCallChecker.kt[PropertyDescriptorImpl]

'name' @ [69:13] ==> val name: Name defined in org.jetbrains.kotlin.resolve.calls.checkers.AbstractReflectionApiCallChecker.isAllowedReflectionApi[LocalVariableDescriptor]

'OperatorNameConventions' @ [69:21] ==> public object OperatorNameConventions defined in org.jetbrains.kotlin.util[FakeCallableDescriptorForObject]

'INVOKE' @ [69:45] ==> @field:JvmField public final val INVOKE: Name defined in org.jetbrains.kotlin.util.OperatorNameConventions[DeserializedPropertyDescriptor]

'name' @ [70:13] ==> val name: Name defined in org.jetbrains.kotlin.resolve.calls.checkers.AbstractReflectionApiCallChecker.isAllowedReflectionApi[LocalVariableDescriptor]

'asString' @ [70:18] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'name' @ [71:14] ==> val name: Name defined in org.jetbrains.kotlin.resolve.calls.checkers.AbstractReflectionApiCallChecker.isAllowedReflectionApi[LocalVariableDescriptor]

'asString' @ [71:19] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'name' @ [71:42] ==> val name: Name defined in org.jetbrains.kotlin.resolve.calls.checkers.AbstractReflectionApiCallChecker.isAllowedReflectionApi[LocalVariableDescriptor]

'asString' @ [71:47] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'containingClass' @ [71:71] ==> value-parameter containingClass: ClassDescriptor defined in org.jetbrains.kotlin.resolve.calls.checkers.AbstractReflectionApiCallChecker.isAllowedReflectionApi[ValueParameterDescriptorImpl]

'isKPropertyClass' @ [71:87] ==> private final fun ClassDescriptor.isKPropertyClass(): Boolean defined in org.jetbrains.kotlin.resolve.calls.checkers.AbstractReflectionApiCallChecker[SimpleFunctionDescriptorImpl]

'kPropertyClasses' @ [74:54] ==> private final val kPropertyClasses: Set<ClassDescriptor> defined in org.jetbrains.kotlin.resolve.calls.checkers.AbstractReflectionApiCallChecker[PropertyDescriptorImpl]

'any' @ [74:71] ==> public inline fun <T> Iterable<ClassDescriptor>.any(predicate: (ClassDescriptor) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor

'isSubclass' @ [74:106] ==> public open fun isSubclass(@NotNull p0: ClassDescriptor, @NotNull p1: ClassDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'this' @ [74:117] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.checkers.AbstractReflectionApiCallChecker.isKPropertyClass[ReceiverParameterDescriptorImpl]

'kProperty' @ [74:123] ==> value-parameter kProperty: ClassDescriptor defined in org.jetbrains.kotlin.resolve.calls.checkers.AbstractReflectionApiCallChecker.isKPropertyClass.<anonymous>[ValueParameterDescriptorImpl]

'reportOn' @ [77:20] ==> value-parameter reportOn: PsiElement defined in org.jetbrains.kotlin.resolve.calls.checkers.AbstractReflectionApiCallChecker.isReflectionSource[ValueParameterDescriptorImpl]

'containingFile' @ [77:29] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'file' @ [78:22] ==> val file: KtFile defined in org.jetbrains.kotlin.resolve.calls.checkers.AbstractReflectionApiCallChecker.isReflectionSource[LocalVariableDescriptor]

'packageFqName' @ [78:27] ==> public final val KtFile.packageFqName: FqName[MyPropertyDescriptor]

'toUnsafe' @ [78:41] ==> @NotNull public open fun toUnsafe(): FqNameUnsafe defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'fqName' @ [79:16] ==> val fqName: FqNameUnsafe defined in org.jetbrains.kotlin.resolve.calls.checkers.AbstractReflectionApiCallChecker.isReflectionSource[LocalVariableDescriptor]

'KOTLIN_REFLECT_FQ_NAME' @ [79:26] ==> public val KOTLIN_REFLECT_FQ_NAME: FqName defined in org.jetbrains.kotlin.builtins[DeserializedPropertyDescriptor]

'toUnsafe' @ [79:49] ==> @NotNull public open fun toUnsafe(): FqNameUnsafe defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'fqName' @ [79:63] ==> val fqName: FqNameUnsafe defined in org.jetbrains.kotlin.resolve.calls.checkers.AbstractReflectionApiCallChecker.isReflectionSource[LocalVariableDescriptor]

'asString' @ [79:70] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqNameUnsafe[JavaMethodDescriptor]

'startsWith' @ [79:81] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'KOTLIN_REFLECT_FQ_NAME' @ [79:92] ==> public val KOTLIN_REFLECT_FQ_NAME: FqName defined in org.jetbrains.kotlin.builtins[DeserializedPropertyDescriptor]

'asString' @ [79:115] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

