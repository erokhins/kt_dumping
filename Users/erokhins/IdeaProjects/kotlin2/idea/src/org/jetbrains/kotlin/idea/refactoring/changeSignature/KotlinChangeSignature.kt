'originalDescriptor' @ [48:89] ==> value-parameter originalDescriptor: KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureConfiguration.configure[ValueParameterDescriptorImpl]

'KotlinMutableMethodDescriptor' @ [56:25] ==> public constructor KotlinMutableMethodDescriptor(original: KotlinMethodDescriptor) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinMutableMethodDescriptor[ClassConstructorDescriptorImpl]

'this' @ [56:55] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.modify[ReceiverParameterDescriptorImpl]

'invoke' @ [57:5] ==> public abstract operator fun invoke(p1: KotlinMutableMethodDescriptor): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'newDescriptor' @ [57:12] ==> val newDescriptor: KotlinMutableMethodDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.modify[LocalVariableDescriptor]

'newDescriptor' @ [58:12] ==> val newDescriptor: KotlinMutableMethodDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.modify[LocalVariableDescriptor]

'KotlinChangeSignature' @ [66:12] ==> public constructor KotlinChangeSignature(project: Project, callableDescriptor: CallableDescriptor, configuration: KotlinChangeSignatureConfiguration, defaultValueContext: PsiElement, commandName: String?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature[ClassConstructorDescriptorImpl]

'project' @ [66:34] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.runChangeSignature[ValueParameterDescriptorImpl]

'callableDescriptor' @ [66:43] ==> value-parameter callableDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.runChangeSignature[ValueParameterDescriptorImpl]

'configuration' @ [66:63] ==> value-parameter configuration: KotlinChangeSignatureConfiguration defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.runChangeSignature[ValueParameterDescriptorImpl]

'defaultValueContext' @ [66:78] ==> value-parameter defaultValueContext: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.runChangeSignature[ValueParameterDescriptorImpl]

'commandName' @ [66:99] ==> value-parameter commandName: String? = ... defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.runChangeSignature[ValueParameterDescriptorImpl]

'run' @ [66:112] ==> public final fun run(): Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature[SimpleFunctionDescriptorImpl]

'CallableRefactoring<CallableDescriptor>' @ [75:4] ==> public constructor CallableRefactoring<out T : CallableDescriptor>(project: Project, callableDescriptor: CallableDescriptor, commandName: String) defined in org.jetbrains.kotlin.idea.refactoring.CallableRefactoring[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : CallableDescriptor> -> CallableDescriptor

'project' @ [75:44] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.<init>[ValueParameterDescriptorImpl]

'callableDescriptor' @ [75:53] ==> value-parameter callableDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.<init>[ValueParameterDescriptorImpl]

'commandName' @ [75:73] ==> value-parameter commandName: String? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.<init>[ValueParameterDescriptorImpl]

'REFACTORING_NAME' @ [75:111] ==> public const final val REFACTORING_NAME: (String..String?) defined in com.intellij.refactoring.changeSignature.ChangeSignatureHandler[JavaPropertyDescriptor]

'getInstance' @ [77:30] ==> @NotNull public open fun getInstance(@NotNull p0: raw (Class<(Any..Any?)>..Class<*>)): Logger defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'KotlinChangeSignature' @ [77:42] ==> public constructor KotlinChangeSignature(project: Project, callableDescriptor: CallableDescriptor, configuration: KotlinChangeSignatureConfiguration, defaultValueContext: PsiElement, commandName: String?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature[ClassConstructorDescriptorImpl]

'java' @ [77:71] ==> public val <T> KClass<KotlinChangeSignature>.java: Class<KotlinChangeSignature> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KotlinChangeSignature

'configuration' @ [79:58] ==> public final val configuration: KotlinChangeSignatureConfiguration defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature[PropertyDescriptorImpl]

'forcePerformForSelectedFunctionOnly' @ [79:72] ==> public open fun forcePerformForSelectedFunctionOnly(): Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureConfiguration[SimpleFunctionDescriptorImpl]

'descriptor' @ [82:31] ==> value-parameter descriptor: KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.runSilentRefactoring[ValueParameterDescriptorImpl]

'baseDeclaration' @ [82:42] ==> public abstract val baseDeclaration: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinMethodDescriptor[PropertyDescriptorImpl]

'when (baseDeclaration) {
            is KtFunction, is KtClass -> {
                KotlinChangeSignatureDialog.createRefactoringProcessorForSilentChangeSignature(project, commandName, descriptor, defaultValueContext)
            }
            is KtProperty, is KtParameter -> {
                KotlinChangePropertySignatureDialog.createProcessorForSilentRefactoring(project, commandName, descriptor)
            }
            is PsiMethod -> {
                if (baseDeclaration.language != JavaLanguage.INSTANCE) {
                    Messages.showErrorDialog("Can't change signature of ${baseDeclaration.language.displayName} method", commandName)
                    return
                }

                ChangeSignatureProcessor(project, getPreviewInfoForJavaMethod(descriptor).second)
            }
            else -> throw AssertionError("Unexpected declaration: ${baseDeclaration.getElementTextWithContext()}")
        }' @ [83:25] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: BaseRefactoringProcessor, entry1: BaseRefactoringProcessor, entry2: BaseRefactoringProcessor, entry3: BaseRefactoringProcessor): BaseRefactoringProcessor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> BaseRefactoringProcessor

'baseDeclaration' @ [83:31] ==> val baseDeclaration: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.runSilentRefactoring[LocalVariableDescriptor]

'KotlinChangeSignatureDialog' @ [85:17] ==> public companion object defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog[FakeCallableDescriptorForObject]

'createRefactoringProcessorForSilentChangeSignature' @ [85:45] ==> public final fun createRefactoringProcessorForSilentChangeSignature(project: Project, commandName: String, method: KotlinMethodDescriptor, defaultValueContext: PsiElement): BaseRefactoringProcessor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion[SimpleFunctionDescriptorImpl]

'project' @ [85:96] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature[PropertyDescriptorImpl]

'commandName' @ [85:105] ==> public final val commandName: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature[PropertyDescriptorImpl]

'descriptor' @ [85:118] ==> value-parameter descriptor: KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.runSilentRefactoring[ValueParameterDescriptorImpl]

'defaultValueContext' @ [85:130] ==> public final val defaultValueContext: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature[PropertyDescriptorImpl]

'KotlinChangePropertySignatureDialog' @ [88:17] ==> public companion object defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangePropertySignatureDialog[FakeCallableDescriptorForObject]

'createProcessorForSilentRefactoring' @ [88:53] ==> public final fun createProcessorForSilentRefactoring(project: Project, commandName: String, descriptor: KotlinMethodDescriptor): BaseRefactoringProcessor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangePropertySignatureDialog.Companion[SimpleFunctionDescriptorImpl]

'project' @ [88:89] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature[PropertyDescriptorImpl]

'commandName' @ [88:98] ==> public final val commandName: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature[PropertyDescriptorImpl]

'descriptor' @ [88:111] ==> value-parameter descriptor: KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.runSilentRefactoring[ValueParameterDescriptorImpl]

'baseDeclaration' @ [91:21] ==> val baseDeclaration: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.runSilentRefactoring[LocalVariableDescriptor]

'language' @ [91:37] ==> public final val PsiMethod.language: Language[MyPropertyDescriptor]

'INSTANCE' @ [91:62] ==> @NotNull public final val INSTANCE: JavaLanguage defined in com.intellij.lang.java.JavaLanguage[JavaPropertyDescriptor]

'showErrorDialog' @ [92:30] ==> public open fun showErrorDialog(p0: (String..String?), @NotNull @Nls p1: String): Unit defined in com.intellij.openapi.ui.Messages[JavaMethodDescriptor]

'baseDeclaration' @ [92:75] ==> val baseDeclaration: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.runSilentRefactoring[LocalVariableDescriptor]

'language' @ [92:91] ==> public final val PsiMethod.language: Language[MyPropertyDescriptor]

'displayName' @ [92:100] ==> public final val Language.displayName: String[MyPropertyDescriptor]

'commandName' @ [92:122] ==> public final val commandName: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature[PropertyDescriptorImpl]

'ChangeSignatureProcessor' @ [96:17] ==> public constructor ChangeSignatureProcessor(p0: (Project..Project?), p1: (JavaChangeInfo..JavaChangeInfo?)) defined in com.intellij.refactoring.changeSignature.ChangeSignatureProcessor[JavaClassConstructorDescriptor]

'project' @ [96:42] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature[PropertyDescriptorImpl]

'getPreviewInfoForJavaMethod' @ [96:51] ==> private final fun getPreviewInfoForJavaMethod(descriptor: KotlinMethodDescriptor): Pair<PsiMethod, JavaChangeInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature[SimpleFunctionDescriptorImpl]

'descriptor' @ [96:79] ==> value-parameter descriptor: KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.runSilentRefactoring[ValueParameterDescriptorImpl]

'second' @ [96:91] ==> public final val second: JavaChangeInfo defined in kotlin.Pair[DeserializedPropertyDescriptor]

'AssertionError' @ [98:27] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'baseDeclaration' @ [98:69] ==> val baseDeclaration: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.runSilentRefactoring[LocalVariableDescriptor]

'getElementTextWithContext' @ [98:85] ==> public fun PsiElement.getElementTextWithContext(): String defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'processor' @ [100:9] ==> val processor: BaseRefactoringProcessor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.runSilentRefactoring[LocalVariableDescriptor]

'run' @ [100:19] ==> public final fun run(): Unit defined in com.intellij.refactoring.BaseRefactoringProcessor[JavaMethodDescriptor]

'descriptor' @ [104:31] ==> value-parameter descriptor: KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.runInteractiveRefactoring[ValueParameterDescriptorImpl]

'baseDeclaration' @ [104:42] ==> public abstract val baseDeclaration: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinMethodDescriptor[PropertyDescriptorImpl]

'when (baseDeclaration) {
            is KtFunction, is KtClass -> KotlinChangeSignatureDialog(project, descriptor, defaultValueContext, commandName)
            is KtProperty, is KtParameter -> KotlinChangePropertySignatureDialog(project, descriptor, commandName)
            is PsiMethod -> {
                // No changes are made from Kotlin side: just run foreign refactoring
                if (descriptor is KotlinChangeSignatureData) {
                    ChangeSignatureUtil.invokeChangeSignatureOn(baseDeclaration, project)
                    return
                }

                if (baseDeclaration.language != JavaLanguage.INSTANCE) {
                    Messages.showErrorDialog("Can't change signature of ${baseDeclaration.language.displayName} method", commandName)
                    return
                }

                val (preview, javaChangeInfo) = getPreviewInfoForJavaMethod(descriptor)
                object: JavaChangeSignatureDialog(project, JavaMethodDescriptor(preview), false, null) {
                    override fun createRefactoringProcessor(): BaseRefactoringProcessor? {
                        val processor = super.createRefactoringProcessor()
                        (processor as? ChangeSignatureProcessor)?.changeInfo?.updateMethod(javaChangeInfo.method)
                        return processor
                    }
                }
            }
            else -> throw AssertionError("Unexpected declaration: ${baseDeclaration.getElementTextWithContext()}")
        }' @ [105:22] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: RefactoringDialog, entry1: RefactoringDialog, entry2: RefactoringDialog, entry3: RefactoringDialog): RefactoringDialog[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> RefactoringDialog

'baseDeclaration' @ [105:28] ==> val baseDeclaration: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.runInteractiveRefactoring[LocalVariableDescriptor]

'KotlinChangeSignatureDialog' @ [106:42] ==> public constructor KotlinChangeSignatureDialog(project: Project, methodDescriptor: KotlinMethodDescriptor, context: PsiElement, commandName: String?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog[ClassConstructorDescriptorImpl]

'project' @ [106:70] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature[PropertyDescriptorImpl]

'descriptor' @ [106:79] ==> value-parameter descriptor: KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.runInteractiveRefactoring[ValueParameterDescriptorImpl]

'defaultValueContext' @ [106:91] ==> public final val defaultValueContext: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature[PropertyDescriptorImpl]

'commandName' @ [106:112] ==> public final val commandName: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature[PropertyDescriptorImpl]

'KotlinChangePropertySignatureDialog' @ [107:46] ==> public constructor KotlinChangePropertySignatureDialog(project: Project, methodDescriptor: KotlinMethodDescriptor, commandName: String?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangePropertySignatureDialog[ClassConstructorDescriptorImpl]

'project' @ [107:82] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature[PropertyDescriptorImpl]

'descriptor' @ [107:91] ==> value-parameter descriptor: KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.runInteractiveRefactoring[ValueParameterDescriptorImpl]

'commandName' @ [107:103] ==> public final val commandName: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature[PropertyDescriptorImpl]

'descriptor' @ [110:21] ==> value-parameter descriptor: KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.runInteractiveRefactoring[ValueParameterDescriptorImpl]

'invokeChangeSignatureOn' @ [111:41] ==> public open fun invokeChangeSignatureOn(p0: (PsiMethod..PsiMethod?), p1: (Project..Project?)): Unit defined in com.intellij.refactoring.changeSignature.ChangeSignatureUtil[JavaMethodDescriptor]

'baseDeclaration' @ [111:65] ==> val baseDeclaration: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.runInteractiveRefactoring[LocalVariableDescriptor]

'project' @ [111:82] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature[PropertyDescriptorImpl]

'baseDeclaration' @ [115:21] ==> val baseDeclaration: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.runInteractiveRefactoring[LocalVariableDescriptor]

'language' @ [115:37] ==> public final val PsiMethod.language: Language[MyPropertyDescriptor]

'INSTANCE' @ [115:62] ==> @NotNull public final val INSTANCE: JavaLanguage defined in com.intellij.lang.java.JavaLanguage[JavaPropertyDescriptor]

'showErrorDialog' @ [116:30] ==> public open fun showErrorDialog(p0: (String..String?), @NotNull @Nls p1: String): Unit defined in com.intellij.openapi.ui.Messages[JavaMethodDescriptor]

'baseDeclaration' @ [116:75] ==> val baseDeclaration: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.runInteractiveRefactoring[LocalVariableDescriptor]

'language' @ [116:91] ==> public final val PsiMethod.language: Language[MyPropertyDescriptor]

'displayName' @ [116:100] ==> public final val Language.displayName: String[MyPropertyDescriptor]

'commandName' @ [116:122] ==> public final val commandName: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature[PropertyDescriptorImpl]

'component1' @ [120:22] ==> public final operator fun component1(): PsiMethod defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [120:31] ==> public final operator fun component2(): JavaChangeInfo defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'getPreviewInfoForJavaMethod' @ [120:49] ==> private final fun getPreviewInfoForJavaMethod(descriptor: KotlinMethodDescriptor): Pair<PsiMethod, JavaChangeInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature[SimpleFunctionDescriptorImpl]

'descriptor' @ [120:77] ==> value-parameter descriptor: KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.runInteractiveRefactoring[ValueParameterDescriptorImpl]

'JavaChangeSignatureDialog' @ [121:25] ==> protected/*protected and package*/ constructor JavaChangeSignatureDialog(p0: (Project..Project?), p1: (JavaMethodDescriptor..JavaMethodDescriptor?), p2: Boolean, p3: (PsiElement..PsiElement?)) defined in com.intellij.refactoring.changeSignature.JavaChangeSignatureDialog[JavaClassConstructorDescriptor]

'project' @ [121:51] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature[PropertyDescriptorImpl]

'JavaMethodDescriptor' @ [121:60] ==> public constructor JavaMethodDescriptor(p0: (PsiMethod..PsiMethod?)) defined in com.intellij.refactoring.changeSignature.JavaMethodDescriptor[JavaClassConstructorDescriptor]

'preview' @ [121:81] ==> val preview: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.runInteractiveRefactoring[LocalVariableDescriptor]

'super' @ [123:41] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.runInteractiveRefactoring.<no name provided>[LazyClassReceiverParameterDescriptor]

'createRefactoringProcessor' @ [123:47] ==> protected/*protected and package*/ open fun createRefactoringProcessor(): (BaseRefactoringProcessor..BaseRefactoringProcessor?) defined in com.intellij.refactoring.changeSignature.JavaChangeSignatureDialog[JavaMethodDescriptor]

'processor' @ [124:26] ==> val processor: (BaseRefactoringProcessor..BaseRefactoringProcessor?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.runInteractiveRefactoring.<no name provided>.createRefactoringProcessor[LocalVariableDescriptor]

'changeInfo' @ [124:67] ==> public final val ChangeSignatureProcessor.changeInfo: (JavaChangeInfoImpl..JavaChangeInfoImpl?)[MyPropertyDescriptor]

'updateMethod' @ [124:79] ==> public open fun updateMethod(p0: (PsiMethod..PsiMethod?)): Unit defined in com.intellij.refactoring.changeSignature.JavaChangeInfoImpl[JavaMethodDescriptor]

'javaChangeInfo' @ [124:92] ==> val javaChangeInfo: JavaChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.runInteractiveRefactoring[LocalVariableDescriptor]

'method' @ [124:107] ==> public final val JavaChangeInfo.method: (PsiMethod..PsiMethod?)[MyPropertyDescriptor]

'processor' @ [125:32] ==> val processor: (BaseRefactoringProcessor..BaseRefactoringProcessor?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.runInteractiveRefactoring.<no name provided>.createRefactoringProcessor[LocalVariableDescriptor]

'AssertionError' @ [129:27] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'baseDeclaration' @ [129:69] ==> val baseDeclaration: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.runInteractiveRefactoring[LocalVariableDescriptor]

'getElementTextWithContext' @ [129:85] ==> public fun PsiElement.getElementTextWithContext(): String defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'dialog' @ [132:9] ==> val dialog: RefactoringDialog defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.runInteractiveRefactoring[LocalVariableDescriptor]

'show' @ [132:16] ==> public open fun show(): Unit defined in com.intellij.refactoring.ui.RefactoringDialog[JavaMethodDescriptor]

'descriptor' @ [136:30] ==> value-parameter descriptor: KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.getPreviewInfoForJavaMethod[ValueParameterDescriptorImpl]

'baseDeclaration' @ [136:41] ==> public abstract val baseDeclaration: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinMethodDescriptor[PropertyDescriptorImpl]

'defaultValueContext' @ [137:27] ==> public final val defaultValueContext: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature[PropertyDescriptorImpl]

'containingFile' @ [137:47] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'KotlinChangeInfo' @ [140:28] ==> public constructor KotlinChangeInfo(methodDescriptor: KotlinMethodDescriptor, name: String = ..., newReturnTypeInfo: KotlinTypeInfo = ..., newVisibility: Visibility = ..., parameterInfos: List<KotlinParameterInfo> = ..., receiver: KotlinParameterInfo? = ..., context: PsiElement, primaryPropagationTargets: Collection<PsiElement> = ...) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeInfo[ClassConstructorDescriptorImpl]

'descriptor' @ [140:64] ==> value-parameter descriptor: KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.getPreviewInfoForJavaMethod[ValueParameterDescriptorImpl]

'defaultValueContext' @ [140:86] ==> public final val defaultValueContext: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature[PropertyDescriptorImpl]

'ktChangeInfo' @ [141:27] ==> val ktChangeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.getPreviewInfoForJavaMethod[LocalVariableDescriptor]

'getNewSignature' @ [141:40] ==> public final fun getNewSignature(inheritedCallable: KotlinCallableDefinitionUsage<PsiElement>): String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeInfo[SimpleFunctionDescriptorImpl]

'descriptor' @ [141:56] ==> value-parameter descriptor: KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.getPreviewInfoForJavaMethod[ValueParameterDescriptorImpl]

'originalPrimaryCallable' @ [141:67] ==> public abstract val originalPrimaryCallable: KotlinCallableDefinitionUsage<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinMethodDescriptor[PropertyDescriptorImpl]

'with' @ [142:29] ==> @InlineOnly public inline fun <T, R> with(receiver: StringBuilder /* = StringBuilder */, block: StringBuilder /* = StringBuilder */.() -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StringBuilder
    <R> -> String

'StringBuilder' @ [142:34] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'contextFile' @ [143:13] ==> val contextFile: KtFile defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.getPreviewInfoForJavaMethod[LocalVariableDescriptor]

'packageDirective' @ [143:25] ==> public final val KtFile.packageDirective: KtPackageDirective?[MyPropertyDescriptor]

'let' @ [143:43] ==> @InlineOnly public inline fun <T, R> KtPackageDirective.let(block: (KtPackageDirective) -> (StringBuilder..StringBuilder?)): (StringBuilder..StringBuilder?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtPackageDirective
    <R> -> (java.lang.StringBuilder..java.lang.StringBuilder?)

'append' @ [143:49] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'it' @ [143:56] ==> value-parameter it: KtPackageDirective defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.getPreviewInfoForJavaMethod.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [143:59] ==> public final val KtPackageDirective.text: (String..String?)[MyPropertyDescriptor]

'append' @ [143:65] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [144:13] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [144:39] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'ktSignature' @ [144:46] ==> val ktSignature: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.getPreviewInfoForJavaMethod[LocalVariableDescriptor]

'append' @ [144:59] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'toString' @ [145:13] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'KtPsiFactory' @ [147:25] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [147:38] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature[PropertyDescriptorImpl]

'createFileWithLightClassSupport' @ [147:47] ==> public final fun createFileWithLightClassSupport(fileName: String, text: String, contextToAnalyzeIn: PsiElement): KtFile defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'dummyFileText' @ [147:91] ==> val dummyFileText: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.getPreviewInfoForJavaMethod[LocalVariableDescriptor]

'originalMethod' @ [147:106] ==> val originalMethod: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.getPreviewInfoForJavaMethod[LocalVariableDescriptor]

'!!' @ [148:32] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: KtClassBody?): KtClassBody[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> KtClassBody

'dummyFile' @ [148:33] ==> val dummyFile: KtFile defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.getPreviewInfoForJavaMethod[LocalVariableDescriptor]

'declarations' @ [148:43] ==> public final val KtFile.declarations: List<(KtDeclaration..KtDeclaration?)>[MyPropertyDescriptor]

'first' @ [148:56] ==> public fun <T> List<(KtDeclaration..KtDeclaration?)>.first(): (KtDeclaration..KtDeclaration?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtDeclaration..org.jetbrains.kotlin.psi.KtDeclaration?)

'getBody' @ [148:76] ==> public final fun getBody(): KtClassBody? defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'declarations' @ [148:88] ==> public final val KtClassBody.declarations: (MutableList<(KtDeclaration..KtDeclaration?)>..List<(KtDeclaration..KtDeclaration?)>?)[MyPropertyDescriptor]

'first' @ [148:101] ==> public fun <T> List<(KtDeclaration..KtDeclaration?)>.first(): (KtDeclaration..KtDeclaration?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtDeclaration..org.jetbrains.kotlin.psi.KtDeclaration?)

'getInstance' @ [151:57] ==> public open fun getInstance(p0: (Project..Project?)): (PsiElementFactory..PsiElementFactory?) defined in com.intellij.psi.PsiElementFactory.SERVICE[JavaMethodDescriptor]

'project' @ [151:69] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature[PropertyDescriptorImpl]

'createClass' @ [151:78] ==> @NotNull public abstract fun createClass(@NonNls @NotNull p0: String): PsiClass defined in com.intellij.psi.PsiElementFactory[JavaMethodDescriptor]

'createJavaMethod' @ [152:23] ==> public fun createJavaMethod(template: PsiMethod, targetClass: PsiClass): PsiMethod defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'dummyDeclaration' @ [152:40] ==> val dummyDeclaration: (KtDeclaration..KtDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.getPreviewInfoForJavaMethod[LocalVariableDescriptor]

'getRepresentativeLightMethod' @ [152:57] ==> public fun PsiElement.getRepresentativeLightMethod(): PsiMethod? defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'containingClass' @ [152:91] ==> val containingClass: PsiClass defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.getPreviewInfoForJavaMethod[LocalVariableDescriptor]

'getVisibilityModifier' @ [156:41] ==> @PsiModifier.ModifierConstant @NotNull public open fun getVisibilityModifier(p0: (PsiModifierList..PsiModifierList?)): String defined in com.intellij.util.VisibilityUtil[JavaMethodDescriptor]

'originalMethod' @ [156:63] ==> val originalMethod: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.getPreviewInfoForJavaMethod[LocalVariableDescriptor]

'modifierList' @ [156:78] ==> public final val PsiMethod.modifierList: PsiModifierList[MyPropertyDescriptor]

'createTypeWrapper' @ [157:41] ==> public open fun createTypeWrapper(@NotNull p0: PsiType): (CanonicalTypes.Type..CanonicalTypes.Type?) defined in com.intellij.refactoring.util.CanonicalTypes[JavaMethodDescriptor]

'preview' @ [157:59] ==> val preview: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.getPreviewInfoForJavaMethod[LocalVariableDescriptor]

'returnType' @ [157:67] ==> public final val PsiMethod.returnType: PsiType?[MyPropertyDescriptor]

'VOID' @ [157:89] ==> public final val VOID: (PsiPrimitiveType..PsiPrimitiveType?) defined in com.intellij.psi.PsiType[JavaPropertyDescriptor]

'preview' @ [158:23] ==> val preview: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.getPreviewInfoForJavaMethod[LocalVariableDescriptor]

'parameterList' @ [158:31] ==> public final val PsiMethod.parameterList: PsiParameterList[MyPropertyDescriptor]

'parameters' @ [158:45] ==> public final val PsiParameterList.parameters: (Array<(PsiParameter..PsiParameter?)>..Array<out (PsiParameter..PsiParameter?)>)[MyPropertyDescriptor]

'zip' @ [158:56] ==> public infix fun <T, R> Array<out (PsiParameter..PsiParameter?)>.zip(other: Array<out KotlinParameterInfo>): List<Pair<(PsiParameter..PsiParameter?), KotlinParameterInfo>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiParameter..com.intellij.psi.PsiParameter?)
    <R> -> KotlinParameterInfo

'ktChangeInfo' @ [158:60] ==> val ktChangeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.getPreviewInfoForJavaMethod[LocalVariableDescriptor]

'newParameters' @ [158:73] ==> public final val KotlinChangeInfo.newParameters: Array<KotlinParameterInfo>[MyPropertyDescriptor]

'map' @ [158:89] ==> public inline fun <T, R> Iterable<Pair<(PsiParameter..PsiParameter?), KotlinParameterInfo>>.map(transform: (Pair<(PsiParameter..PsiParameter?), KotlinParameterInfo>) -> KotlinAwareJavaParameterInfoImpl): List<KotlinAwareJavaParameterInfoImpl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<(com.intellij.psi.PsiParameter..com.intellij.psi.PsiParameter?), KotlinParameterInfo>
    <R> -> KotlinAwareJavaParameterInfoImpl

'component1' @ [159:18] ==> public final operator fun component1(): (PsiParameter..PsiParameter?) defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [159:25] ==> public final operator fun component2(): KotlinParameterInfo defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'it' @ [159:38] ==> value-parameter it: Pair<(PsiParameter..PsiParameter?), KotlinParameterInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.getPreviewInfoForJavaMethod.<anonymous>[ValueParameterDescriptorImpl]

'KotlinAwareJavaParameterInfoImpl' @ [161:13] ==> public constructor KotlinAwareJavaParameterInfoImpl(oldParameterIndex: Int, name: String, type: PsiType, kotlinDefaultValue: KtExpression?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinAwareJavaParameterInfoImpl[ClassConstructorDescriptorImpl]

'paramInfo' @ [161:46] ==> val paramInfo: KotlinParameterInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.getPreviewInfoForJavaMethod.<anonymous>[LocalVariableDescriptor]

'oldIndex' @ [161:56] ==> public final val KotlinParameterInfo.oldIndex: Int[MyPropertyDescriptor]

'param' @ [161:66] ==> val param: (PsiParameter..PsiParameter?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.getPreviewInfoForJavaMethod.<anonymous>[LocalVariableDescriptor]

'name' @ [161:72] ==> public final val PsiParameter.name: String?[MyPropertyDescriptor]

'param' @ [161:80] ==> val param: (PsiParameter..PsiParameter?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.getPreviewInfoForJavaMethod.<anonymous>[LocalVariableDescriptor]

'type' @ [161:86] ==> public final val PsiParameter.type: PsiType[MyPropertyDescriptor]

'paramInfo' @ [161:92] ==> val paramInfo: KotlinParameterInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.getPreviewInfoForJavaMethod.<anonymous>[LocalVariableDescriptor]

'defaultValueForCall' @ [161:102] ==> public final var defaultValueForCall: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'toTypedArray' @ [162:11] ==> public inline fun <reified T> Collection<KotlinAwareJavaParameterInfoImpl>.toTypedArray(): Array<KotlinAwareJavaParameterInfoImpl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> KotlinAwareJavaParameterInfoImpl

'preview' @ [164:16] ==> val preview: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.getPreviewInfoForJavaMethod[LocalVariableDescriptor]

'JavaChangeInfoImpl' @ [164:27] ==> public constructor JavaChangeInfoImpl(@PsiModifier.ModifierConstant p0: (String..String?), p1: (PsiMethod..PsiMethod?), p2: (String..String?), p3: (CanonicalTypes.Type..CanonicalTypes.Type?), @NotNull p4: (Array<(ParameterInfoImpl..ParameterInfoImpl?)>..Array<out (ParameterInfoImpl..ParameterInfoImpl?)>), p5: (Array<(ThrownExceptionInfo..ThrownExceptionInfo?)>..Array<out (ThrownExceptionInfo..ThrownExceptionInfo?)>?), p6: Boolean, p7: (MutableSet<(PsiMethod..PsiMethod?)>..Set<(PsiMethod..PsiMethod?)>?), p8: (MutableSet<(PsiMethod..PsiMethod?)>..Set<(PsiMethod..PsiMethod?)>?)) defined in com.intellij.refactoring.changeSignature.JavaChangeInfoImpl[JavaClassConstructorDescriptor]

'visibility' @ [164:46] ==> val visibility: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.getPreviewInfoForJavaMethod[LocalVariableDescriptor]

'originalMethod' @ [165:46] ==> val originalMethod: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.getPreviewInfoForJavaMethod[LocalVariableDescriptor]

'preview' @ [166:46] ==> val preview: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.getPreviewInfoForJavaMethod[LocalVariableDescriptor]

'name' @ [166:54] ==> public final var PsiMethod.name: String[MyPropertyDescriptor]

'returnType' @ [167:46] ==> val returnType: (CanonicalTypes.Type..CanonicalTypes.Type?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.getPreviewInfoForJavaMethod[LocalVariableDescriptor]

'params' @ [168:46] ==> val params: Array<KotlinAwareJavaParameterInfoImpl> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.getPreviewInfoForJavaMethod[LocalVariableDescriptor]

'arrayOf' @ [169:46] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: ThrownExceptionInfo): Array<ThrownExceptionInfo> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> ThrownExceptionInfo

'emptySet' @ [171:46] ==> public fun <T> emptySet(): Set<PsiMethod> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiMethod

'emptySet' @ [172:46] ==> public fun <T> emptySet(): Set<PsiMethod> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiMethod

'adjustDescriptor' @ [176:34] ==> public final fun adjustDescriptor(descriptorsForSignatureChange: Collection<CallableDescriptor>): KotlinMethodDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature[SimpleFunctionDescriptorImpl]

'descriptorsForChange' @ [176:51] ==> value-parameter descriptorsForChange: Collection<CallableDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.performRefactoring[ValueParameterDescriptorImpl]

'adjustedDescriptor' @ [178:33] ==> val adjustedDescriptor: KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.performRefactoring[LocalVariableDescriptor]

'affectedCallables' @ [178:52] ==> public abstract val affectedCallables: Collection<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinMethodDescriptor[PropertyDescriptorImpl]

'mapNotNull' @ [178:70] ==> public inline fun <T, R : Any> Iterable<UsageInfo>.mapNotNull(transform: (UsageInfo) -> PsiElement?): List<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UsageInfo
    <R : Any> -> PsiElement

'it' @ [178:83] ==> value-parameter it: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.performRefactoring.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [178:86] ==> public final val UsageInfo.element: PsiElement?[MyPropertyDescriptor]

'affectedFunctions' @ [179:13] ==> val affectedFunctions: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.performRefactoring[LocalVariableDescriptor]

'any' @ [179:31] ==> public inline fun <T> Iterable<PsiElement>.any(predicate: (PsiElement) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'!' @ [179:37] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'checkModifiable' @ [179:38] ==> protected final fun checkModifiable(element: PsiElement): Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature[SimpleFunctionDescriptorImpl]

'it' @ [179:54] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.performRefactoring.<anonymous>[ValueParameterDescriptorImpl]

'if (configuration.performSilently(affectedFunctions) || ApplicationManager.getApplication()!!.isUnitTestMode) {
            runSilentRefactoring(adjustedDescriptor)
        }
        else {
            runInteractiveRefactoring(adjustedDescriptor)
        }' @ [181:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'configuration' @ [181:13] ==> public final val configuration: KotlinChangeSignatureConfiguration defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature[PropertyDescriptorImpl]

'performSilently' @ [181:27] ==> public open fun performSilently(affectedFunctions: Collection<PsiElement>): Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureConfiguration[SimpleFunctionDescriptorImpl]

'affectedFunctions' @ [181:43] ==> val affectedFunctions: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.performRefactoring[LocalVariableDescriptor]

'!!' @ [181:65] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: Application?): Application[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> Application

'getApplication' @ [181:84] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'isUnitTestMode' @ [181:103] ==> public final val Application.isUnitTestMode: Boolean[MyPropertyDescriptor]

'runSilentRefactoring' @ [182:13] ==> private final fun runSilentRefactoring(descriptor: KotlinMethodDescriptor): Unit defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature[SimpleFunctionDescriptorImpl]

'adjustedDescriptor' @ [182:34] ==> val adjustedDescriptor: KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.performRefactoring[LocalVariableDescriptor]

'runInteractiveRefactoring' @ [185:13] ==> private final fun runInteractiveRefactoring(descriptor: KotlinMethodDescriptor): Unit defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature[SimpleFunctionDescriptorImpl]

'adjustedDescriptor' @ [185:39] ==> val adjustedDescriptor: KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.performRefactoring[LocalVariableDescriptor]

'preferContainedInClass' @ [190:30] ==> private final fun preferContainedInClass(descriptorsForSignatureChange: Collection<CallableDescriptor>): CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature[SimpleFunctionDescriptorImpl]

'descriptorsForSignatureChange' @ [190:53] ==> value-parameter descriptorsForSignatureChange: Collection<CallableDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.adjustDescriptor[ValueParameterDescriptorImpl]

'DescriptorToSourceUtilsIde' @ [191:35] ==> public object DescriptorToSourceUtilsIde defined in org.jetbrains.kotlin.idea.codeInsight[FakeCallableDescriptorForObject]

'getAnyDeclaration' @ [191:62] ==> public final fun getAnyDeclaration(project: Project, descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.idea.codeInsight.DescriptorToSourceUtilsIde[DeserializedSimpleFunctionDescriptor]

'project' @ [191:80] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature[PropertyDescriptorImpl]

'baseDescriptor' @ [191:89] ==> val baseDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.adjustDescriptor[LocalVariableDescriptor]

'functionDeclaration' @ [192:13] ==> val functionDeclaration: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.adjustDescriptor[LocalVariableDescriptor]

'LOG' @ [193:13] ==> private final val LOG: Logger defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature[PropertyDescriptorImpl]

'error' @ [193:17] ==> public open fun error(@NonNls p0: (String..String?)): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'baseDescriptor' @ [193:56] ==> val baseDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.adjustDescriptor[LocalVariableDescriptor]

'!' @ [197:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'checkModifiable' @ [197:14] ==> protected final fun checkModifiable(element: PsiElement): Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature[SimpleFunctionDescriptorImpl]

'functionDeclaration' @ [197:30] ==> val functionDeclaration: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.adjustDescriptor[LocalVariableDescriptor]

'KotlinChangeSignatureData' @ [201:34] ==> public constructor KotlinChangeSignatureData(baseDescriptor: CallableDescriptor, baseDeclaration: PsiElement, descriptorsForSignatureChange: Collection<CallableDescriptor>) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureData[ClassConstructorDescriptorImpl]

'baseDescriptor' @ [201:60] ==> val baseDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.adjustDescriptor[LocalVariableDescriptor]

'functionDeclaration' @ [201:76] ==> val functionDeclaration: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.adjustDescriptor[LocalVariableDescriptor]

'descriptorsForSignatureChange' @ [201:97] ==> value-parameter descriptorsForSignatureChange: Collection<CallableDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.adjustDescriptor[ValueParameterDescriptorImpl]

'configuration' @ [202:16] ==> public final val configuration: KotlinChangeSignatureConfiguration defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature[PropertyDescriptorImpl]

'configure' @ [202:30] ==> public open fun configure(originalDescriptor: KotlinMethodDescriptor): KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureConfiguration[SimpleFunctionDescriptorImpl]

'originalDescriptor' @ [202:40] ==> val originalDescriptor: KotlinChangeSignatureData defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.adjustDescriptor[LocalVariableDescriptor]

'descriptorsForSignatureChange' @ [206:28] ==> value-parameter descriptorsForSignatureChange: Collection<CallableDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.preferContainedInClass[ValueParameterDescriptorImpl]

'descriptor' @ [207:41] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.preferContainedInClass[LocalVariableDescriptor]

'containingDeclaration' @ [207:52] ==> public final val CallableDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'containingDeclaration' @ [208:17] ==> val containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.preferContainedInClass[LocalVariableDescriptor]

'containingDeclaration' @ [208:61] ==> val containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.preferContainedInClass[LocalVariableDescriptor]

'kind' @ [208:83] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'INTERFACE' @ [208:101] ==> enum entry INTERFACE defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'descriptor' @ [209:24] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.preferContainedInClass[LocalVariableDescriptor]

'descriptorsForSignatureChange' @ [213:16] ==> value-parameter descriptorsForSignatureChange: Collection<CallableDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature.preferContainedInClass[ValueParameterDescriptorImpl]

'first' @ [213:46] ==> public fun <T> Iterable<CallableDescriptor>.first(): CallableDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableDescriptor

'TestOnly' @ [217:1] ==> public constructor TestOnly() defined in org.jetbrains.annotations.TestOnly[JavaClassConstructorDescriptor]

'KotlinChangeSignature' @ [223:30] ==> public constructor KotlinChangeSignature(project: Project, callableDescriptor: CallableDescriptor, configuration: KotlinChangeSignatureConfiguration, defaultValueContext: PsiElement, commandName: String?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature[ClassConstructorDescriptorImpl]

'project' @ [223:52] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.createChangeInfo[ValueParameterDescriptorImpl]

'callableDescriptor' @ [223:61] ==> value-parameter callableDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.createChangeInfo[ValueParameterDescriptorImpl]

'configuration' @ [223:81] ==> value-parameter configuration: KotlinChangeSignatureConfiguration defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.createChangeInfo[ValueParameterDescriptorImpl]

'defaultValueContext' @ [223:96] ==> value-parameter defaultValueContext: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.createChangeInfo[ValueParameterDescriptorImpl]

'?:' @ [225:13] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Collection<CallableDescriptor>?, right: Collection<CallableDescriptor>): Collection<CallableDescriptor>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Collection<CallableDescriptor>

'callableDescriptor' @ [225:14] ==> value-parameter callableDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.createChangeInfo[ValueParameterDescriptorImpl]

'getDeepestSuperDeclarations' @ [225:64] ==> public fun <D : CallableMemberDescriptor> CallableMemberDescriptor.getDeepestSuperDeclarations(): Collection<CallableMemberDescriptor> defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <D : CallableMemberDescriptor> -> CallableMemberDescriptor

'listOf' @ [225:97] ==> public fun <T> listOf(element: CallableDescriptor): List<CallableDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableDescriptor

'callableDescriptor' @ [225:104] ==> value-parameter callableDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.createChangeInfo[ValueParameterDescriptorImpl]

'jetChangeSignature' @ [227:30] ==> val jetChangeSignature: KotlinChangeSignature defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.createChangeInfo[LocalVariableDescriptor]

'adjustDescriptor' @ [227:49] ==> public final fun adjustDescriptor(descriptorsForSignatureChange: Collection<CallableDescriptor>): KotlinMethodDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignature[SimpleFunctionDescriptorImpl]

'declarations' @ [227:66] ==> val declarations: Collection<CallableDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.createChangeInfo[LocalVariableDescriptor]

'KotlinChangeSignatureDialog' @ [229:21] ==> public companion object defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog[FakeCallableDescriptorForObject]

'createRefactoringProcessorForSilentChangeSignature' @ [229:49] ==> public final fun createRefactoringProcessorForSilentChangeSignature(project: Project, commandName: String, method: KotlinMethodDescriptor, defaultValueContext: PsiElement): BaseRefactoringProcessor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinChangeSignatureDialog.Companion[SimpleFunctionDescriptorImpl]

'project' @ [230:13] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.createChangeInfo[ValueParameterDescriptorImpl]

'REFACTORING_NAME' @ [231:36] ==> public const final val REFACTORING_NAME: (String..String?) defined in com.intellij.refactoring.changeSignature.ChangeSignatureHandler[JavaPropertyDescriptor]

'adjustedDescriptor' @ [232:13] ==> val adjustedDescriptor: KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.createChangeInfo[LocalVariableDescriptor]

'defaultValueContext' @ [233:13] ==> value-parameter defaultValueContext: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.createChangeInfo[ValueParameterDescriptorImpl]

'processor' @ [235:12] ==> val processor: KotlinChangeSignatureProcessor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.createChangeInfo[LocalVariableDescriptor]

'ktChangeInfo' @ [235:22] ==> public final val ktChangeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeSignatureProcessor[PropertyDescriptorImpl]

