'getInstance' @ [57:30] ==> @NotNull public open fun getInstance(@NotNull p0: raw (Class<(Any..Any?)>..Class<*>)): Logger defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'CallableRefactoring' @ [57:42] ==> public constructor CallableRefactoring<out T : CallableDescriptor>(project: Project, callableDescriptor: ???, commandName: String) defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : CallableDescriptor> -> org.jetbrains.kotlin.types.ErrorUtils$UninferredParameterTypeConstructor@321c8b28

'java' @ [57:69] ==> public val <T> KClass<CallableRefactoring<*>>.java: Class<CallableRefactoring<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> CallableRefactoring<*>

'Suppress' @ [59:5] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'callableDescriptor' @ [60:30] ==> value-parameter callableDescriptor: T defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring.<init>[ValueParameterDescriptorImpl]

'liftToHeader' @ [60:49] ==> internal fun DeclarationDescriptor.liftToHeader(): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.highlighter.markers in file DeclaredHeaderMarker.kt[SimpleFunctionDescriptorImpl]

'callableDescriptor' @ [60:73] ==> value-parameter callableDescriptor: T defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring.<init>[ValueParameterDescriptorImpl]

'?:' @ [62:24] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: CallableMemberDescriptor.Kind?, right: CallableMemberDescriptor.Kind): CallableMemberDescriptor.Kind[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Kind

'callableDescriptor' @ [62:25] ==> value-parameter callableDescriptor: T defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring.<init>[ValueParameterDescriptorImpl]

'kind' @ [62:75] ==> public final val CallableMemberDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'DECLARATION' @ [62:113] ==> enum entry DECLARATION defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'when (kind) {
            DECLARATION -> {
                setOf(callableDescriptor)
            }
            DELEGATION, FAKE_OVERRIDE -> {
                (callableDescriptor as CallableMemberDescriptor).getDirectlyOverriddenDeclarations()
            }
            else -> {
                throw IllegalStateException("Unexpected callable kind: $kind")
            }
        }' @ [69:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Collection<CallableDescriptor>, entry1: Collection<CallableDescriptor>, entry2: Collection<CallableDescriptor>): Collection<CallableDescriptor>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Collection<CallableDescriptor>

'kind' @ [69:22] ==> private final val kind: CallableMemberDescriptor.Kind defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring[PropertyDescriptorImpl]

'DECLARATION' @ [70:13] ==> enum entry DECLARATION defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'setOf' @ [71:17] ==> public fun <T> setOf(element: T): Set<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'callableDescriptor' @ [71:23] ==> @Suppress public final val callableDescriptor: T defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring[PropertyDescriptorImpl]

'DELEGATION' @ [73:13] ==> enum entry DELEGATION defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'FAKE_OVERRIDE' @ [73:25] ==> enum entry FAKE_OVERRIDE defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'callableDescriptor' @ [74:18] ==> @Suppress public final val callableDescriptor: T defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring[PropertyDescriptorImpl]

'getDirectlyOverriddenDeclarations' @ [74:66] ==> public fun <D : CallableMemberDescriptor> CallableMemberDescriptor.getDirectlyOverriddenDeclarations(): Collection<CallableMemberDescriptor> defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <D : CallableMemberDescriptor> -> CallableMemberDescriptor

'IllegalStateException' @ [77:23] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'kind' @ [77:73] ==> private final val kind: CallableMemberDescriptor.Kind defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring[PropertyDescriptorImpl]

'map' @ [79:11] ==> public inline fun <T, R> Iterable<CallableDescriptor>.map(transform: (CallableDescriptor) -> CallableDescriptor): List<CallableDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableDescriptor
    <R> -> CallableDescriptor

'it' @ [79:17] ==> value-parameter it: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring.getClosestModifiableDescriptors.<anonymous>[ValueParameterDescriptorImpl]

'liftToHeader' @ [79:20] ==> internal fun DeclarationDescriptor.liftToHeader(): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.highlighter.markers in file DeclaredHeaderMarker.kt[SimpleFunctionDescriptorImpl]

'it' @ [79:61] ==> value-parameter it: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring.getClosestModifiableDescriptors.<anonymous>[ValueParameterDescriptorImpl]

'superCallables' @ [85:27] ==> value-parameter superCallables: Collection<CallableDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring.showSuperFunctionWarningDialog[ValueParameterDescriptorImpl]

'joinToString' @ [85:42] ==> public fun <T> Iterable<CallableDescriptor>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((CallableDescriptor) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableDescriptor

'it' @ [86:13] ==> value-parameter it: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring.showSuperFunctionWarningDialog.<anonymous>[ValueParameterDescriptorImpl]

'containingDeclaration' @ [86:16] ==> public final val CallableDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'name' @ [86:38] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [86:43] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'message' @ [88:36] ==> @NotNull public open fun message(@NonNls @PropertyKey p0: (String..String?), vararg p1: (Any..Any?)): String defined in org.jetbrains.kotlin.idea.KotlinBundle[JavaMethodDescriptor]

'COMPACT' @ [89:63] ==> @field:JvmField public final val COMPACT: DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[DeserializedPropertyDescriptor]

'render' @ [89:71] ==> public abstract fun render(declarationDescriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'callableFromEditor' @ [89:78] ==> value-parameter callableFromEditor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring.showSuperFunctionWarningDialog[ValueParameterDescriptorImpl]

'callableFromEditor' @ [90:44] ==> value-parameter callableFromEditor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring.showSuperFunctionWarningDialog[ValueParameterDescriptorImpl]

'containingDeclaration' @ [90:63] ==> public final val CallableDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'name' @ [90:85] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [90:90] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'superString' @ [90:102] ==> val superString: String defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring.showSuperFunctionWarningDialog[LocalVariableDescriptor]

'!!' @ [92:21] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: String?): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> String

'message' @ [92:31] ==> public open fun message(@NotNull @PropertyKey p0: String, @NotNull vararg p1: (Any..Any?)): (String..String?) defined in com.intellij.ide.IdeBundle[JavaMethodDescriptor]

'getQuestionIcon' @ [93:29] ==> @NotNull public open fun getQuestionIcon(): Icon defined in com.intellij.openapi.ui.Messages[JavaMethodDescriptor]

'showDialog' @ [94:25] ==> public open fun showDialog(p0: (String..String?), @Nls p1: (String..String?), @NotNull p2: (Array<(String..String?)>..Array<out (String..String?)>), p3: Int, @Nullable p4: Icon?): Int defined in com.intellij.openapi.ui.Messages[JavaMethodDescriptor]

'message' @ [94:36] ==> val message: String defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring.showSuperFunctionWarningDialog[LocalVariableDescriptor]

'title' @ [94:45] ==> val title: String defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring.showSuperFunctionWarningDialog[LocalVariableDescriptor]

'options' @ [94:52] ==> value-parameter options: List<String> defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring.showSuperFunctionWarningDialog[ValueParameterDescriptorImpl]

'toTypedArray' @ [94:60] ==> public inline fun <reified T> Collection<String>.toTypedArray(): Array<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> String

'icon' @ [94:79] ==> val icon: Icon defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring.showSuperFunctionWarningDialog[LocalVariableDescriptor]

'element' @ [98:13] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring.checkModifiable[ValueParameterDescriptorImpl]

'canRefactor' @ [98:21] ==> public fun PsiElement.canRefactor(): Boolean defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'element' @ [102:32] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring.checkModifiable[ValueParameterDescriptorImpl]

'containingFile' @ [102:40] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'virtualFile' @ [102:56] ==> public final val PsiFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'presentableUrl' @ [102:69] ==> public final val VirtualFile.presentableUrl: String[MyPropertyDescriptor]

'if (unmodifiableFile != null) {
            val message = RefactoringBundle.message("refactoring.cannot.be.performed") + "\n" +
                          IdeBundle.message("error.message.cannot.modify.file.0", unmodifiableFile)
            Messages.showErrorDialog(project, message, CommonBundle.getErrorTitle()!!)
        }
        else {
            LOG.error("Could not find file for Psi element: " + element.text)
        }' @ [103:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'unmodifiableFile' @ [103:13] ==> val unmodifiableFile: String? defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring.checkModifiable[LocalVariableDescriptor]

'+' @ [104:27] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'message' @ [104:45] ==> public open fun message(@PropertyKey p0: (String..String?)): (String..String?) defined in com.intellij.refactoring.RefactoringBundle[JavaMethodDescriptor]

'message' @ [105:37] ==> public open fun message(@NotNull @PropertyKey p0: String, @NotNull vararg p1: (Any..Any?)): (String..String?) defined in com.intellij.ide.IdeBundle[JavaMethodDescriptor]

'unmodifiableFile' @ [105:83] ==> val unmodifiableFile: String? defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring.checkModifiable[LocalVariableDescriptor]

'showErrorDialog' @ [106:22] ==> public open fun showErrorDialog(@Nullable p0: Project?, @Nls p1: (String..String?), @NotNull @Nls p2: String): Unit defined in com.intellij.openapi.ui.Messages[JavaMethodDescriptor]

'project' @ [106:38] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring[PropertyDescriptorImpl]

'message' @ [106:47] ==> val message: String defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring.checkModifiable[LocalVariableDescriptor]

'!!' @ [106:56] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: String?): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> String

'getErrorTitle' @ [106:69] ==> public open fun getErrorTitle(): (String..String?) defined in com.intellij.CommonBundle[JavaMethodDescriptor]

'LOG' @ [109:13] ==> private final val LOG: Logger defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring[PropertyDescriptorImpl]

'error' @ [109:17] ==> public open fun error(@NonNls p0: (String..String?)): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'+' @ [109:23] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'element' @ [109:65] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring.checkModifiable[ValueParameterDescriptorImpl]

'text' @ [109:73] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'code' @ [119:20] ==> value-parameter code: Int defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring.run.buttonPressed[ValueParameterDescriptorImpl]

'dialogButtons' @ [119:28] ==> value-parameter dialogButtons: List<String> defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring.run.buttonPressed[ValueParameterDescriptorImpl]

'indexOf' @ [119:42] ==> public abstract fun indexOf(element: String): Int defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'button' @ [119:50] ==> value-parameter button: String defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring.run.buttonPressed[ValueParameterDescriptorImpl]

'button' @ [119:61] ==> value-parameter button: String defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring.run.buttonPressed[ValueParameterDescriptorImpl]

'dialogButtons' @ [119:71] ==> value-parameter dialogButtons: List<String> defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring.run.buttonPressed[ValueParameterDescriptorImpl]

'buttonPressed' @ [123:20] ==> local final fun buttonPressed(code: Int, dialogButtons: List<String>, button: String): Boolean defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring.run[SimpleFunctionDescriptorImpl]

'code' @ [123:34] ==> value-parameter code: Int defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring.run.performForWholeHierarchy[ValueParameterDescriptorImpl]

'dialogButtons' @ [123:40] ==> value-parameter dialogButtons: List<String> defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring.run.performForWholeHierarchy[ValueParameterDescriptorImpl]

'YES_BUTTON' @ [123:64] ==> public const final val YES_BUTTON: (String..String?) defined in com.intellij.openapi.ui.Messages[JavaPropertyDescriptor]

'buttonPressed' @ [123:79] ==> local final fun buttonPressed(code: Int, dialogButtons: List<String>, button: String): Boolean defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring.run[SimpleFunctionDescriptorImpl]

'code' @ [123:93] ==> value-parameter code: Int defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring.run.performForWholeHierarchy[ValueParameterDescriptorImpl]

'dialogButtons' @ [123:99] ==> value-parameter dialogButtons: List<String> defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring.run.performForWholeHierarchy[ValueParameterDescriptorImpl]

'OK_BUTTON' @ [123:123] ==> public const final val OK_BUTTON: (String..String?) defined in com.intellij.openapi.ui.Messages[JavaPropertyDescriptor]

'buttonPressed' @ [127:20] ==> local final fun buttonPressed(code: Int, dialogButtons: List<String>, button: String): Boolean defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring.run[SimpleFunctionDescriptorImpl]

'code' @ [127:34] ==> value-parameter code: Int defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring.run.performForSelectedFunctionOnly[ValueParameterDescriptorImpl]

'dialogButtons' @ [127:40] ==> value-parameter dialogButtons: List<String> defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring.run.performForSelectedFunctionOnly[ValueParameterDescriptorImpl]

'NO_BUTTON' @ [127:64] ==> public const final val NO_BUTTON: (String..String?) defined in com.intellij.openapi.ui.Messages[JavaPropertyDescriptor]

'if (isSingleFunctionSelected) {
                arrayListOf(Messages.YES_BUTTON, Messages.NO_BUTTON, Messages.CANCEL_BUTTON)
            }
            else {
                arrayListOf(Messages.OK_BUTTON, Messages.CANCEL_BUTTON)
            }' @ [131:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<String>, elseBranch: List<String>): List<String>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<String>

'isSingleFunctionSelected' @ [131:24] ==> value-parameter isSingleFunctionSelected: Boolean defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring.run.buildDialogOptions[ValueParameterDescriptorImpl]

'arrayListOf' @ [132:17] ==> public fun <T> arrayListOf(vararg elements: (String..String?)): ArrayList<(String..String?)> /* = ArrayList<(String..String?)> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'YES_BUTTON' @ [132:38] ==> public const final val YES_BUTTON: (String..String?) defined in com.intellij.openapi.ui.Messages[JavaPropertyDescriptor]

'NO_BUTTON' @ [132:59] ==> public const final val NO_BUTTON: (String..String?) defined in com.intellij.openapi.ui.Messages[JavaPropertyDescriptor]

'CANCEL_BUTTON' @ [132:79] ==> public const final val CANCEL_BUTTON: (String..String?) defined in com.intellij.openapi.ui.Messages[JavaPropertyDescriptor]

'arrayListOf' @ [135:17] ==> public fun <T> arrayListOf(vararg elements: (String..String?)): ArrayList<(String..String?)> /* = ArrayList<(String..String?)> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'OK_BUTTON' @ [135:38] ==> public const final val OK_BUTTON: (String..String?) defined in com.intellij.openapi.ui.Messages[JavaPropertyDescriptor]

'CANCEL_BUTTON' @ [135:58] ==> public const final val CANCEL_BUTTON: (String..String?) defined in com.intellij.openapi.ui.Messages[JavaPropertyDescriptor]

'kind' @ [139:13] ==> private final val kind: CallableMemberDescriptor.Kind defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring[PropertyDescriptorImpl]

'SYNTHESIZED' @ [139:21] ==> enum entry SYNTHESIZED defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'LOG' @ [140:13] ==> private final val LOG: Logger defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring[PropertyDescriptorImpl]

'error' @ [140:17] ==> public open fun error(@NonNls p0: (String..String?)): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'+' @ [140:23] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'callableDescriptor' @ [140:101] ==> @Suppress public final val callableDescriptor: T defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring[PropertyDescriptorImpl]

'getClosestModifiableDescriptors' @ [144:44] ==> private final fun getClosestModifiableDescriptors(): Collection<CallableDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring[SimpleFunctionDescriptorImpl]

'forcePerformForSelectedFunctionOnly' @ [145:13] ==> protected open fun forcePerformForSelectedFunctionOnly(): Boolean defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring[SimpleFunctionDescriptorImpl]

'performRefactoring' @ [146:13] ==> protected abstract fun performRefactoring(descriptorsForChange: Collection<CallableDescriptor>): Unit defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring[SimpleFunctionDescriptorImpl]

'closestModifiableDescriptors' @ [146:32] ==> val closestModifiableDescriptors: Collection<CallableDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring.run[LocalVariableDescriptor]

'assert' @ [150:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!' @ [150:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'closestModifiableDescriptors' @ [150:17] ==> val closestModifiableDescriptors: Collection<CallableDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring.run[LocalVariableDescriptor]

'isEmpty' @ [150:46] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'?:' @ [152:17] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Collection<CallableDescriptor>?, right: Collection<CallableDescriptor>): Collection<CallableDescriptor>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Collection<CallableDescriptor>

'callableDescriptor' @ [152:18] ==> @Suppress public final val callableDescriptor: T defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring[PropertyDescriptorImpl]

'let' @ [152:68] ==> @InlineOnly public inline fun <T, R> CallableMemberDescriptor.let(block: (CallableMemberDescriptor) -> Collection<CallableMemberDescriptor>): Collection<CallableMemberDescriptor> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableMemberDescriptor
    <R> -> Collection<CallableMemberDescriptor>

'getDeepestSuperDeclarations' @ [152:98] ==> public fun <D : CallableMemberDescriptor> CallableMemberDescriptor.getDeepestSuperDeclarations(): Collection<CallableMemberDescriptor> defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <D : CallableMemberDescriptor> -> CallableMemberDescriptor

'listOf' @ [153:20] ==> public fun <T> listOf(element: T): List<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'callableDescriptor' @ [153:27] ==> @Suppress public final val callableDescriptor: T defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring[PropertyDescriptorImpl]

'!!' @ [154:13] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: Application?): Application[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> Application

'getApplication' @ [154:32] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'isUnitTestMode' @ [154:51] ==> public final val Application.isUnitTestMode: Boolean[MyPropertyDescriptor]

'performRefactoring' @ [155:13] ==> protected abstract fun performRefactoring(descriptorsForChange: Collection<CallableDescriptor>): Unit defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring[SimpleFunctionDescriptorImpl]

'deepestSuperDeclarations' @ [155:32] ==> val deepestSuperDeclarations: Collection<CallableDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring.run[LocalVariableDescriptor]

'closestModifiableDescriptors' @ [159:13] ==> val closestModifiableDescriptors: Collection<CallableDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring.run[LocalVariableDescriptor]

'size' @ [159:42] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'deepestSuperDeclarations' @ [159:55] ==> val deepestSuperDeclarations: Collection<CallableDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring.run[LocalVariableDescriptor]

'subtract' @ [159:80] ==> public infix fun <T> Iterable<CallableDescriptor>.subtract(other: Iterable<CallableDescriptor>): Set<CallableDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableDescriptor

'closestModifiableDescriptors' @ [159:89] ==> val closestModifiableDescriptors: Collection<CallableDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring.run[LocalVariableDescriptor]

'isEmpty' @ [159:119] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'performRefactoring' @ [160:13] ==> protected abstract fun performRefactoring(descriptorsForChange: Collection<CallableDescriptor>): Unit defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring[SimpleFunctionDescriptorImpl]

'closestModifiableDescriptors' @ [160:32] ==> val closestModifiableDescriptors: Collection<CallableDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring.run[LocalVariableDescriptor]

'closestModifiableDescriptors' @ [164:40] ==> val closestModifiableDescriptors: Collection<CallableDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring.run[LocalVariableDescriptor]

'size' @ [164:69] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'if (isSingleFunctionSelected) closestModifiableDescriptors.first() else callableDescriptor' @ [165:32] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: CallableDescriptor, elseBranch: CallableDescriptor): CallableDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> CallableDescriptor

'isSingleFunctionSelected' @ [165:36] ==> val isSingleFunctionSelected: Boolean defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring.run[LocalVariableDescriptor]

'closestModifiableDescriptors' @ [165:62] ==> val closestModifiableDescriptors: Collection<CallableDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring.run[LocalVariableDescriptor]

'first' @ [165:91] ==> public fun <T> Iterable<CallableDescriptor>.first(): CallableDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableDescriptor

'callableDescriptor' @ [165:104] ==> @Suppress public final val callableDescriptor: T defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring[PropertyDescriptorImpl]

'buildDialogOptions' @ [166:32] ==> local final fun buildDialogOptions(isSingleFunctionSelected: Boolean): List<String> defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring.run[SimpleFunctionDescriptorImpl]

'isSingleFunctionSelected' @ [166:51] ==> val isSingleFunctionSelected: Boolean defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring.run[LocalVariableDescriptor]

'showSuperFunctionWarningDialog' @ [167:20] ==> private final fun showSuperFunctionWarningDialog(superCallables: Collection<CallableDescriptor>, callableFromEditor: CallableDescriptor, options: List<String>): Int defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring[SimpleFunctionDescriptorImpl]

'deepestSuperDeclarations' @ [167:51] ==> val deepestSuperDeclarations: Collection<CallableDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring.run[LocalVariableDescriptor]

'selectedFunction' @ [167:77] ==> val selectedFunction: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring.run[LocalVariableDescriptor]

'optionsForDialog' @ [167:95] ==> val optionsForDialog: List<String> defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring.run[LocalVariableDescriptor]

'when {
            performForWholeHierarchy(optionsForDialog, code) -> {
                performRefactoring(deepestSuperDeclarations)
            }
            performForSelectedFunctionOnly(optionsForDialog, code) -> {
                performRefactoring(closestModifiableDescriptors)
            }
            else -> {
                //do nothing
                return false
            }
        }' @ [168:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'performForWholeHierarchy' @ [169:13] ==> local final fun performForWholeHierarchy(dialogButtons: List<String>, code: Int): Boolean defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring.run[SimpleFunctionDescriptorImpl]

'optionsForDialog' @ [169:38] ==> val optionsForDialog: List<String> defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring.run[LocalVariableDescriptor]

'code' @ [169:56] ==> val code: Int defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring.run[LocalVariableDescriptor]

'performRefactoring' @ [170:17] ==> protected abstract fun performRefactoring(descriptorsForChange: Collection<CallableDescriptor>): Unit defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring[SimpleFunctionDescriptorImpl]

'deepestSuperDeclarations' @ [170:36] ==> val deepestSuperDeclarations: Collection<CallableDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring.run[LocalVariableDescriptor]

'performForSelectedFunctionOnly' @ [172:13] ==> local final fun performForSelectedFunctionOnly(dialogButtons: List<String>, code: Int): Boolean defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring.run[SimpleFunctionDescriptorImpl]

'optionsForDialog' @ [172:44] ==> val optionsForDialog: List<String> defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring.run[LocalVariableDescriptor]

'code' @ [172:62] ==> val code: Int defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring.run[LocalVariableDescriptor]

'performRefactoring' @ [173:17] ==> protected abstract fun performRefactoring(descriptorsForChange: Collection<CallableDescriptor>): Unit defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring[SimpleFunctionDescriptorImpl]

'closestModifiableDescriptors' @ [173:36] ==> val closestModifiableDescriptors: Collection<CallableDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring.run[LocalVariableDescriptor]

'descriptorsForChange' @ [185:25] ==> value-parameter descriptorsForChange: Collection<CallableDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.getAffectedCallables[ValueParameterDescriptorImpl]

'mapNotNull' @ [185:46] ==> public inline fun <T, R : Any> Iterable<CallableDescriptor>.mapNotNull(transform: (CallableDescriptor) -> PsiElement?): List<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableDescriptor
    <R : Any> -> PsiElement

'DescriptorToSourceUtilsIde' @ [185:59] ==> public object DescriptorToSourceUtilsIde defined in org.jetbrains.kotlin.idea.codeInsight[FakeCallableDescriptorForObject]

'getAnyDeclaration' @ [185:86] ==> public final fun getAnyDeclaration(project: Project, descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.idea.codeInsight.DescriptorToSourceUtilsIde[DeserializedSimpleFunctionDescriptor]

'project' @ [185:104] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.getAffectedCallables[ValueParameterDescriptorImpl]

'it' @ [185:113] ==> value-parameter it: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.getAffectedCallables.<anonymous>[ValueParameterDescriptorImpl]

'baseCallables' @ [186:12] ==> val baseCallables: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.getAffectedCallables[LocalVariableDescriptor]

'baseCallables' @ [186:28] ==> val baseCallables: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.getAffectedCallables[LocalVariableDescriptor]

'flatMapTo' @ [186:42] ==> public inline fun <T, R, C : MutableCollection<in PsiElement>> Iterable<PsiElement>.flatMapTo(destination: HashSet<PsiElement>, transform: (PsiElement) -> Iterable<PsiElement>): HashSet<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> PsiElement
    <C : MutableCollection<in R>> -> HashSet<PsiElement>

'HashSet' @ [186:52] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> PsiElement

'if (callable is KtDeclaration && callable.isHeaderOrHeaderClassMember()) {
            callable.headerImplementations()
        }
        else {
            callable.toLightMethods().flatMap { psiMethod ->
                val overrides = OverridingMethodsSearch.search(psiMethod).findAll()
                overrides.map { method -> method.namedUnwrappedElement ?: method}
            }
        }' @ [187:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Iterable<PsiElement>, elseBranch: Iterable<PsiElement>): Iterable<PsiElement>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Iterable<PsiElement>

'callable' @ [187:13] ==> value-parameter callable: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.getAffectedCallables.<anonymous>[ValueParameterDescriptorImpl]

'callable' @ [187:42] ==> value-parameter callable: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.getAffectedCallables.<anonymous>[ValueParameterDescriptorImpl]

'isHeaderOrHeaderClassMember' @ [187:51] ==> internal fun KtDeclaration.isHeaderOrHeaderClassMember(): Boolean defined in org.jetbrains.kotlin.idea.highlighter.markers in file DeclaredHeaderMarker.kt[SimpleFunctionDescriptorImpl]

'callable' @ [188:13] ==> value-parameter callable: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.getAffectedCallables.<anonymous>[ValueParameterDescriptorImpl]

'headerImplementations' @ [188:22] ==> internal fun KtDeclaration.headerImplementations(): Set<KtDeclaration> defined in org.jetbrains.kotlin.idea.highlighter.markers in file ImplementedHeaderMarker.kt[SimpleFunctionDescriptorImpl]

'callable' @ [191:13] ==> value-parameter callable: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.getAffectedCallables.<anonymous>[ValueParameterDescriptorImpl]

'toLightMethods' @ [191:22] ==> public fun PsiElement.toLightMethods(): List<PsiMethod> defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'flatMap' @ [191:39] ==> public inline fun <T, R> Iterable<PsiMethod>.flatMap(transform: (PsiMethod) -> Iterable<(PsiNamedElement..PsiNamedElement?)>): List<(PsiNamedElement..PsiNamedElement?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiMethod
    <R> -> (com.intellij.psi.PsiNamedElement..com.intellij.psi.PsiNamedElement?)

'search' @ [192:57] ==> @NotNull public open fun search(@NotNull p0: PsiMethod): Query<(PsiMethod..PsiMethod?)> defined in com.intellij.psi.search.searches.OverridingMethodsSearch[JavaMethodDescriptor]

'psiMethod' @ [192:64] ==> value-parameter psiMethod: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.getAffectedCallables.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'findAll' @ [192:75] ==> @NotNull public abstract fun findAll(): (MutableCollection<(PsiMethod..PsiMethod?)>..Collection<(PsiMethod..PsiMethod?)>) defined in com.intellij.util.Query[JavaMethodDescriptor]

'overrides' @ [193:17] ==> val overrides: (MutableCollection<(PsiMethod..PsiMethod?)>..Collection<(PsiMethod..PsiMethod?)>) defined in org.jetbrains.kotlin.idea.refactoring.getAffectedCallables.<anonymous>.<anonymous>[LocalVariableDescriptor]

'map' @ [193:27] ==> public inline fun <T, R> Iterable<(PsiMethod..PsiMethod?)>.map(transform: ((PsiMethod..PsiMethod?)) -> (PsiNamedElement..PsiNamedElement?)): List<(PsiNamedElement..PsiNamedElement?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiMethod..com.intellij.psi.PsiMethod?)
    <R> -> (com.intellij.psi.PsiNamedElement..com.intellij.psi.PsiNamedElement?)

'method' @ [193:43] ==> value-parameter method: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.idea.refactoring.getAffectedCallables.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'namedUnwrappedElement' @ [193:50] ==> public val PsiElement.namedUnwrappedElement: PsiNamedElement? defined in org.jetbrains.kotlin.asJava[DeserializedPropertyDescriptor]

'method' @ [193:75] ==> value-parameter method: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.idea.refactoring.getAffectedCallables.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'DescriptorToSourceUtils' @ [200:23] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve[FakeCallableDescriptorForObject]

'descriptorToDeclaration' @ [200:47] ==> @JvmStatic public final fun descriptorToDeclaration(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[DeserializedSimpleFunctionDescriptor]

'this' @ [200:71] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.getContainingScope[ReceiverParameterDescriptorImpl]

'declaration' @ [201:17] ==> val declaration: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.getContainingScope[LocalVariableDescriptor]

'parent' @ [201:30] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'if (block != null) {
        val lastStatement = block.statements.last()
        val bindingContext = lastStatement.analyze()
        lastStatement.getResolutionScope(bindingContext, lastStatement.getResolutionFacade())
    }
    else {
        val containingDescriptor = containingDeclaration ?: return null
        when (containingDescriptor) {
            is ClassDescriptorWithResolutionScopes -> containingDescriptor.scopeForInitializerResolution
            is PackageFragmentDescriptor -> LexicalScope.Base(containingDescriptor.getMemberScope().memberScopeAsImportingScope(), this)
            else -> null
        }
    }' @ [202:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: LexicalScope?, elseBranch: LexicalScope?): LexicalScope?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> LexicalScope?

'block' @ [202:16] ==> val block: KtBlockExpression? defined in org.jetbrains.kotlin.idea.refactoring.getContainingScope[LocalVariableDescriptor]

'block' @ [203:29] ==> val block: KtBlockExpression? defined in org.jetbrains.kotlin.idea.refactoring.getContainingScope[LocalVariableDescriptor]

'statements' @ [203:35] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'last' @ [203:46] ==> public fun <T> List<(KtExpression..KtExpression?)>.last(): (KtExpression..KtExpression?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)

'lastStatement' @ [204:30] ==> val lastStatement: (KtExpression..KtExpression?) defined in org.jetbrains.kotlin.idea.refactoring.getContainingScope[LocalVariableDescriptor]

'analyze' @ [204:44] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'lastStatement' @ [205:9] ==> val lastStatement: (KtExpression..KtExpression?) defined in org.jetbrains.kotlin.idea.refactoring.getContainingScope[LocalVariableDescriptor]

'getResolutionScope' @ [205:23] ==> public fun PsiElement.getResolutionScope(bindingContext: BindingContext, resolutionFacade: ResolutionFacade): LexicalScope defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [205:42] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.getContainingScope[LocalVariableDescriptor]

'lastStatement' @ [205:58] ==> val lastStatement: (KtExpression..KtExpression?) defined in org.jetbrains.kotlin.idea.refactoring.getContainingScope[LocalVariableDescriptor]

'getResolutionFacade' @ [205:72] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'containingDeclaration' @ [208:36] ==> public final val DeclarationDescriptor.containingDeclaration: DeclarationDescriptor?[MyPropertyDescriptor]

'when (containingDescriptor) {
            is ClassDescriptorWithResolutionScopes -> containingDescriptor.scopeForInitializerResolution
            is PackageFragmentDescriptor -> LexicalScope.Base(containingDescriptor.getMemberScope().memberScopeAsImportingScope(), this)
            else -> null
        }' @ [209:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: LexicalScope?, entry1: LexicalScope?, entry2: LexicalScope?): LexicalScope?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> LexicalScope?

'containingDescriptor' @ [209:15] ==> val containingDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.getContainingScope[LocalVariableDescriptor]

'containingDescriptor' @ [210:55] ==> val containingDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.getContainingScope[LocalVariableDescriptor]

'scopeForInitializerResolution' @ [210:76] ==> public final val ClassDescriptorWithResolutionScopes.scopeForInitializerResolution: LexicalScope[MyPropertyDescriptor]

'Base' @ [211:58] ==> public constructor Base(parent: HierarchicalScope, ownerDescriptor: DeclarationDescriptor) defined in org.jetbrains.kotlin.resolve.scopes.LexicalScope.Base[DeserializedClassConstructorDescriptor]

'containingDescriptor' @ [211:63] ==> val containingDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.getContainingScope[LocalVariableDescriptor]

'getMemberScope' @ [211:84] ==> public abstract fun getMemberScope(): MemberScope defined in org.jetbrains.kotlin.descriptors.PackageFragmentDescriptor[DeserializedSimpleFunctionDescriptor]

'memberScopeAsImportingScope' @ [211:101] ==> @JvmOverloads public fun MemberScope.memberScopeAsImportingScope(parentScope: ImportingScope? = ...): ImportingScope defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedSimpleFunctionDescriptor]

'this' @ [211:132] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.getContainingScope[ReceiverParameterDescriptorImpl]

'bodyExpression' @ [218:22] ==> public final val KtDeclarationWithBody.bodyExpression: KtExpression?[MyPropertyDescriptor]

'children' @ [218:38] ==> public final val KtExpression.children: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>)[MyPropertyDescriptor]

'firstOrNull' @ [218:48] ==> public inline fun <T> Array<out (PsiElement..PsiElement?)>.firstOrNull(predicate: ((PsiElement..PsiElement?)) -> Boolean): PsiElement? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'it' @ [218:62] ==> value-parameter it: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.getBodyScope.<anonymous>[ValueParameterDescriptorImpl]

'expression' @ [219:12] ==> val expression: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.getBodyScope[LocalVariableDescriptor]

'getResolutionScope' @ [219:23] ==> public fun PsiElement.getResolutionScope(bindingContext: BindingContext, resolutionFacade: ResolutionFacade): LexicalScope defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [219:42] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.getBodyScope[ValueParameterDescriptorImpl]

'getResolutionFacade' @ [219:58] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

