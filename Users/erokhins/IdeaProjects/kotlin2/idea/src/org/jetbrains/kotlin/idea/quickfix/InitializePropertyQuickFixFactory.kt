'KotlinIntentionActionsFactory' @ [53:44] ==> public constructor KotlinIntentionActionsFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinIntentionActionsFactory[DeserializedClassConstructorDescriptor]

'KotlinQuickFixAction<KtProperty>' @ [54:53] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtProperty) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtProperty

'property' @ [54:86] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.AddInitializerFix.<init>[ValueParameterDescriptorImpl]

'text' @ [56:40] ==> public final val InitializePropertyQuickFixFactory.AddInitializerFix.text: String[MyPropertyDescriptor]

'element' @ [59:27] ==> protected final val element: KtProperty? defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.AddInitializerFix[PropertyDescriptorImpl]

'element' @ [60:30] ==> val element: KtProperty defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.AddInitializerFix.invoke[LocalVariableDescriptor]

'resolveToDescriptorIfAny' @ [60:38] ==> public fun KtDeclaration.resolveToDescriptorIfAny(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'?:' @ [61:35] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: String?, right: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> String

'defaultInitializer' @ [61:52] ==> @Nullable public open fun defaultInitializer(type: (KotlinType..KotlinType?)): String? defined in org.jetbrains.kotlin.idea.codeInsight.CodeInsightUtils[JavaMethodDescriptor]

'descriptor' @ [61:71] ==> val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.AddInitializerFix.invoke[LocalVariableDescriptor]

'type' @ [61:82] ==> public final val PropertyDescriptor.type: KotlinType[MyPropertyDescriptor]

'element' @ [62:31] ==> val element: KtProperty defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.AddInitializerFix.invoke[LocalVariableDescriptor]

'setInitializer' @ [62:39] ==> @Nullable public open fun setInitializer(@Nullable p0: KtExpression?): KtExpression? defined in org.jetbrains.kotlin.psi.KtProperty[JavaMethodDescriptor]

'KtPsiFactory' @ [62:54] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [62:67] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.AddInitializerFix.invoke[ValueParameterDescriptorImpl]

'createExpression' @ [62:76] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'initializerText' @ [62:93] ==> val initializerText: String defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.AddInitializerFix.invoke[LocalVariableDescriptor]

'editor' @ [63:17] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.AddInitializerFix.invoke[ValueParameterDescriptorImpl]

'getInstance' @ [64:36] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'project' @ [64:48] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.AddInitializerFix.invoke[ValueParameterDescriptorImpl]

'commitDocument' @ [64:57] ==> public abstract fun commitDocument(@NotNull p0: Document): Unit defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'editor' @ [64:72] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.AddInitializerFix.invoke[ValueParameterDescriptorImpl]

'document' @ [64:79] ==> public final val Editor.document: Document[MyPropertyDescriptor]

'editor' @ [65:17] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.AddInitializerFix.invoke[ValueParameterDescriptorImpl]

'selectionModel' @ [65:24] ==> public final val Editor.selectionModel: SelectionModel[MyPropertyDescriptor]

'setSelection' @ [65:39] ==> public abstract fun setSelection(p0: Int, p1: Int): Unit defined in com.intellij.openapi.editor.SelectionModel[JavaMethodDescriptor]

'initializer' @ [65:52] ==> val initializer: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.AddInitializerFix.invoke[LocalVariableDescriptor]

'startOffset' @ [65:64] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'initializer' @ [65:77] ==> val initializer: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.AddInitializerFix.invoke[LocalVariableDescriptor]

'endOffset' @ [65:89] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'editor' @ [66:17] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.AddInitializerFix.invoke[ValueParameterDescriptorImpl]

'caretModel' @ [66:24] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'moveToOffset' @ [66:35] ==> public abstract fun moveToOffset(p0: Int): Unit defined in com.intellij.openapi.editor.CaretModel[JavaMethodDescriptor]

'initializer' @ [66:48] ==> val initializer: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.AddInitializerFix.invoke[LocalVariableDescriptor]

'endOffset' @ [66:60] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'KotlinQuickFixAction<KtProperty>' @ [71:63] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtProperty) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtProperty

'property' @ [71:96] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.MoveToConstructorParameters.<init>[ValueParameterDescriptorImpl]

'text' @ [73:40] ==> public final val InitializePropertyQuickFixFactory.MoveToConstructorParameters.text: String[MyPropertyDescriptor]

'originalDescriptor' @ [80:28] ==> value-parameter originalDescriptor: KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.MoveToConstructorParameters.configureChangeSignature.<no name provided>.configure[ValueParameterDescriptorImpl]

'modify' @ [80:47] ==> public fun KotlinMethodDescriptor.modify(action: (KotlinMutableMethodDescriptor) -> Unit): KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature in file KotlinChangeSignature.kt[SimpleFunctionDescriptorImpl]

'?:' @ [81:47] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: String?, right: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> String

'defaultInitializer' @ [81:64] ==> @Nullable public open fun defaultInitializer(type: (KotlinType..KotlinType?)): String? defined in org.jetbrains.kotlin.idea.codeInsight.CodeInsightUtils[JavaMethodDescriptor]

'propertyDescriptor' @ [81:83] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.MoveToConstructorParameters.configureChangeSignature[ValueParameterDescriptorImpl]

'type' @ [81:102] ==> public final val PropertyDescriptor.type: KotlinType[MyPropertyDescriptor]

'KotlinParameterInfo' @ [82:40] ==> @JvmOverloads public constructor KotlinParameterInfo(callableDescriptor: CallableDescriptor, originalIndex: Int = ..., name: String, originalTypeInfo: KotlinTypeInfo = ..., defaultValueForParameter: KtExpression? = ..., defaultValueForCall: KtExpression? = ..., valOrVar: KotlinValVar = ..., modifierList: KtModifierList? = ...) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[ClassConstructorDescriptorImpl]

'originalDescriptor' @ [83:54] ==> value-parameter originalDescriptor: KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.MoveToConstructorParameters.configureChangeSignature.<no name provided>.configure[ValueParameterDescriptorImpl]

'baseDescriptor' @ [83:73] ==> public abstract val baseDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinMethodDescriptor[PropertyDescriptorImpl]

'propertyDescriptor' @ [84:40] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.MoveToConstructorParameters.configureChangeSignature[ValueParameterDescriptorImpl]

'name' @ [84:59] ==> public final val PropertyDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [84:64] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'KotlinTypeInfo' @ [85:52] ==> public constructor KotlinTypeInfo(isCovariant: Boolean, type: KotlinType? = ..., text: String? = ...) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinTypeInfo[ClassConstructorDescriptorImpl]

'propertyDescriptor' @ [85:74] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.MoveToConstructorParameters.configureChangeSignature[ValueParameterDescriptorImpl]

'type' @ [85:93] ==> public final val PropertyDescriptor.type: KotlinType[MyPropertyDescriptor]

'property' @ [86:44] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.MoveToConstructorParameters.configureChangeSignature[ValueParameterDescriptorImpl]

'valOrVarKeyword' @ [86:53] ==> public final val KtProperty.valOrVarKeyword: PsiElement[MyPropertyDescriptor]

'toValVar' @ [86:69] ==> public fun PsiElement?.toValVar(): KotlinValVar defined in org.jetbrains.kotlin.idea.refactoring.changeSignature in file KotlinValVar.kt[SimpleFunctionDescriptorImpl]

'property' @ [87:48] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.MoveToConstructorParameters.configureChangeSignature[ValueParameterDescriptorImpl]

'modifierList' @ [87:57] ==> public final val KtProperty.modifierList: KtModifierList?[MyPropertyDescriptor]

'KtPsiFactory' @ [88:55] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'property' @ [88:68] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.MoveToConstructorParameters.configureChangeSignature[ValueParameterDescriptorImpl]

'project' @ [88:77] ==> public final val KtProperty.project: Project[MyPropertyDescriptor]

'createExpression' @ [88:86] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'initializerText' @ [88:103] ==> val initializerText: String defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.MoveToConstructorParameters.configureChangeSignature.<no name provided>.configure.<anonymous>[LocalVariableDescriptor]

'it' @ [90:25] ==> value-parameter it: KotlinMutableMethodDescriptor defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.MoveToConstructorParameters.configureChangeSignature.<no name provided>.configure.<anonymous>[ValueParameterDescriptorImpl]

'addParameter' @ [90:28] ==> public final fun addParameter(parameter: KotlinParameterInfo): Unit defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinMutableMethodDescriptor[SimpleFunctionDescriptorImpl]

'newParam' @ [90:41] ==> val newParam: KotlinParameterInfo defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.MoveToConstructorParameters.configureChangeSignature.<no name provided>.configure.<anonymous>[LocalVariableDescriptor]

'noUsagesExist' @ [94:91] ==> private final fun noUsagesExist(affectedFunctions: Collection<PsiElement>): Boolean defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory[SimpleFunctionDescriptorImpl]

'affectedFunctions' @ [94:105] ==> value-parameter affectedFunctions: Collection<PsiElement> defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.MoveToConstructorParameters.configureChangeSignature.<no name provided>.performSilently[ValueParameterDescriptorImpl]

'element' @ [99:27] ==> protected final val element: KtProperty? defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.MoveToConstructorParameters[PropertyDescriptorImpl]

'element' @ [100:25] ==> val element: KtProperty defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.MoveToConstructorParameters.invoke[LocalVariableDescriptor]

'containingClassOrObject' @ [100:33] ==> public val KtDeclaration.containingClassOrObject: KtClassOrObject? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'element' @ [101:38] ==> val element: KtProperty defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.MoveToConstructorParameters.invoke[LocalVariableDescriptor]

'resolveToDescriptorIfAny' @ [101:46] ==> public fun KtDeclaration.resolveToDescriptorIfAny(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'canStart' @ [103:29] ==> public open fun canStart(p0: (Project..Project?)): (StartMarkAction..StartMarkAction?) defined in com.intellij.openapi.command.impl.StartMarkAction[JavaMethodDescriptor]

'project' @ [103:38] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.MoveToConstructorParameters.invoke[ValueParameterDescriptorImpl]

'let' @ [103:48] ==> @InlineOnly public inline fun <T, R> StartMarkAction.let(block: (StartMarkAction) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StartMarkAction
    <R> -> Nothing

'start' @ [104:51] ==> public open fun start(p0: (Editor..Editor?), p1: (Project..Project?), p2: (String..String?)): (StartMarkAction..StartMarkAction?) defined in com.intellij.openapi.command.impl.StartMarkAction[JavaMethodDescriptor]

'editor' @ [104:57] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.MoveToConstructorParameters.invoke[ValueParameterDescriptorImpl]

'project' @ [104:65] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.MoveToConstructorParameters.invoke[ValueParameterDescriptorImpl]

'text' @ [104:74] ==> public final val InitializePropertyQuickFixFactory.MoveToConstructorParameters.text: String[MyPropertyDescriptor]

'KtPsiFactory' @ [107:41] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [107:54] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.MoveToConstructorParameters.invoke[ValueParameterDescriptorImpl]

'createParameter' @ [107:63] ==> public final fun createParameter(text: String): KtParameter defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'element' @ [107:79] ==> val element: KtProperty defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.MoveToConstructorParameters.invoke[LocalVariableDescriptor]

'text' @ [107:87] ==> public final val KtProperty.text: (String..String?)[MyPropertyDescriptor]

'runWriteAction' @ [108:17] ==> public fun <T> runWriteAction(action: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'element' @ [108:34] ==> val element: KtProperty defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.MoveToConstructorParameters.invoke[LocalVariableDescriptor]

'delete' @ [108:42] ==> public open fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtProperty[JavaMethodDescriptor]

'klass' @ [110:39] ==> val klass: KtClassOrObject defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.MoveToConstructorParameters.invoke[LocalVariableDescriptor]

'resolveToDescriptorIfAny' @ [110:45] ==> public fun KtDeclaration.resolveToDescriptorIfAny(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'classDescriptor' @ [111:45] ==> val classDescriptor: ClassDescriptorWithResolutionScopes defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.MoveToConstructorParameters.invoke[LocalVariableDescriptor]

'unsubstitutedPrimaryConstructor' @ [111:61] ==> public final val ClassDescriptorWithResolutionScopes.unsubstitutedPrimaryConstructor: ClassConstructorDescriptor?[MyPropertyDescriptor]

'constructorDescriptor' @ [112:38] ==> val constructorDescriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.MoveToConstructorParameters.invoke[LocalVariableDescriptor]

'source' @ [112:60] ==> public final val ClassConstructorDescriptor.source: SourceElement[MyPropertyDescriptor]

'getPsi' @ [112:67] ==> public fun SourceElement.getPsi(): PsiElement? defined in org.jetbrains.kotlin.resolve.source[DeserializedSimpleFunctionDescriptor]

'contextElement' @ [113:42] ==> val contextElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.MoveToConstructorParameters.invoke[LocalVariableDescriptor]

'createSmartPointer' @ [113:57] ==> public fun <E : PsiElement> PsiElement.createSmartPointer(): SmartPsiElementPointer<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <E : PsiElement> -> PsiElement

'configureChangeSignature' @ [114:30] ==> private final fun configureChangeSignature(property: KtProperty, propertyDescriptor: PropertyDescriptor): KotlinChangeSignatureConfiguration defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.MoveToConstructorParameters[SimpleFunctionDescriptorImpl]

'element' @ [114:55] ==> val element: KtProperty defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.MoveToConstructorParameters.invoke[LocalVariableDescriptor]

'propertyDescriptor' @ [114:64] ==> val propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.MoveToConstructorParameters.invoke[LocalVariableDescriptor]

'runChangeSignature' @ [115:41] ==> public fun runChangeSignature(project: Project, callableDescriptor: CallableDescriptor, configuration: KotlinChangeSignatureConfiguration, defaultValueContext: PsiElement, commandName: String? = ...): Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature in file KotlinChangeSignature.kt[SimpleFunctionDescriptorImpl]

'project' @ [115:60] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.MoveToConstructorParameters.invoke[ValueParameterDescriptorImpl]

'constructorDescriptor' @ [115:69] ==> val constructorDescriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.MoveToConstructorParameters.invoke[LocalVariableDescriptor]

'config' @ [115:92] ==> val config: KotlinChangeSignatureConfiguration defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.MoveToConstructorParameters.invoke[LocalVariableDescriptor]

'contextElement' @ [115:100] ==> val contextElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.MoveToConstructorParameters.invoke[LocalVariableDescriptor]

'text' @ [115:116] ==> public final val InitializePropertyQuickFixFactory.MoveToConstructorParameters.text: String[MyPropertyDescriptor]

'changeSignature' @ [116:17] ==> val changeSignature: () -> Boolean defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.MoveToConstructorParameters.invoke[LocalVariableDescriptor]

'runRefactoringWithPostprocessing' @ [116:33] ==> public fun (() -> Any).runRefactoringWithPostprocessing(project: Project, targetRefactoringId: String, finishAction: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'project' @ [116:66] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.MoveToConstructorParameters.invoke[ValueParameterDescriptorImpl]

'constructorPointer' @ [117:46] ==> val constructorPointer: SmartPsiElementPointer<PsiElement> defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.MoveToConstructorParameters.invoke[LocalVariableDescriptor]

'element' @ [117:65] ==> public final val <E : (PsiElement..PsiElement?)> SmartPsiElementPointer<PsiElement>.element: PsiElement?[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> PsiElement

'constructorOrClass' @ [118:39] ==> val constructorOrClass: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.MoveToConstructorParameters.invoke.<anonymous>[LocalVariableDescriptor]

'constructorOrClass' @ [118:83] ==> val constructorOrClass: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.MoveToConstructorParameters.invoke.<anonymous>[LocalVariableDescriptor]

'primaryConstructor' @ [118:116] ==> public final val KtClass.primaryConstructor: KtPrimaryConstructor?[MyPropertyDescriptor]

'constructor' @ [119:21] ==> val constructor: KtConstructor<*>? defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.MoveToConstructorParameters.invoke.<anonymous>[LocalVariableDescriptor]

'getValueParameters' @ [119:34] ==> public open fun getValueParameters(): (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>) defined in org.jetbrains.kotlin.psi.KtConstructor[DeserializedSimpleFunctionDescriptor]

'lastOrNull' @ [119:56] ==> public fun <T> List<(KtParameter..KtParameter?)>.lastOrNull(): KtParameter? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)

'replace' @ [119:70] ==> public open fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtParameter[JavaMethodDescriptor]

'parameterToInsert' @ [119:78] ==> val parameterToInsert: KtParameter defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.MoveToConstructorParameters.invoke[LocalVariableDescriptor]

'finish' @ [123:34] ==> public open fun finish(p0: (Project..Project?), p1: (Editor..Editor?), @Nullable p2: StartMarkAction?): Unit defined in com.intellij.openapi.command.impl.FinishMarkAction[JavaMethodDescriptor]

'project' @ [123:41] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.MoveToConstructorParameters.invoke[ValueParameterDescriptorImpl]

'editor' @ [123:50] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.MoveToConstructorParameters.invoke[ValueParameterDescriptorImpl]

'startMarkAction' @ [123:58] ==> val startMarkAction: (StartMarkAction..StartMarkAction?) defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.MoveToConstructorParameters.invoke[LocalVariableDescriptor]

'KotlinQuickFixAction<KtProperty>' @ [128:70] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtProperty) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtProperty

'property' @ [128:103] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.InitializeWithConstructorParameter.<init>[ValueParameterDescriptorImpl]

'text' @ [130:40] ==> public final val InitializePropertyQuickFixFactory.InitializeWithConstructorParameter.text: String[MyPropertyDescriptor]

'originalDescriptor' @ [137:28] ==> value-parameter originalDescriptor: KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.InitializeWithConstructorParameter.configureChangeSignature.<no name provided>.configure[ValueParameterDescriptorImpl]

'modify' @ [137:47] ==> public fun KotlinMethodDescriptor.modify(action: (KotlinMutableMethodDescriptor) -> Unit): KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature in file KotlinChangeSignature.kt[SimpleFunctionDescriptorImpl]

'propertyDescriptor' @ [138:47] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.InitializeWithConstructorParameter.configureChangeSignature[ValueParameterDescriptorImpl]

'containingDeclaration' @ [138:66] ==> public final val PropertyDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'classDescriptor' @ [139:48] ==> val classDescriptor: ClassDescriptorWithResolutionScopes defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.InitializeWithConstructorParameter.configureChangeSignature.<no name provided>.configure.<anonymous>[LocalVariableDescriptor]

'scopeForClassHeaderResolution' @ [139:64] ==> public final val ClassDescriptorWithResolutionScopes.scopeForClassHeaderResolution: LexicalScope[MyPropertyDescriptor]

'CollectingNameValidator' @ [140:41] ==> @JvmOverloads public constructor CollectingNameValidator(existingNames: Collection<String> = ..., filter: (String) -> Boolean = ...) defined in org.jetbrains.kotlin.idea.core.CollectingNameValidator[DeserializedClassConstructorDescriptor]

'originalDescriptor' @ [140:65] ==> value-parameter originalDescriptor: KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.InitializeWithConstructorParameter.configureChangeSignature.<no name provided>.configure[ValueParameterDescriptorImpl]

'parameters' @ [140:84] ==> public final val KotlinMethodDescriptor.parameters: (MutableList<(KotlinParameterInfo..KotlinParameterInfo?)>..List<(KotlinParameterInfo..KotlinParameterInfo?)>?)[MyPropertyDescriptor]

'map' @ [140:95] ==> public inline fun <T, R> Iterable<(KotlinParameterInfo..KotlinParameterInfo?)>.map(transform: ((KotlinParameterInfo..KotlinParameterInfo?)) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo..org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo?)
    <R> -> String

'it' @ [140:101] ==> value-parameter it: (KotlinParameterInfo..KotlinParameterInfo?) defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.InitializeWithConstructorParameter.configureChangeSignature.<no name provided>.configure.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [140:104] ==> public final var KotlinParameterInfo.name: String[MyPropertyDescriptor]

'constructorScope' @ [141:29] ==> val constructorScope: LexicalScope defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.InitializeWithConstructorParameter.configureChangeSignature.<no name provided>.configure.<anonymous>[LocalVariableDescriptor]

'getContributedDescriptors' @ [141:46] ==> public abstract fun getContributedDescriptors(kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.LexicalScope[DeserializedSimpleFunctionDescriptor]

'VARIABLES' @ [141:93] ==> @field:JvmField public final val VARIABLES: DescriptorKindFilter defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[DeserializedPropertyDescriptor]

'all' @ [141:104] ==> public inline fun <T> Iterable<DeclarationDescriptor>.all(predicate: (DeclarationDescriptor) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'it' @ [142:33] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.InitializeWithConstructorParameter.configureChangeSignature.<no name provided>.configure.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [142:62] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.InitializeWithConstructorParameter.configureChangeSignature.<no name provided>.configure.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [142:65] ==> public final val VariableDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [142:70] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'name' @ [142:84] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.InitializeWithConstructorParameter.configureChangeSignature.<no name provided>.configure.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'?:' @ [145:47] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: String?, right: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> String

'defaultInitializer' @ [145:64] ==> @Nullable public open fun defaultInitializer(type: (KotlinType..KotlinType?)): String? defined in org.jetbrains.kotlin.idea.codeInsight.CodeInsightUtils[JavaMethodDescriptor]

'propertyDescriptor' @ [145:83] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.InitializeWithConstructorParameter.configureChangeSignature[ValueParameterDescriptorImpl]

'type' @ [145:102] ==> public final val PropertyDescriptor.type: KotlinType[MyPropertyDescriptor]

'KotlinParameterInfo' @ [146:40] ==> @JvmOverloads public constructor KotlinParameterInfo(callableDescriptor: CallableDescriptor, originalIndex: Int = ..., name: String, originalTypeInfo: KotlinTypeInfo = ..., defaultValueForParameter: KtExpression? = ..., defaultValueForCall: KtExpression? = ..., valOrVar: KotlinValVar = ..., modifierList: KtModifierList? = ...) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[ClassConstructorDescriptorImpl]

'originalDescriptor' @ [147:54] ==> value-parameter originalDescriptor: KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.InitializeWithConstructorParameter.configureChangeSignature.<no name provided>.configure[ValueParameterDescriptorImpl]

'baseDescriptor' @ [147:73] ==> public abstract val baseDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinMethodDescriptor[PropertyDescriptorImpl]

'suggestNameByName' @ [148:60] ==> public final fun suggestNameByName(name: String, validator: (String) -> Boolean): String defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggester[DeserializedSimpleFunctionDescriptor]

'propertyDescriptor' @ [148:78] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.InitializeWithConstructorParameter.configureChangeSignature[ValueParameterDescriptorImpl]

'name' @ [148:97] ==> public final val PropertyDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [148:102] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'validator' @ [148:114] ==> val validator: CollectingNameValidator defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.InitializeWithConstructorParameter.configureChangeSignature.<no name provided>.configure.<anonymous>[LocalVariableDescriptor]

'KotlinTypeInfo' @ [149:52] ==> public constructor KotlinTypeInfo(isCovariant: Boolean, type: KotlinType? = ..., text: String? = ...) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinTypeInfo[ClassConstructorDescriptorImpl]

'propertyDescriptor' @ [149:74] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.InitializeWithConstructorParameter.configureChangeSignature[ValueParameterDescriptorImpl]

'type' @ [149:93] ==> public final val PropertyDescriptor.type: KotlinType[MyPropertyDescriptor]

'KtPsiFactory' @ [150:55] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'element' @ [150:68] ==> protected final val element: KtProperty? defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.InitializeWithConstructorParameter[PropertyDescriptorImpl]

'project' @ [150:78] ==> public final val KtProperty.project: Project[MyPropertyDescriptor]

'createExpression' @ [150:87] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'initializerText' @ [150:104] ==> val initializerText: String defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.InitializeWithConstructorParameter.configureChangeSignature.<no name provided>.configure.<anonymous>[LocalVariableDescriptor]

'it' @ [152:25] ==> value-parameter it: KotlinMutableMethodDescriptor defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.InitializeWithConstructorParameter.configureChangeSignature.<no name provided>.configure.<anonymous>[ValueParameterDescriptorImpl]

'addParameter' @ [152:28] ==> public final fun addParameter(parameter: KotlinParameterInfo): Unit defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinMutableMethodDescriptor[SimpleFunctionDescriptorImpl]

'newParam' @ [152:41] ==> val newParam: KotlinParameterInfo defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.InitializeWithConstructorParameter.configureChangeSignature.<no name provided>.configure.<anonymous>[LocalVariableDescriptor]

'noUsagesExist' @ [156:100] ==> private final fun noUsagesExist(affectedFunctions: Collection<PsiElement>): Boolean defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory[SimpleFunctionDescriptorImpl]

'affectedFunctions' @ [156:114] ==> value-parameter affectedFunctions: Collection<PsiElement> defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.InitializeWithConstructorParameter.configureChangeSignature.<no name provided>.performSilently[ValueParameterDescriptorImpl]

'HashSet' @ [165:59] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> PsiElement

'element' @ [167:27] ==> protected final val element: KtProperty? defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.InitializeWithConstructorParameter[PropertyDescriptorImpl]

'!' @ [169:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'descriptorsToProcess' @ [169:18] ==> value-parameter descriptorsToProcess: Iterator<ConstructorDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.InitializeWithConstructorParameter.processConstructors[ValueParameterDescriptorImpl]

'hasNext' @ [169:39] ==> public abstract operator fun hasNext(): Boolean defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'descriptorsToProcess' @ [170:30] ==> value-parameter descriptorsToProcess: Iterator<ConstructorDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.InitializeWithConstructorParameter.processConstructors[ValueParameterDescriptorImpl]

'next' @ [170:51] ==> public abstract operator fun next(): ConstructorDescriptor defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [171:38] ==> val descriptor: ConstructorDescriptor defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.InitializeWithConstructorParameter.processConstructors[LocalVariableDescriptor]

'source' @ [171:49] ==> public final val ConstructorDescriptor.source: SourceElement[MyPropertyDescriptor]

'getPsi' @ [171:56] ==> public fun SourceElement.getPsi(): PsiElement? defined in org.jetbrains.kotlin.resolve.source[DeserializedSimpleFunctionDescriptor]

'createSmartPointer' @ [171:66] ==> public fun <E : PsiElement> PsiElement.createSmartPointer(): SmartPsiElementPointer<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <E : PsiElement> -> PsiElement

'configureChangeSignature' @ [172:26] ==> private final fun configureChangeSignature(propertyDescriptor: PropertyDescriptor): KotlinChangeSignatureConfiguration defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.InitializeWithConstructorParameter[SimpleFunctionDescriptorImpl]

'propertyDescriptor' @ [172:51] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.InitializeWithConstructorParameter.processConstructors[ValueParameterDescriptorImpl]

'runChangeSignature' @ [173:37] ==> public fun runChangeSignature(project: Project, callableDescriptor: CallableDescriptor, configuration: KotlinChangeSignatureConfiguration, defaultValueContext: PsiElement, commandName: String? = ...): Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature in file KotlinChangeSignature.kt[SimpleFunctionDescriptorImpl]

'project' @ [173:56] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.InitializeWithConstructorParameter.processConstructors[ValueParameterDescriptorImpl]

'descriptor' @ [173:65] ==> val descriptor: ConstructorDescriptor defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.InitializeWithConstructorParameter.processConstructors[LocalVariableDescriptor]

'config' @ [173:77] ==> val config: KotlinChangeSignatureConfiguration defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.InitializeWithConstructorParameter.processConstructors[LocalVariableDescriptor]

'element' @ [173:85] ==> val element: KtProperty defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.InitializeWithConstructorParameter.processConstructors[LocalVariableDescriptor]

'containingClassOrObject' @ [173:93] ==> public val KtDeclaration.containingClassOrObject: KtClassOrObject? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'text' @ [173:120] ==> public final val InitializePropertyQuickFixFactory.InitializeWithConstructorParameter.text: String[MyPropertyDescriptor]

'changeSignature' @ [175:13] ==> val changeSignature: () -> Boolean defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.InitializeWithConstructorParameter.processConstructors[LocalVariableDescriptor]

'runRefactoringWithPostprocessing' @ [175:29] ==> public fun (() -> Any).runRefactoringWithPostprocessing(project: Project, targetRefactoringId: String, finishAction: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'project' @ [175:62] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.InitializeWithConstructorParameter.processConstructors[ValueParameterDescriptorImpl]

'constructorPointer' @ [176:42] ==> val constructorPointer: SmartPsiElementPointer<PsiElement>? defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.InitializeWithConstructorParameter.processConstructors[LocalVariableDescriptor]

'element' @ [176:62] ==> public final val <E : (PsiElement..PsiElement?)> SmartPsiElementPointer<PsiElement>.element: PsiElement?[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> PsiElement

'constructorOrClass' @ [177:35] ==> val constructorOrClass: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.InitializeWithConstructorParameter.processConstructors.<anonymous>[LocalVariableDescriptor]

'constructorOrClass' @ [177:79] ==> val constructorOrClass: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.InitializeWithConstructorParameter.processConstructors.<anonymous>[LocalVariableDescriptor]

'primaryConstructor' @ [177:112] ==> public final val KtClass.primaryConstructor: KtPrimaryConstructor?[MyPropertyDescriptor]

'constructor' @ [178:21] ==> val constructor: KtConstructor<*>? defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.InitializeWithConstructorParameter.processConstructors.<anonymous>[LocalVariableDescriptor]

'!' @ [178:44] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'visitedElements' @ [178:45] ==> value-parameter visitedElements: MutableSet<PsiElement> = ... defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.InitializeWithConstructorParameter.processConstructors[ValueParameterDescriptorImpl]

'add' @ [178:61] ==> public abstract fun add(element: PsiElement): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'constructor' @ [178:65] ==> val constructor: KtConstructor<*>? defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.InitializeWithConstructorParameter.processConstructors.<anonymous>[LocalVariableDescriptor]

'constructor' @ [179:17] ==> val constructor: KtConstructor<*>? defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.InitializeWithConstructorParameter.processConstructors.<anonymous>[LocalVariableDescriptor]

'getValueParameters' @ [179:29] ==> public open fun getValueParameters(): (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>) defined in org.jetbrains.kotlin.psi.KtConstructor[DeserializedSimpleFunctionDescriptor]

'lastOrNull' @ [179:50] ==> public fun <T> List<(KtParameter..KtParameter?)>.lastOrNull(): KtParameter? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)

'let' @ [179:64] ==> @InlineOnly public inline fun <T, R> KtParameter.let(block: (KtParameter) -> KtElement?): KtElement? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtParameter
    <R> -> KtElement?

'KtPsiFactory' @ [180:38] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [180:51] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.InitializeWithConstructorParameter.processConstructors[ValueParameterDescriptorImpl]

'?:' @ [181:21] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtElement?, right: KtElement?): KtElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtElement?

'constructor' @ [181:22] ==> val constructor: KtConstructor<*>? defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.InitializeWithConstructorParameter.processConstructors.<anonymous>[LocalVariableDescriptor]

'getOrCreateBody' @ [181:63] ==> public fun KtSecondaryConstructor.getOrCreateBody(): KtBlockExpression defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'appendElement' @ [181:82] ==> public fun KtBlockExpression.appendElement(element: KtElement, addNewLine: Boolean = ...): KtElement defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'psiFactory' @ [182:29] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.InitializeWithConstructorParameter.processConstructors.<anonymous>.<anonymous>[LocalVariableDescriptor]

'createExpression' @ [182:40] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'element' @ [182:65] ==> val element: KtProperty defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.InitializeWithConstructorParameter.processConstructors[LocalVariableDescriptor]

'name' @ [182:73] ==> public final val KtProperty.name: String?[MyPropertyDescriptor]

'newParam' @ [182:83] ==> value-parameter newParam: KtParameter defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.InitializeWithConstructorParameter.processConstructors.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [182:92] ==> public final val KtParameter.name: String?[MyPropertyDescriptor]

'element' @ [183:26] ==> val element: KtProperty defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.InitializeWithConstructorParameter.processConstructors[LocalVariableDescriptor]

'setInitializer' @ [183:34] ==> @Nullable public open fun setInitializer(@Nullable p0: KtExpression?): KtExpression? defined in org.jetbrains.kotlin.psi.KtProperty[JavaMethodDescriptor]

'psiFactory' @ [183:49] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.InitializeWithConstructorParameter.processConstructors.<anonymous>.<anonymous>[LocalVariableDescriptor]

'createExpression' @ [183:60] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'newParam' @ [183:77] ==> value-parameter newParam: KtParameter defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.InitializeWithConstructorParameter.processConstructors.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [183:86] ==> public final val KtParameter.name: String?[MyPropertyDescriptor]

'processConstructors' @ [185:17] ==> private final fun processConstructors(project: Project, propertyDescriptor: PropertyDescriptor, descriptorsToProcess: Iterator<ConstructorDescriptor>, visitedElements: MutableSet<PsiElement> = ...): Unit defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.InitializeWithConstructorParameter[SimpleFunctionDescriptorImpl]

'project' @ [185:37] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.InitializeWithConstructorParameter.processConstructors[ValueParameterDescriptorImpl]

'propertyDescriptor' @ [185:46] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.InitializeWithConstructorParameter.processConstructors[ValueParameterDescriptorImpl]

'descriptorsToProcess' @ [185:66] ==> value-parameter descriptorsToProcess: Iterator<ConstructorDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.InitializeWithConstructorParameter.processConstructors[ValueParameterDescriptorImpl]

'element' @ [190:27] ==> protected final val element: KtProperty? defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.InitializeWithConstructorParameter[PropertyDescriptorImpl]

'element' @ [191:38] ==> val element: KtProperty defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.InitializeWithConstructorParameter.invoke[LocalVariableDescriptor]

'resolveToDescriptorIfAny' @ [191:46] ==> public fun KtDeclaration.resolveToDescriptorIfAny(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'propertyDescriptor' @ [192:35] ==> val propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.InitializeWithConstructorParameter.invoke[LocalVariableDescriptor]

'containingDeclaration' @ [192:54] ==> public final val PropertyDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'element' @ [193:25] ==> val element: KtProperty defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.InitializeWithConstructorParameter.invoke[LocalVariableDescriptor]

'containingClassOrObject' @ [193:33] ==> public val KtDeclaration.containingClassOrObject: KtClassOrObject? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'if (klass.hasExplicitPrimaryConstructor() || klass.secondaryConstructors.isEmpty()) {
                listOf(classDescriptor.unsubstitutedPrimaryConstructor!!)
            }
            else {
                classDescriptor.secondaryConstructors.filter {
                    val constructor = it.source.getPsi() as? KtSecondaryConstructor
                    constructor != null && !constructor.getDelegationCall().isCallToThis
                }
            }' @ [194:42] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<ClassConstructorDescriptor>, elseBranch: List<ClassConstructorDescriptor>): List<ClassConstructorDescriptor>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<ClassConstructorDescriptor>

'klass' @ [194:46] ==> val klass: KtClassOrObject defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.InitializeWithConstructorParameter.invoke[LocalVariableDescriptor]

'hasExplicitPrimaryConstructor' @ [194:52] ==> public open fun hasExplicitPrimaryConstructor(): Boolean defined in org.jetbrains.kotlin.psi.KtClassOrObject[DeserializedSimpleFunctionDescriptor]

'klass' @ [194:87] ==> val klass: KtClassOrObject defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.InitializeWithConstructorParameter.invoke[LocalVariableDescriptor]

'secondaryConstructors' @ [194:93] ==> public final val KtClassOrObject.secondaryConstructors: List<KtSecondaryConstructor>[MyPropertyDescriptor]

'isEmpty' @ [194:115] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'listOf' @ [195:17] ==> public fun <T> listOf(element: ClassConstructorDescriptor): List<ClassConstructorDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassConstructorDescriptor

'classDescriptor' @ [195:24] ==> val classDescriptor: ClassDescriptorWithResolutionScopes defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.InitializeWithConstructorParameter.invoke[LocalVariableDescriptor]

'unsubstitutedPrimaryConstructor' @ [195:40] ==> public final val ClassDescriptorWithResolutionScopes.unsubstitutedPrimaryConstructor: ClassConstructorDescriptor?[MyPropertyDescriptor]

'classDescriptor' @ [198:17] ==> val classDescriptor: ClassDescriptorWithResolutionScopes defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.InitializeWithConstructorParameter.invoke[LocalVariableDescriptor]

'secondaryConstructors' @ [198:33] ==> public val ClassDescriptor.secondaryConstructors: List<ClassConstructorDescriptor> defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'filter' @ [198:55] ==> public inline fun <T> Iterable<ClassConstructorDescriptor>.filter(predicate: (ClassConstructorDescriptor) -> Boolean): List<ClassConstructorDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassConstructorDescriptor

'it' @ [199:39] ==> value-parameter it: ClassConstructorDescriptor defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.InitializeWithConstructorParameter.invoke.<anonymous>[ValueParameterDescriptorImpl]

'source' @ [199:42] ==> public final val ClassConstructorDescriptor.source: SourceElement[MyPropertyDescriptor]

'getPsi' @ [199:49] ==> public fun SourceElement.getPsi(): PsiElement? defined in org.jetbrains.kotlin.resolve.source[DeserializedSimpleFunctionDescriptor]

'constructor' @ [200:21] ==> val constructor: KtSecondaryConstructor? defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.InitializeWithConstructorParameter.invoke.<anonymous>[LocalVariableDescriptor]

'!' @ [200:44] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'constructor' @ [200:45] ==> val constructor: KtSecondaryConstructor? defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.InitializeWithConstructorParameter.invoke.<anonymous>[LocalVariableDescriptor]

'getDelegationCall' @ [200:57] ==> public final fun getDelegationCall(): KtConstructorDelegationCall defined in org.jetbrains.kotlin.psi.KtSecondaryConstructor[DeserializedSimpleFunctionDescriptor]

'isCallToThis' @ [200:77] ==> public final val KtConstructorDelegationCall.isCallToThis: Boolean[MyPropertyDescriptor]

'project' @ [204:13] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.InitializeWithConstructorParameter.invoke[ValueParameterDescriptorImpl]

'runRefactoringAndKeepDelayedRequests' @ [204:21] ==> public fun Project.runRefactoringAndKeepDelayedRequests(action: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.codeInsight.shorten[DeserializedSimpleFunctionDescriptor]

'processConstructors' @ [205:17] ==> private final fun processConstructors(project: Project, propertyDescriptor: PropertyDescriptor, descriptorsToProcess: Iterator<ConstructorDescriptor>, visitedElements: MutableSet<PsiElement> = ...): Unit defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.InitializeWithConstructorParameter[SimpleFunctionDescriptorImpl]

'project' @ [205:37] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.InitializeWithConstructorParameter.invoke[ValueParameterDescriptorImpl]

'propertyDescriptor' @ [205:46] ==> val propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.InitializeWithConstructorParameter.invoke[LocalVariableDescriptor]

'constructorDescriptors' @ [205:66] ==> val constructorDescriptors: List<ClassConstructorDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.InitializeWithConstructorParameter.invoke[LocalVariableDescriptor]

'iterator' @ [205:89] ==> public abstract fun iterator(): Iterator<ClassConstructorDescriptor> defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'affectedFunctions' @ [211:16] ==> value-parameter affectedFunctions: Collection<PsiElement> defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.noUsagesExist[ValueParameterDescriptorImpl]

'flatMap' @ [211:34] ==> public inline fun <T, R> Iterable<PsiElement>.flatMap(transform: (PsiElement) -> Iterable<PsiMethod>): List<PsiMethod> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> PsiMethod

'it' @ [211:44] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.noUsagesExist.<anonymous>[ValueParameterDescriptorImpl]

'toLightMethods' @ [211:47] ==> public fun PsiElement.toLightMethods(): List<PsiMethod> defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'all' @ [211:66] ==> public inline fun <T> Iterable<PsiMethod>.all(predicate: (PsiMethod) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiMethod

'==' @ [211:72] ==> public open fun equals(other: Any?): Boolean defined in com.intellij.psi.PsiReference[DeserializedSimpleFunctionDescriptor]

'search' @ [211:95] ==> public open fun search(p0: (PsiMethod..PsiMethod?)): (Query<(PsiReference..PsiReference?)>..Query<(PsiReference..PsiReference?)>?) defined in com.intellij.psi.search.searches.MethodReferencesSearch[JavaMethodDescriptor]

'it' @ [211:102] ==> value-parameter it: PsiMethod defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.noUsagesExist.<anonymous>[ValueParameterDescriptorImpl]

'findFirst' @ [211:106] ==> @Nullable public abstract fun findFirst(): PsiReference? defined in com.intellij.util.Query[JavaMethodDescriptor]

'diagnostic' @ [215:24] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.doCreateActions[ValueParameterDescriptorImpl]

'psiElement' @ [215:35] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'emptyList' @ [215:71] ==> public fun <T> emptyList(): List<IntentionAction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IntentionAction

'property' @ [216:13] ==> val property: KtProperty defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.doCreateActions[LocalVariableDescriptor]

'receiverTypeReference' @ [216:22] ==> public final val KtProperty.receiverTypeReference: KtTypeReference?[MyPropertyDescriptor]

'emptyList' @ [216:60] ==> public fun <T> emptyList(): List<IntentionAction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IntentionAction

'ArrayList' @ [218:23] ==> public constructor ArrayList<E : (Any..Any?)>(p0: Int) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> IntentionAction

'actions' @ [220:9] ==> val actions: ArrayList<IntentionAction> defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.doCreateActions[LocalVariableDescriptor]

'add' @ [220:17] ==> public open fun add(element: IntentionAction): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'AddInitializerFix' @ [220:21] ==> public constructor AddInitializerFix(property: KtProperty) defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.AddInitializerFix[ClassConstructorDescriptorImpl]

'property' @ [220:39] ==> val property: KtProperty defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.doCreateActions[LocalVariableDescriptor]

'property' @ [222:10] ==> val property: KtProperty defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.doCreateActions[LocalVariableDescriptor]

'containingClassOrObject' @ [222:19] ==> public val KtDeclaration.containingClassOrObject: KtClassOrObject? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'let' @ [222:57] ==> @InlineOnly public inline fun <T, R> KtClass.let(block: (KtClass) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtClass
    <R> -> Unit

'klass' @ [223:17] ==> value-parameter klass: KtClass defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.doCreateActions.<anonymous>[ValueParameterDescriptorImpl]

'isAnnotation' @ [223:23] ==> public final fun isAnnotation(): Boolean defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'klass' @ [223:41] ==> value-parameter klass: KtClass defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.doCreateActions.<anonymous>[ValueParameterDescriptorImpl]

'isInterface' @ [223:47] ==> public final fun isInterface(): Boolean defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'if (property.accessors.isNotEmpty() || klass.secondaryConstructors.any { !it.getDelegationCall().isCallToThis }) {
                actions.add(InitializeWithConstructorParameter(property))
            }
            else {
                actions.add(MoveToConstructorParameters(property))
            }' @ [225:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'property' @ [225:17] ==> val property: KtProperty defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.doCreateActions[LocalVariableDescriptor]

'accessors' @ [225:26] ==> public final val KtProperty.accessors: (MutableList<(KtPropertyAccessor..KtPropertyAccessor?)>..List<(KtPropertyAccessor..KtPropertyAccessor?)>)[MyPropertyDescriptor]

'isNotEmpty' @ [225:36] ==> @InlineOnly public inline fun <T> Collection<(KtPropertyAccessor..KtPropertyAccessor?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtPropertyAccessor..org.jetbrains.kotlin.psi.KtPropertyAccessor?)

'klass' @ [225:52] ==> value-parameter klass: KtClass defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.doCreateActions.<anonymous>[ValueParameterDescriptorImpl]

'secondaryConstructors' @ [225:58] ==> public final val KtClass.secondaryConstructors: List<KtSecondaryConstructor>[MyPropertyDescriptor]

'any' @ [225:80] ==> public inline fun <T> Iterable<KtSecondaryConstructor>.any(predicate: (KtSecondaryConstructor) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtSecondaryConstructor

'!' @ [225:86] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [225:87] ==> value-parameter it: KtSecondaryConstructor defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.doCreateActions.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'getDelegationCall' @ [225:90] ==> public final fun getDelegationCall(): KtConstructorDelegationCall defined in org.jetbrains.kotlin.psi.KtSecondaryConstructor[DeserializedSimpleFunctionDescriptor]

'isCallToThis' @ [225:110] ==> public final val KtConstructorDelegationCall.isCallToThis: Boolean[MyPropertyDescriptor]

'actions' @ [226:17] ==> val actions: ArrayList<IntentionAction> defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.doCreateActions[LocalVariableDescriptor]

'add' @ [226:25] ==> public open fun add(element: IntentionAction): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'InitializeWithConstructorParameter' @ [226:29] ==> public constructor InitializeWithConstructorParameter(property: KtProperty) defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.InitializeWithConstructorParameter[ClassConstructorDescriptorImpl]

'property' @ [226:64] ==> val property: KtProperty defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.doCreateActions[LocalVariableDescriptor]

'actions' @ [229:17] ==> val actions: ArrayList<IntentionAction> defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.doCreateActions[LocalVariableDescriptor]

'add' @ [229:25] ==> public open fun add(element: IntentionAction): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'MoveToConstructorParameters' @ [229:29] ==> public constructor MoveToConstructorParameters(property: KtProperty) defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.MoveToConstructorParameters[ClassConstructorDescriptorImpl]

'property' @ [229:57] ==> val property: KtProperty defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.doCreateActions[LocalVariableDescriptor]

'actions' @ [233:16] ==> val actions: ArrayList<IntentionAction> defined in org.jetbrains.kotlin.idea.quickfix.InitializePropertyQuickFixFactory.doCreateActions[LocalVariableDescriptor]

