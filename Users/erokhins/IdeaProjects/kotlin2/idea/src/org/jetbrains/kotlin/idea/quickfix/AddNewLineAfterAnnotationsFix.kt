'KotlinQuickFixAction<KtAnnotatedExpression>' @ [27:71] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtAnnotatedExpression) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtAnnotatedExpression

'element' @ [27:115] ==> value-parameter element: KtAnnotatedExpression defined in org.jetbrains.kotlin.idea.quickfix.AddNewLineAfterAnnotationsFix.<init>[ValueParameterDescriptorImpl]

'text' @ [29:36] ==> public final val AddNewLineAfterAnnotationsFix.text: String[MyPropertyDescriptor]

'element' @ [32:23] ==> protected final val element: KtAnnotatedExpression? defined in org.jetbrains.kotlin.idea.quickfix.AddNewLineAfterAnnotationsFix[PropertyDescriptorImpl]

'element' @ [33:30] ==> val element: KtAnnotatedExpression defined in org.jetbrains.kotlin.idea.quickfix.AddNewLineAfterAnnotationsFix.invoke[LocalVariableDescriptor]

'baseExpression' @ [33:38] ==> public final val KtAnnotatedExpression.baseExpression: KtExpression?[MyPropertyDescriptor]

'element' @ [34:31] ==> val element: KtAnnotatedExpression defined in org.jetbrains.kotlin.idea.quickfix.AddNewLineAfterAnnotationsFix.invoke[LocalVariableDescriptor]

'text' @ [34:39] ==> public final val KtAnnotatedExpression.text: (String..String?)[MyPropertyDescriptor]

'substring' @ [34:44] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'baseExpression' @ [34:57] ==> val baseExpression: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.AddNewLineAfterAnnotationsFix.invoke[LocalVariableDescriptor]

'startOffsetInParent' @ [34:72] ==> public final val KtExpression.startOffsetInParent: Int[MyPropertyDescriptor]

'KtPsiFactory' @ [35:29] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [35:42] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.AddNewLineAfterAnnotationsFix.invoke[ValueParameterDescriptorImpl]

'createBlock' @ [35:51] ==> public final fun createBlock(bodyText: String): KtBlockExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'annotationsText' @ [35:63] ==> val annotationsText: String defined in org.jetbrains.kotlin.idea.quickfix.AddNewLineAfterAnnotationsFix.invoke[LocalVariableDescriptor]

'baseExpression' @ [35:88] ==> val baseExpression: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.AddNewLineAfterAnnotationsFix.invoke[LocalVariableDescriptor]

'text' @ [35:103] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'statements' @ [35:109] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'element' @ [36:9] ==> val element: KtAnnotatedExpression defined in org.jetbrains.kotlin.idea.quickfix.AddNewLineAfterAnnotationsFix.invoke[LocalVariableDescriptor]

'replace' @ [36:17] ==> public open fun replace(newElement: PsiElement): PsiElement defined in org.jetbrains.kotlin.psi.KtAnnotatedExpression[DeserializedSimpleFunctionDescriptor]

'newExpression' @ [36:25] ==> val newExpression: (KtExpression..KtExpression?) defined in org.jetbrains.kotlin.idea.quickfix.AddNewLineAfterAnnotationsFix.invoke[LocalVariableDescriptor]

'KotlinSingleIntentionActionFactory' @ [39:32] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'diagnostic' @ [41:17] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.AddNewLineAfterAnnotationsFix.Factory.createAction[ValueParameterDescriptorImpl]

'createIntentionForFirstParentOfType' @ [41:28] ==> public inline fun <reified T : PsiElement> Diagnostic.createIntentionForFirstParentOfType(factory: (KtAnnotatedExpression) -> KotlinQuickFixAction<KtAnnotatedExpression>?): KotlinQuickFixAction<KtAnnotatedExpression>? defined in org.jetbrains.kotlin.idea.quickfix.quickfixUtil[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : PsiElement> -> KtAnnotatedExpression

'AddNewLineAfterAnnotationsFix' @ [41:66] ==> public constructor AddNewLineAfterAnnotationsFix(element: KtAnnotatedExpression) defined in org.jetbrains.kotlin.idea.quickfix.AddNewLineAfterAnnotationsFix[ClassConstructorDescriptorImpl]

