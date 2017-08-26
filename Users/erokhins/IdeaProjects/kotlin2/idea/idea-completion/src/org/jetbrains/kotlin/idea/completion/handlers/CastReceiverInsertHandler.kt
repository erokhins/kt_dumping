'findElementOfClassAtOffset' @ [31:38] ==> @Nullable public open fun <T : (PsiElement..PsiElement?)> findElementOfClassAtOffset(@NotNull p0: PsiFile, p1: Int, @NotNull p2: Class<(KtSimpleNameExpression..KtSimpleNameExpression?)>, p3: Boolean): KtSimpleNameExpression? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> KtSimpleNameExpression

'context' @ [31:65] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.handlers.CastReceiverInsertHandler.postHandleInsert[ValueParameterDescriptorImpl]

'file' @ [31:73] ==> public final val InsertionContext.file: PsiFile[MyPropertyDescriptor]

'context' @ [31:79] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.handlers.CastReceiverInsertHandler.postHandleInsert[ValueParameterDescriptorImpl]

'startOffset' @ [31:87] ==> public final val InsertionContext.startOffset: Int[MyPropertyDescriptor]

'java' @ [31:130] ==> public val <T> KClass<KtSimpleNameExpression>.java: Class<KtSimpleNameExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtSimpleNameExpression

'getParentOfType' @ [32:47] ==> @Nullable @Contract public open fun <T : (PsiElement..PsiElement?)> getParentOfType(@Nullable p0: PsiElement?, @NotNull p1: Class<(KtQualifiedExpression..KtQualifiedExpression?)>, p2: Boolean): KtQualifiedExpression? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> KtQualifiedExpression

'expression' @ [32:63] ==> val expression: KtSimpleNameExpression? defined in org.jetbrains.kotlin.idea.completion.handlers.CastReceiverInsertHandler.postHandleInsert[LocalVariableDescriptor]

'java' @ [32:104] ==> public val <T> KClass<KtQualifiedExpression>.java: Class<KtQualifiedExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtQualifiedExpression

'qualifiedExpression' @ [33:13] ==> val qualifiedExpression: KtQualifiedExpression? defined in org.jetbrains.kotlin.idea.completion.handlers.CastReceiverInsertHandler.postHandleInsert[LocalVariableDescriptor]

'qualifiedExpression' @ [34:28] ==> val qualifiedExpression: KtQualifiedExpression? defined in org.jetbrains.kotlin.idea.completion.handlers.CastReceiverInsertHandler.postHandleInsert[LocalVariableDescriptor]

'receiverExpression' @ [34:48] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[DeserializedPropertyDescriptor]

'item' @ [36:31] ==> value-parameter item: LookupElement defined in org.jetbrains.kotlin.idea.completion.handlers.CastReceiverInsertHandler.postHandleInsert[ValueParameterDescriptorImpl]

'`object`' @ [36:36] ==> public final val LookupElement.`object`: Any[MyPropertyDescriptor]

'descriptor' @ [36:75] ==> public abstract val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.core.completion.DeclarationLookupObject[DeserializedPropertyDescriptor]

'context' @ [37:27] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.handlers.CastReceiverInsertHandler.postHandleInsert[ValueParameterDescriptorImpl]

'project' @ [37:35] ==> public final val InsertionContext.project: (Project..Project?)[MyPropertyDescriptor]

'if (descriptor.extensionReceiverParameter != null) descriptor.extensionReceiverParameter else descriptor.dispatchReceiverParameter' @ [39:27] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ReceiverParameterDescriptor?, elseBranch: ReceiverParameterDescriptor?): ReceiverParameterDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ReceiverParameterDescriptor?

'descriptor' @ [39:31] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.completion.handlers.CastReceiverInsertHandler.postHandleInsert[LocalVariableDescriptor]

'extensionReceiverParameter' @ [39:42] ==> public final val CallableDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'descriptor' @ [39:78] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.completion.handlers.CastReceiverInsertHandler.postHandleInsert[LocalVariableDescriptor]

'extensionReceiverParameter' @ [39:89] ==> public final val CallableDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'descriptor' @ [39:121] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.completion.handlers.CastReceiverInsertHandler.postHandleInsert[LocalVariableDescriptor]

'dispatchReceiverParameter' @ [39:132] ==> public final val CallableDescriptor.dispatchReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'IdeDescriptorRenderers' @ [40:26] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE' @ [40:49] ==> @field:JvmField public final val SOURCE_CODE: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderClassifierName' @ [40:61] ==> public abstract fun renderClassifierName(klass: ClassifierDescriptor): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'thisObj' @ [40:82] ==> val thisObj: ReceiverParameterDescriptor? defined in org.jetbrains.kotlin.idea.completion.handlers.CastReceiverInsertHandler.postHandleInsert[LocalVariableDescriptor]

'type' @ [40:92] ==> public final val ReceiverParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'constructor' @ [40:97] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [40:109] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'KtPsiFactory' @ [42:30] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [42:43] ==> val project: (Project..Project?) defined in org.jetbrains.kotlin.idea.completion.handlers.CastReceiverInsertHandler.postHandleInsert[LocalVariableDescriptor]

'createExpression' @ [42:52] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'fqName' @ [42:80] ==> val fqName: String defined in org.jetbrains.kotlin.idea.completion.handlers.CastReceiverInsertHandler.postHandleInsert[LocalVariableDescriptor]

'parentCast' @ [43:24] ==> val parentCast: KtParenthesizedExpression defined in org.jetbrains.kotlin.idea.completion.handlers.CastReceiverInsertHandler.postHandleInsert[LocalVariableDescriptor]

'expression' @ [43:35] ==> public final val KtParenthesizedExpression.expression: KtExpression?[MyPropertyDescriptor]

'cast' @ [44:13] ==> val cast: KtBinaryExpressionWithTypeRHS defined in org.jetbrains.kotlin.idea.completion.handlers.CastReceiverInsertHandler.postHandleInsert[LocalVariableDescriptor]

'left' @ [44:18] ==> public final val KtBinaryExpressionWithTypeRHS.left: KtExpression[MyPropertyDescriptor]

'replace' @ [44:23] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'receiver' @ [44:31] ==> val receiver: KtExpression defined in org.jetbrains.kotlin.idea.completion.handlers.CastReceiverInsertHandler.postHandleInsert[LocalVariableDescriptor]

'getInstance' @ [46:57] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'project' @ [46:69] ==> val project: (Project..Project?) defined in org.jetbrains.kotlin.idea.completion.handlers.CastReceiverInsertHandler.postHandleInsert[LocalVariableDescriptor]

'psiDocumentManager' @ [47:13] ==> val psiDocumentManager: (PsiDocumentManager..PsiDocumentManager?) defined in org.jetbrains.kotlin.idea.completion.handlers.CastReceiverInsertHandler.postHandleInsert[LocalVariableDescriptor]

'commitAllDocuments' @ [47:32] ==> public abstract fun commitAllDocuments(): Unit defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'psiDocumentManager' @ [48:13] ==> val psiDocumentManager: (PsiDocumentManager..PsiDocumentManager?) defined in org.jetbrains.kotlin.idea.completion.handlers.CastReceiverInsertHandler.postHandleInsert[LocalVariableDescriptor]

'doPostponedOperationsAndUnblockDocument' @ [48:32] ==> public abstract fun doPostponedOperationsAndUnblockDocument(@NotNull p0: Document): Unit defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'context' @ [48:72] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.handlers.CastReceiverInsertHandler.postHandleInsert[ValueParameterDescriptorImpl]

'document' @ [48:80] ==> public final val InsertionContext.document: Document[MyPropertyDescriptor]

'receiver' @ [50:24] ==> val receiver: KtExpression defined in org.jetbrains.kotlin.idea.completion.handlers.CastReceiverInsertHandler.postHandleInsert[LocalVariableDescriptor]

'replace' @ [50:33] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'parentCast' @ [50:41] ==> val parentCast: KtParenthesizedExpression defined in org.jetbrains.kotlin.idea.completion.handlers.CastReceiverInsertHandler.postHandleInsert[LocalVariableDescriptor]

'ShortenReferences' @ [52:13] ==> public companion object defined in org.jetbrains.kotlin.idea.core.ShortenReferences[FakeCallableDescriptorForObject]

'DEFAULT' @ [52:31] ==> @field:JvmField public final val DEFAULT: ShortenReferences defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Companion[DeserializedPropertyDescriptor]

'process' @ [52:39] ==> @JvmOverloads public final fun process(element: KtElement, elementFilter: (PsiElement) -> ShortenReferences.FilterResult = ...): KtElement defined in org.jetbrains.kotlin.idea.core.ShortenReferences[DeserializedSimpleFunctionDescriptor]

'!!' @ [52:47] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: KtTypeReference?): KtTypeReference[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> KtTypeReference

'expr' @ [52:48] ==> val expr: KtParenthesizedExpression defined in org.jetbrains.kotlin.idea.completion.handlers.CastReceiverInsertHandler.postHandleInsert[LocalVariableDescriptor]

'expression' @ [52:53] ==> public final val KtParenthesizedExpression.expression: KtExpression?[MyPropertyDescriptor]

'right' @ [52:98] ==> public final val KtBinaryExpressionWithTypeRHS.right: KtTypeReference?[MyPropertyDescriptor]

