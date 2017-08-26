'HashSet' @ [48:33] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Int

'elements' @ [50:25] ==> value-parameter elements: MutableList<PsiElement> defined in org.jetbrains.kotlin.idea.highlighter.KotlinRecursiveCallLineMarkerProvider.collectSlowLineMarkers[ValueParameterDescriptorImpl]

'checkCanceled' @ [51:29] ==> public open fun checkCanceled(): Unit defined in com.intellij.openapi.progress.ProgressManager[JavaMethodDescriptor]

'element' @ [52:17] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.KotlinRecursiveCallLineMarkerProvider.collectSlowLineMarkers[LocalVariableDescriptor]

'element' @ [53:34] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.KotlinRecursiveCallLineMarkerProvider.collectSlowLineMarkers[LocalVariableDescriptor]

'getLineNumber' @ [53:42] ==> private fun PsiElement.getLineNumber(): Int defined in org.jetbrains.kotlin.idea.highlighter in file KotlinRecursiveCallLineMarkerProvider.kt[SimpleFunctionDescriptorImpl]

'lineNumber' @ [54:21] ==> val lineNumber: Int defined in org.jetbrains.kotlin.idea.highlighter.KotlinRecursiveCallLineMarkerProvider.collectSlowLineMarkers[LocalVariableDescriptor]

'markedLineNumbers' @ [54:36] ==> val markedLineNumbers: HashSet<Int> defined in org.jetbrains.kotlin.idea.highlighter.KotlinRecursiveCallLineMarkerProvider.collectSlowLineMarkers[LocalVariableDescriptor]

'isRecursiveCall' @ [54:57] ==> private final fun isRecursiveCall(element: KtElement): Boolean defined in org.jetbrains.kotlin.idea.highlighter.KotlinRecursiveCallLineMarkerProvider[SimpleFunctionDescriptorImpl]

'element' @ [54:73] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.KotlinRecursiveCallLineMarkerProvider.collectSlowLineMarkers[LocalVariableDescriptor]

'markedLineNumbers' @ [55:21] ==> val markedLineNumbers: HashSet<Int> defined in org.jetbrains.kotlin.idea.highlighter.KotlinRecursiveCallLineMarkerProvider.collectSlowLineMarkers[LocalVariableDescriptor]

'add' @ [55:39] ==> public open fun add(element: Int): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'lineNumber' @ [55:43] ==> val lineNumber: Int defined in org.jetbrains.kotlin.idea.highlighter.KotlinRecursiveCallLineMarkerProvider.collectSlowLineMarkers[LocalVariableDescriptor]

'result' @ [56:21] ==> value-parameter result: MutableCollection<LineMarkerInfo<*>> defined in org.jetbrains.kotlin.idea.highlighter.KotlinRecursiveCallLineMarkerProvider.collectSlowLineMarkers[ValueParameterDescriptorImpl]

'add' @ [56:28] ==> public abstract fun add(element: LineMarkerInfo<*>): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'RecursiveMethodCallMarkerInfo' @ [56:32] ==> public constructor RecursiveMethodCallMarkerInfo(callElement: KtElement) defined in org.jetbrains.kotlin.idea.highlighter.KotlinRecursiveCallLineMarkerProvider.RecursiveMethodCallMarkerInfo[ClassConstructorDescriptorImpl]

'element' @ [56:62] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.KotlinRecursiveCallLineMarkerProvider.collectSlowLineMarkers[LocalVariableDescriptor]

'element' @ [63:24] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.highlighter.KotlinRecursiveCallLineMarkerProvider.getEnclosingFunction[ValueParameterDescriptorImpl]

'parents' @ [63:32] ==> public val PsiElement.parents: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'when (parent) {
                is KtFunctionLiteral -> if (stopOnNonInlinedLambdas && !InlineUtil.isInlinedArgument(parent, parent.analyze(), false)) return null
                is KtNamedFunction -> {
                    when (parent.parent) {
                        is KtBlockExpression, is KtClassBody, is KtFile, is KtScript -> return parent
                        else -> if (stopOnNonInlinedLambdas && !InlineUtil.isInlinedArgument(parent, parent.analyze(), false)) return null
                    }
                }
                is KtClassOrObject -> return null
            }' @ [64:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'parent' @ [64:19] ==> val parent: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.KotlinRecursiveCallLineMarkerProvider.getEnclosingFunction[LocalVariableDescriptor]

'stopOnNonInlinedLambdas' @ [65:45] ==> value-parameter stopOnNonInlinedLambdas: Boolean defined in org.jetbrains.kotlin.idea.highlighter.KotlinRecursiveCallLineMarkerProvider.getEnclosingFunction[ValueParameterDescriptorImpl]

'!' @ [65:72] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isInlinedArgument' @ [65:84] ==> public open fun isInlinedArgument(@NotNull p0: KtFunction, @NotNull p1: BindingContext, p2: Boolean): Boolean defined in org.jetbrains.kotlin.resolve.inline.InlineUtil[JavaMethodDescriptor]

'parent' @ [65:102] ==> val parent: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.KotlinRecursiveCallLineMarkerProvider.getEnclosingFunction[LocalVariableDescriptor]

'parent' @ [65:110] ==> val parent: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.KotlinRecursiveCallLineMarkerProvider.getEnclosingFunction[LocalVariableDescriptor]

'analyze' @ [65:117] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'when (parent.parent) {
                        is KtBlockExpression, is KtClassBody, is KtFile, is KtScript -> return parent
                        else -> if (stopOnNonInlinedLambdas && !InlineUtil.isInlinedArgument(parent, parent.analyze(), false)) return null
                    }' @ [67:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'parent' @ [67:27] ==> val parent: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.KotlinRecursiveCallLineMarkerProvider.getEnclosingFunction[LocalVariableDescriptor]

'parent' @ [67:34] ==> public final val KtNamedFunction.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [68:96] ==> val parent: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.KotlinRecursiveCallLineMarkerProvider.getEnclosingFunction[LocalVariableDescriptor]

'stopOnNonInlinedLambdas' @ [69:37] ==> value-parameter stopOnNonInlinedLambdas: Boolean defined in org.jetbrains.kotlin.idea.highlighter.KotlinRecursiveCallLineMarkerProvider.getEnclosingFunction[ValueParameterDescriptorImpl]

'!' @ [69:64] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isInlinedArgument' @ [69:76] ==> public open fun isInlinedArgument(@NotNull p0: KtFunction, @NotNull p1: BindingContext, p2: Boolean): Boolean defined in org.jetbrains.kotlin.resolve.inline.InlineUtil[JavaMethodDescriptor]

'parent' @ [69:94] ==> val parent: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.KotlinRecursiveCallLineMarkerProvider.getEnclosingFunction[LocalVariableDescriptor]

'parent' @ [69:102] ==> val parent: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.KotlinRecursiveCallLineMarkerProvider.getEnclosingFunction[LocalVariableDescriptor]

'analyze' @ [69:109] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'RecursivePropertyAccessorInspection' @ [79:13] ==> public companion object defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection[FakeCallableDescriptorForObject]

'isRecursivePropertyAccess' @ [79:49] ==> public final fun isRecursivePropertyAccess(element: KtElement): Boolean defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.Companion[SimpleFunctionDescriptorImpl]

'element' @ [79:75] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.highlighter.KotlinRecursiveCallLineMarkerProvider.isRecursiveCall[ValueParameterDescriptorImpl]

'RecursivePropertyAccessorInspection' @ [80:13] ==> public companion object defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection[FakeCallableDescriptorForObject]

'isRecursiveSyntheticPropertyAccess' @ [80:49] ==> public final fun isRecursiveSyntheticPropertyAccess(element: KtElement): Boolean defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.Companion[SimpleFunctionDescriptorImpl]

'element' @ [80:84] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.highlighter.KotlinRecursiveCallLineMarkerProvider.isRecursiveCall[ValueParameterDescriptorImpl]

'getCallNameFromPsi' @ [82:27] ==> private fun getCallNameFromPsi(element: KtElement): Name? defined in org.jetbrains.kotlin.idea.highlighter in file KotlinRecursiveCallLineMarkerProvider.kt[SimpleFunctionDescriptorImpl]

'element' @ [82:46] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.highlighter.KotlinRecursiveCallLineMarkerProvider.isRecursiveCall[ValueParameterDescriptorImpl]

'getEnclosingFunction' @ [83:33] ==> private final fun getEnclosingFunction(element: KtElement, stopOnNonInlinedLambdas: Boolean): KtNamedFunction? defined in org.jetbrains.kotlin.idea.highlighter.KotlinRecursiveCallLineMarkerProvider[SimpleFunctionDescriptorImpl]

'element' @ [83:54] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.highlighter.KotlinRecursiveCallLineMarkerProvider.isRecursiveCall[ValueParameterDescriptorImpl]

'enclosingFunction' @ [85:13] ==> val enclosingFunction: KtNamedFunction defined in org.jetbrains.kotlin.idea.highlighter.KotlinRecursiveCallLineMarkerProvider.isRecursiveCall[LocalVariableDescriptor]

'name' @ [85:31] ==> public final val KtNamedFunction.name: String?[MyPropertyDescriptor]

'resolveName' @ [85:39] ==> val resolveName: Name defined in org.jetbrains.kotlin.idea.highlighter.KotlinRecursiveCallLineMarkerProvider.isRecursiveCall[LocalVariableDescriptor]

'asString' @ [85:51] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'enclosingFunction' @ [88:13] ==> val enclosingFunction: KtNamedFunction defined in org.jetbrains.kotlin.idea.highlighter.KotlinRecursiveCallLineMarkerProvider.isRecursiveCall[LocalVariableDescriptor]

'getEnclosingFunction' @ [88:34] ==> private final fun getEnclosingFunction(element: KtElement, stopOnNonInlinedLambdas: Boolean): KtNamedFunction? defined in org.jetbrains.kotlin.idea.highlighter.KotlinRecursiveCallLineMarkerProvider[SimpleFunctionDescriptorImpl]

'element' @ [88:55] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.highlighter.KotlinRecursiveCallLineMarkerProvider.isRecursiveCall[ValueParameterDescriptorImpl]

'element' @ [90:30] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.highlighter.KotlinRecursiveCallLineMarkerProvider.isRecursiveCall[ValueParameterDescriptorImpl]

'analyze' @ [90:38] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [91:43] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.highlighter.KotlinRecursiveCallLineMarkerProvider.isRecursiveCall[LocalVariableDescriptor]

'FUNCTION' @ [91:73] ==> public final val FUNCTION: (WritableSlice<(PsiElement..PsiElement?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'enclosingFunction' @ [91:83] ==> val enclosingFunction: KtNamedFunction defined in org.jetbrains.kotlin.idea.highlighter.KotlinRecursiveCallLineMarkerProvider.isRecursiveCall[LocalVariableDescriptor]

'bindingContext' @ [93:20] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.highlighter.KotlinRecursiveCallLineMarkerProvider.isRecursiveCall[LocalVariableDescriptor]

'CALL' @ [93:50] ==> public final val CALL: (WritableSlice<(KtElement..KtElement?), (Call..Call?)>..WritableSlice<(KtElement..KtElement?), (Call..Call?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'element' @ [93:56] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.highlighter.KotlinRecursiveCallLineMarkerProvider.isRecursiveCall[ValueParameterDescriptorImpl]

'bindingContext' @ [94:28] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.highlighter.KotlinRecursiveCallLineMarkerProvider.isRecursiveCall[LocalVariableDescriptor]

'RESOLVED_CALL' @ [94:58] ==> public final val RESOLVED_CALL: (WritableSlice<(Call..Call?), (ResolvedCall<*>..ResolvedCall<*>?)>..WritableSlice<(Call..Call?), (ResolvedCall<*>..ResolvedCall<*>?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'call' @ [94:73] ==> val call: Call defined in org.jetbrains.kotlin.idea.highlighter.KotlinRecursiveCallLineMarkerProvider.isRecursiveCall[LocalVariableDescriptor]

'resolvedCall' @ [96:13] ==> val resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.idea.highlighter.KotlinRecursiveCallLineMarkerProvider.isRecursiveCall[LocalVariableDescriptor]

'candidateDescriptor' @ [96:26] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.candidateDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'original' @ [96:46] ==> public final val CallableDescriptor.original: CallableDescriptor[MyPropertyDescriptor]

'enclosingFunctionDescriptor' @ [96:58] ==> val enclosingFunctionDescriptor: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.idea.highlighter.KotlinRecursiveCallLineMarkerProvider.isRecursiveCall[LocalVariableDescriptor]

'receiver' @ [99:17] ==> value-parameter receiver: Receiver? defined in org.jetbrains.kotlin.idea.highlighter.KotlinRecursiveCallLineMarkerProvider.isRecursiveCall.isDifferentReceiver[ValueParameterDescriptorImpl]

'receiver' @ [101:33] ==> value-parameter receiver: Receiver? defined in org.jetbrains.kotlin.idea.highlighter.KotlinRecursiveCallLineMarkerProvider.isRecursiveCall.isDifferentReceiver[ValueParameterDescriptorImpl]

'getThisReceiverOwner' @ [101:42] ==> public fun ReceiverValue?.getThisReceiverOwner(bindingContext: BindingContext): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [101:63] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.highlighter.KotlinRecursiveCallLineMarkerProvider.isRecursiveCall[LocalVariableDescriptor]

'when (receiverOwner) {
                is SimpleFunctionDescriptor -> receiverOwner != enclosingFunctionDescriptor
                is ClassDescriptor -> receiverOwner != enclosingFunctionDescriptor.containingDeclaration
                else -> throw IllegalStateException("Unexpected receiver owner: $receiverOwner")
            }' @ [103:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'receiverOwner' @ [103:26] ==> val receiverOwner: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.highlighter.KotlinRecursiveCallLineMarkerProvider.isRecursiveCall.isDifferentReceiver[LocalVariableDescriptor]

'receiverOwner' @ [104:48] ==> val receiverOwner: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.highlighter.KotlinRecursiveCallLineMarkerProvider.isRecursiveCall.isDifferentReceiver[LocalVariableDescriptor]

'enclosingFunctionDescriptor' @ [104:65] ==> val enclosingFunctionDescriptor: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.idea.highlighter.KotlinRecursiveCallLineMarkerProvider.isRecursiveCall[LocalVariableDescriptor]

'receiverOwner' @ [105:39] ==> val receiverOwner: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.highlighter.KotlinRecursiveCallLineMarkerProvider.isRecursiveCall.isDifferentReceiver[LocalVariableDescriptor]

'enclosingFunctionDescriptor' @ [105:56] ==> val enclosingFunctionDescriptor: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.idea.highlighter.KotlinRecursiveCallLineMarkerProvider.isRecursiveCall[LocalVariableDescriptor]

'containingDeclaration' @ [105:84] ==> public final val SimpleFunctionDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'IllegalStateException' @ [106:31] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'receiverOwner' @ [106:82] ==> val receiverOwner: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.highlighter.KotlinRecursiveCallLineMarkerProvider.isRecursiveCall.isDifferentReceiver[LocalVariableDescriptor]

'isDifferentReceiver' @ [110:13] ==> local final fun isDifferentReceiver(receiver: Receiver?): Boolean defined in org.jetbrains.kotlin.idea.highlighter.KotlinRecursiveCallLineMarkerProvider.isRecursiveCall[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [110:33] ==> val resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.idea.highlighter.KotlinRecursiveCallLineMarkerProvider.isRecursiveCall[LocalVariableDescriptor]

'dispatchReceiver' @ [110:46] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.dispatchReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'LineMarkerInfo<KtElement>' @ [115:15] ==> public constructor LineMarkerInfo<T : (PsiElement..PsiElement?)>(@NotNull p0: KtElement, @NotNull p1: TextRange, p2: (Icon..Icon?), p3: Int, @Nullable p4: (((KtElement..KtElement?)) -> (String..String?))?, @Nullable p5: (((MouseEvent..MouseEvent?), (KtElement..KtElement?)) -> Unit)?, @NotNull p6: GutterIconRenderer.Alignment) defined in com.intellij.codeInsight.daemon.LineMarkerInfo[SamAdapterClassConstructorDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> KtElement

'callElement' @ [116:13] ==> value-parameter callElement: KtElement defined in org.jetbrains.kotlin.idea.highlighter.KotlinRecursiveCallLineMarkerProvider.RecursiveMethodCallMarkerInfo.<init>[ValueParameterDescriptorImpl]

'callElement' @ [117:13] ==> value-parameter callElement: KtElement defined in org.jetbrains.kotlin.idea.highlighter.KotlinRecursiveCallLineMarkerProvider.RecursiveMethodCallMarkerInfo.<init>[ValueParameterDescriptorImpl]

'textRange' @ [117:25] ==> public final val KtElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'RecursiveMethod' @ [118:29] ==> public final val RecursiveMethod: (Icon..Icon?) defined in com.intellij.icons.AllIcons.Gutter[JavaPropertyDescriptor]

'LINE_MARKERS' @ [119:18] ==> public const final val LINE_MARKERS: Int defined in com.intellij.codeHighlighting.Pass[JavaPropertyDescriptor]

'RIGHT' @ [122:42] ==> enum entry RIGHT defined in com.intellij.openapi.editor.markup.GutterIconRenderer.Alignment[FakeCallableDescriptorForObject]

'LineMarkerInfo.LineMarkerGutterIconRenderer<KtElement>' @ [126:29] ==> public constructor LineMarkerGutterIconRenderer<T : (PsiElement..PsiElement?)>(@NotNull p0: LineMarkerInfo<(KtElement..KtElement?)>) defined in com.intellij.codeInsight.daemon.LineMarkerInfo.LineMarkerGutterIconRenderer[JavaClassConstructorDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> KtElement

'this' @ [126:84] ==> <this> defined in org.jetbrains.kotlin.idea.highlighter.KotlinRecursiveCallLineMarkerProvider.RecursiveMethodCallMarkerInfo[LazyClassReceiverParameterDescriptor]

'!!' @ [135:12] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: Document?): Document[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> Document

'getInstance' @ [135:31] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'project' @ [135:43] ==> public final val PsiElement.project: Project[MyPropertyDescriptor]

'getDocument' @ [135:52] ==> @Nullable public abstract fun getDocument(@NotNull p0: PsiFile): Document? defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'containingFile' @ [135:64] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'getLineNumber' @ [135:82] ==> @Contract public abstract fun getLineNumber(p0: Int): Int defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'textOffset' @ [135:96] ==> public final val PsiElement.textOffset: Int[MyPropertyDescriptor]

'when (element) {
        is KtSimpleNameExpression -> {
            val elementParent = element.getParent()
            when (elementParent) {
                is KtCallExpression -> return Name.identifier(element.getText())
                is KtOperationExpression -> {
                    val operationReference = elementParent.operationReference
                    if (element == operationReference) {
                        val node = operationReference.getReferencedNameElementType()
                        return if (node is KtToken) {
                            val conventionName = if (elementParent is KtPrefixExpression)
                                OperatorConventions.getNameForOperationSymbol(node, true,  false)
                            else
                                OperatorConventions.getNameForOperationSymbol(node)

                            conventionName ?: Name.identifier(element.getText())
                        }
                        else {
                            Name.identifier(element.getText())
                        }
                    }
                }
            }
        }
        is KtArrayAccessExpression ->
            return OperatorNameConventions.GET
        is KtThisExpression ->
            if (element.getParent() is KtCallExpression) {
                return OperatorNameConventions.INVOKE
            }
    }' @ [139:5] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'element' @ [139:11] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.highlighter.getCallNameFromPsi[ValueParameterDescriptorImpl]

'element' @ [141:33] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.highlighter.getCallNameFromPsi[ValueParameterDescriptorImpl]

'getParent' @ [141:41] ==> @Contract public abstract fun getParent(): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtElement[JavaMethodDescriptor]

'when (elementParent) {
                is KtCallExpression -> return Name.identifier(element.getText())
                is KtOperationExpression -> {
                    val operationReference = elementParent.operationReference
                    if (element == operationReference) {
                        val node = operationReference.getReferencedNameElementType()
                        return if (node is KtToken) {
                            val conventionName = if (elementParent is KtPrefixExpression)
                                OperatorConventions.getNameForOperationSymbol(node, true,  false)
                            else
                                OperatorConventions.getNameForOperationSymbol(node)

                            conventionName ?: Name.identifier(element.getText())
                        }
                        else {
                            Name.identifier(element.getText())
                        }
                    }
                }
            }' @ [142:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'elementParent' @ [142:19] ==> val elementParent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.highlighter.getCallNameFromPsi[LocalVariableDescriptor]

'identifier' @ [143:52] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'element' @ [143:63] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.highlighter.getCallNameFromPsi[ValueParameterDescriptorImpl]

'getText' @ [143:71] ==> @NonNls @Contract public abstract fun getText(): (String..String?) defined in org.jetbrains.kotlin.psi.KtElement[JavaMethodDescriptor]

'elementParent' @ [145:46] ==> val elementParent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.highlighter.getCallNameFromPsi[LocalVariableDescriptor]

'operationReference' @ [145:60] ==> public final val KtOperationExpression.operationReference: KtSimpleNameExpression[MyPropertyDescriptor]

'element' @ [146:25] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.highlighter.getCallNameFromPsi[ValueParameterDescriptorImpl]

'operationReference' @ [146:36] ==> val operationReference: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.highlighter.getCallNameFromPsi[LocalVariableDescriptor]

'operationReference' @ [147:36] ==> val operationReference: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.highlighter.getCallNameFromPsi[LocalVariableDescriptor]

'getReferencedNameElementType' @ [147:55] ==> public abstract fun getReferencedNameElementType(): IElementType defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'if (node is KtToken) {
                            val conventionName = if (elementParent is KtPrefixExpression)
                                OperatorConventions.getNameForOperationSymbol(node, true,  false)
                            else
                                OperatorConventions.getNameForOperationSymbol(node)

                            conventionName ?: Name.identifier(element.getText())
                        }
                        else {
                            Name.identifier(element.getText())
                        }' @ [148:32] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Name?, elseBranch: Name?): Name?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Name?

'node' @ [148:36] ==> val node: IElementType defined in org.jetbrains.kotlin.idea.highlighter.getCallNameFromPsi[LocalVariableDescriptor]

'if (elementParent is KtPrefixExpression)
                                OperatorConventions.getNameForOperationSymbol(node, true,  false)
                            else
                                OperatorConventions.getNameForOperationSymbol(node)' @ [149:50] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Name?, elseBranch: Name?): Name?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Name?

'elementParent' @ [149:54] ==> val elementParent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.highlighter.getCallNameFromPsi[LocalVariableDescriptor]

'getNameForOperationSymbol' @ [150:53] ==> @Nullable public open fun getNameForOperationSymbol(@NotNull p0: KtToken, p1: Boolean, p2: Boolean): Name? defined in org.jetbrains.kotlin.types.expressions.OperatorConventions[JavaMethodDescriptor]

'node' @ [150:79] ==> val node: IElementType defined in org.jetbrains.kotlin.idea.highlighter.getCallNameFromPsi[LocalVariableDescriptor]

'getNameForOperationSymbol' @ [152:53] ==> @Nullable public open fun getNameForOperationSymbol(@NotNull p0: KtToken): Name? defined in org.jetbrains.kotlin.types.expressions.OperatorConventions[JavaMethodDescriptor]

'node' @ [152:79] ==> val node: IElementType defined in org.jetbrains.kotlin.idea.highlighter.getCallNameFromPsi[LocalVariableDescriptor]

'conventionName' @ [154:29] ==> val conventionName: Name? defined in org.jetbrains.kotlin.idea.highlighter.getCallNameFromPsi[LocalVariableDescriptor]

'identifier' @ [154:52] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'element' @ [154:63] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.highlighter.getCallNameFromPsi[ValueParameterDescriptorImpl]

'getText' @ [154:71] ==> @NonNls @Contract public abstract fun getText(): (String..String?) defined in org.jetbrains.kotlin.psi.KtElement[JavaMethodDescriptor]

'identifier' @ [157:34] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'element' @ [157:45] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.highlighter.getCallNameFromPsi[ValueParameterDescriptorImpl]

'getText' @ [157:53] ==> @NonNls @Contract public abstract fun getText(): (String..String?) defined in org.jetbrains.kotlin.psi.KtElement[JavaMethodDescriptor]

'OperatorNameConventions' @ [164:20] ==> public object OperatorNameConventions defined in org.jetbrains.kotlin.util[FakeCallableDescriptorForObject]

'GET' @ [164:44] ==> @field:JvmField public final val GET: Name defined in org.jetbrains.kotlin.util.OperatorNameConventions[DeserializedPropertyDescriptor]

'element' @ [166:17] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.highlighter.getCallNameFromPsi[ValueParameterDescriptorImpl]

'getParent' @ [166:25] ==> @Contract public abstract fun getParent(): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtElement[JavaMethodDescriptor]

'OperatorNameConventions' @ [167:24] ==> public object OperatorNameConventions defined in org.jetbrains.kotlin.util[FakeCallableDescriptorForObject]

'INVOKE' @ [167:48] ==> @field:JvmField public final val INVOKE: Name defined in org.jetbrains.kotlin.util.OperatorNameConventions[DeserializedPropertyDescriptor]

