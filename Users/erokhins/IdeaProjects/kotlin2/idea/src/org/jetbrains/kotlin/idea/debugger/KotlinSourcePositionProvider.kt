'SourcePositionProvider' @ [48:37] ==> public constructor SourcePositionProvider() defined in com.intellij.debugger.engine.SourcePositionProvider[JavaClassConstructorDescriptor]

'context' @ [50:13] ==> value-parameter context: DebuggerContextImpl defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider.computeSourcePosition[ValueParameterDescriptorImpl]

'frameProxy' @ [50:21] ==> public final val DebuggerContextImpl.frameProxy: StackFrameProxyImpl?[MyPropertyDescriptor]

'descriptor' @ [52:13] ==> value-parameter descriptor: NodeDescriptor defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider.computeSourcePosition[ValueParameterDescriptorImpl]

'computeSourcePosition' @ [53:20] ==> private final fun computeSourcePosition(descriptor: FieldDescriptor, project: Project, context: DebuggerContextImpl, nearest: Boolean): SourcePosition? defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider[SimpleFunctionDescriptorImpl]

'descriptor' @ [53:42] ==> value-parameter descriptor: NodeDescriptor defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider.computeSourcePosition[ValueParameterDescriptorImpl]

'project' @ [53:54] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider.computeSourcePosition[ValueParameterDescriptorImpl]

'context' @ [53:63] ==> value-parameter context: DebuggerContextImpl defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider.computeSourcePosition[ValueParameterDescriptorImpl]

'nearest' @ [53:72] ==> value-parameter nearest: Boolean defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider.computeSourcePosition[ValueParameterDescriptorImpl]

'descriptor' @ [56:13] ==> value-parameter descriptor: NodeDescriptor defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider.computeSourcePosition[ValueParameterDescriptorImpl]

'computeSourcePosition' @ [57:20] ==> private final fun computeSourcePosition(descriptor: LocalVariableDescriptor, project: Project, context: DebuggerContextImpl, nearest: Boolean): SourcePosition? defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider[SimpleFunctionDescriptorImpl]

'descriptor' @ [57:42] ==> value-parameter descriptor: NodeDescriptor defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider.computeSourcePosition[ValueParameterDescriptorImpl]

'project' @ [57:54] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider.computeSourcePosition[ValueParameterDescriptorImpl]

'context' @ [57:63] ==> value-parameter context: DebuggerContextImpl defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider.computeSourcePosition[ValueParameterDescriptorImpl]

'nearest' @ [57:72] ==> value-parameter nearest: Boolean defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider.computeSourcePosition[ValueParameterDescriptorImpl]

'?:' @ [64:21] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: PsiElement?, right: PsiElement): PsiElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> PsiElement

'getContextElement' @ [64:34] ==> @Nullable public open fun getContextElement(p0: (StackFrameContext..StackFrameContext?)): PsiElement? defined in com.intellij.debugger.impl.PositionUtil[JavaMethodDescriptor]

'context' @ [64:52] ==> value-parameter context: DebuggerContextImpl defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider.computeSourcePosition[ValueParameterDescriptorImpl]

'place' @ [65:13] ==> val place: PsiElement defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider.computeSourcePosition[LocalVariableDescriptor]

'containingFile' @ [65:19] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'?:' @ [67:30] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: PsiElement?, right: PsiElement): PsiElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> PsiElement

'getContextElement' @ [67:56] ==> public final fun getContextElement(elementAt: PsiElement?): PsiElement? defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinCodeFragmentFactory.Companion[SimpleFunctionDescriptorImpl]

'place' @ [67:74] ==> val place: PsiElement defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider.computeSourcePosition[LocalVariableDescriptor]

'KtPsiFactory' @ [69:28] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [69:41] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider.computeSourcePosition[ValueParameterDescriptorImpl]

'createExpressionCodeFragment' @ [69:50] ==> public final fun createExpressionCodeFragment(text: String, context: PsiElement?): KtExpressionCodeFragment defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [69:79] ==> value-parameter descriptor: LocalVariableDescriptor defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider.computeSourcePosition[ValueParameterDescriptorImpl]

'name' @ [69:90] ==> public final val LocalVariableDescriptor.name: (String..String?)[MyPropertyDescriptor]

'contextElement' @ [69:96] ==> val contextElement: PsiElement defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider.computeSourcePosition[LocalVariableDescriptor]

'codeFragment' @ [70:26] ==> val codeFragment: KtExpressionCodeFragment defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider.computeSourcePosition[LocalVariableDescriptor]

'getContentElement' @ [70:39] ==> public open fun getContentElement(): KtExpression? defined in org.jetbrains.kotlin.psi.KtExpressionCodeFragment[DeserializedSimpleFunctionDescriptor]

'expression' @ [71:13] ==> val expression: KtExpression? defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider.computeSourcePosition[LocalVariableDescriptor]

'expression' @ [72:34] ==> val expression: KtExpression? defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider.computeSourcePosition[LocalVariableDescriptor]

'analyze' @ [72:45] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [72:69] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'extractVariableDescriptorFromReference' @ [73:61] ==> @Nullable public open fun extractVariableDescriptorFromReference(@NotNull p0: BindingContext, @Nullable p1: KtElement?): VariableDescriptor? defined in org.jetbrains.kotlin.resolve.BindingContextUtils[JavaMethodDescriptor]

'bindingContext' @ [73:100] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider.computeSourcePosition[LocalVariableDescriptor]

'expression' @ [73:116] ==> val expression: KtExpression? defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider.computeSourcePosition[LocalVariableDescriptor]

'declarationDescriptor' @ [74:33] ==> val declarationDescriptor: VariableDescriptor? defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider.computeSourcePosition[LocalVariableDescriptor]

'source' @ [74:56] ==> public final val VariableDescriptor.source: SourceElement[MyPropertyDescriptor]

'sourceElement' @ [75:17] ==> val sourceElement: SourceElement? defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider.computeSourcePosition[LocalVariableDescriptor]

'sourceElement' @ [76:31] ==> val sourceElement: SourceElement? defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider.computeSourcePosition[LocalVariableDescriptor]

'getPsi' @ [76:45] ==> public fun SourceElement.getPsi(): PsiElement? defined in org.jetbrains.kotlin.resolve.source[DeserializedSimpleFunctionDescriptor]

'nearest' @ [77:21] ==> value-parameter nearest: Boolean defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider.computeSourcePosition[ValueParameterDescriptorImpl]

'findNearest' @ [78:48] ==> public open fun findNearest(@NotNull p0: DebuggerContextImpl, @NotNull p1: PsiElement, @NotNull p2: PsiFile): (SourcePosition..SourcePosition?) defined in com.intellij.debugger.impl.DebuggerContextUtil[JavaMethodDescriptor]

'context' @ [78:60] ==> value-parameter context: DebuggerContextImpl defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider.computeSourcePosition[ValueParameterDescriptorImpl]

'element' @ [78:69] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider.computeSourcePosition[LocalVariableDescriptor]

'element' @ [78:78] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider.computeSourcePosition[LocalVariableDescriptor]

'containingFile' @ [78:86] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'createFromOffset' @ [80:39] ==> public open fun createFromOffset(@NotNull p0: PsiFile, p1: Int): (SourcePosition..SourcePosition?) defined in com.intellij.debugger.SourcePosition[JavaMethodDescriptor]

'element' @ [80:56] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider.computeSourcePosition[LocalVariableDescriptor]

'containingFile' @ [80:64] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'element' @ [80:80] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider.computeSourcePosition[LocalVariableDescriptor]

'textOffset' @ [80:88] ==> public final val PsiElement.textOffset: Int[MyPropertyDescriptor]

'descriptor' @ [88:25] ==> value-parameter descriptor: FieldDescriptor defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider.computeSourcePosition[ValueParameterDescriptorImpl]

'field' @ [88:36] ==> public final val FieldDescriptor.field: (Field..Field?)[MyPropertyDescriptor]

'name' @ [88:42] ==> public abstract fun name(): (String..String?) defined in com.sun.jdi.Field[JavaMethodDescriptor]

'fieldName' @ [89:13] ==> val fieldName: (String..String?) defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider.computeSourcePosition[LocalVariableDescriptor]

'CAPTURED_THIS_FIELD' @ [89:34] ==> public const final val CAPTURED_THIS_FIELD: String defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaPropertyDescriptor]

'fieldName' @ [89:57] ==> val fieldName: (String..String?) defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider.computeSourcePosition[LocalVariableDescriptor]

'CAPTURED_RECEIVER_FIELD' @ [89:78] ==> public const final val CAPTURED_RECEIVER_FIELD: String defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaPropertyDescriptor]

'descriptor' @ [93:20] ==> value-parameter descriptor: FieldDescriptor defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider.computeSourcePosition[ValueParameterDescriptorImpl]

'field' @ [93:31] ==> public final val FieldDescriptor.field: (Field..Field?)[MyPropertyDescriptor]

'declaringType' @ [93:37] ==> public abstract fun declaringType(): (ReferenceType..ReferenceType?) defined in com.sun.jdi.Field[JavaMethodDescriptor]

'findClassByType' @ [94:23] ==> private final fun findClassByType(project: Project, type: ReferenceType, context: DebuggerContextImpl): PsiElement? defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider[SimpleFunctionDescriptorImpl]

'project' @ [94:39] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider.computeSourcePosition[ValueParameterDescriptorImpl]

'type' @ [94:48] ==> val type: (ReferenceType..ReferenceType?) defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider.computeSourcePosition[LocalVariableDescriptor]

'context' @ [94:54] ==> value-parameter context: DebuggerContextImpl defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider.computeSourcePosition[ValueParameterDescriptorImpl]

'navigationElement' @ [94:64] ==> public final val PsiElement.navigationElement: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'myClass' @ [96:21] ==> val myClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider.computeSourcePosition[LocalVariableDescriptor]

'declarations' @ [96:29] ==> public final val KtClassOrObject.declarations: List<KtDeclaration>[MyPropertyDescriptor]

'firstOrNull' @ [96:42] ==> public inline fun <T> Iterable<KtDeclaration>.firstOrNull(predicate: (KtDeclaration) -> Boolean): KtDeclaration? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration

'fieldName' @ [96:56] ==> val fieldName: (String..String?) defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider.computeSourcePosition[LocalVariableDescriptor]

'it' @ [96:69] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider.computeSourcePosition.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [96:72] ==> public final val KtDeclaration.name: String?[MyPropertyDescriptor]

'nearest' @ [98:13] ==> value-parameter nearest: Boolean defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider.computeSourcePosition[ValueParameterDescriptorImpl]

'findNearest' @ [99:40] ==> public open fun findNearest(@NotNull p0: DebuggerContextImpl, @NotNull p1: PsiElement, @NotNull p2: PsiFile): (SourcePosition..SourcePosition?) defined in com.intellij.debugger.impl.DebuggerContextUtil[JavaMethodDescriptor]

'context' @ [99:52] ==> value-parameter context: DebuggerContextImpl defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider.computeSourcePosition[ValueParameterDescriptorImpl]

'field' @ [99:61] ==> val field: KtDeclaration defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider.computeSourcePosition[LocalVariableDescriptor]

'myClass' @ [99:68] ==> val myClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider.computeSourcePosition[LocalVariableDescriptor]

'containingFile' @ [99:76] ==> public final val KtClassOrObject.containingFile: PsiFile[MyPropertyDescriptor]

'createFromOffset' @ [101:31] ==> public open fun createFromOffset(@NotNull p0: PsiFile, p1: Int): (SourcePosition..SourcePosition?) defined in com.intellij.debugger.SourcePosition[JavaMethodDescriptor]

'field' @ [101:48] ==> val field: KtDeclaration defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider.computeSourcePosition[LocalVariableDescriptor]

'containingFile' @ [101:54] ==> public final val KtDeclaration.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'field' @ [101:70] ==> val field: KtDeclaration defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider.computeSourcePosition[LocalVariableDescriptor]

'textOffset' @ [101:76] ==> public final val KtDeclaration.textOffset: Int[MyPropertyDescriptor]

'context' @ [105:23] ==> value-parameter context: DebuggerContextImpl defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider.findClassByType[ValueParameterDescriptorImpl]

'debuggerSession' @ [105:31] ==> public final val DebuggerContextImpl.debuggerSession: DebuggerSession?[MyPropertyDescriptor]

'session' @ [106:21] ==> val session: DebuggerSession? defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider.findClassByType[LocalVariableDescriptor]

'searchScope' @ [106:30] ==> public final val DebuggerSession.searchScope: GlobalSearchScope[MyPropertyDescriptor]

'allScope' @ [106:63] ==> @NotNull public open fun allScope(@NotNull p0: Project): GlobalSearchScope defined in com.intellij.psi.search.GlobalSearchScope[JavaMethodDescriptor]

'project' @ [106:72] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider.findClassByType[ValueParameterDescriptorImpl]

'byInternalName' @ [107:38] ==> @NotNull public open fun byInternalName(@NotNull p0: String): JvmClassName defined in org.jetbrains.kotlin.resolve.jvm.JvmClassName[JavaMethodDescriptor]

'type' @ [107:53] ==> value-parameter type: ReferenceType defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider.findClassByType[ValueParameterDescriptorImpl]

'name' @ [107:58] ==> public abstract fun name(): (String..String?) defined in com.sun.jdi.ReferenceType[JavaMethodDescriptor]

'fqNameForClassNameWithoutDollars' @ [107:66] ==> public final val JvmClassName.fqNameForClassNameWithoutDollars: FqName[MyPropertyDescriptor]

'asString' @ [107:99] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'getInstance' @ [109:37] ==> public open fun getInstance(p0: (Project..Project?)): (JavaPsiFacade..JavaPsiFacade?) defined in com.intellij.psi.JavaPsiFacade[JavaMethodDescriptor]

'project' @ [109:49] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider.findClassByType[ValueParameterDescriptorImpl]

'findClass' @ [109:58] ==> @Nullable public abstract fun findClass(@NonNls @NotNull p0: String, @NotNull p1: GlobalSearchScope): PsiClass? defined in com.intellij.psi.JavaPsiFacade[JavaMethodDescriptor]

'className' @ [109:68] ==> val className: String defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider.findClassByType[LocalVariableDescriptor]

'scope' @ [109:79] ==> val scope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider.findClassByType[LocalVariableDescriptor]

'myClass' @ [110:13] ==> val myClass: PsiClass? defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider.findClassByType[LocalVariableDescriptor]

'myClass' @ [110:37] ==> val myClass: PsiClass? defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider.findClassByType[LocalVariableDescriptor]

'getLastSourcePosition' @ [112:24] ==> private final fun getLastSourcePosition(type: ReferenceType, context: DebuggerContextImpl): SourcePosition? defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider[SimpleFunctionDescriptorImpl]

'type' @ [112:46] ==> value-parameter type: ReferenceType defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider.findClassByType[ValueParameterDescriptorImpl]

'context' @ [112:52] ==> value-parameter context: DebuggerContextImpl defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider.findClassByType[ValueParameterDescriptorImpl]

'position' @ [113:13] ==> val position: SourcePosition? defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider.findClassByType[LocalVariableDescriptor]

'position' @ [114:27] ==> val position: SourcePosition? defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider.findClassByType[LocalVariableDescriptor]

'elementAt' @ [114:36] ==> public final val SourcePosition.elementAt: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'element' @ [115:17] ==> val element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider.findClassByType[LocalVariableDescriptor]

'element' @ [116:24] ==> val element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider.findClassByType[LocalVariableDescriptor]

'getStrictParentOfType' @ [116:32] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtClassOrObject? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtClassOrObject

'context' @ [123:28] ==> value-parameter context: DebuggerContextImpl defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider.getLastSourcePosition[ValueParameterDescriptorImpl]

'debugProcess' @ [123:36] ==> public final val DebuggerContextImpl.debugProcess: DebugProcessImpl?[MyPropertyDescriptor]

'debugProcess' @ [124:13] ==> val debugProcess: DebugProcessImpl? defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider.getLastSourcePosition[LocalVariableDescriptor]

'type' @ [126:33] ==> value-parameter type: ReferenceType defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider.getLastSourcePosition[ValueParameterDescriptorImpl]

'allLineLocations' @ [126:38] ==> public abstract fun allLineLocations(): (MutableList<(Location..Location?)>..List<(Location..Location?)>?) defined in com.sun.jdi.ReferenceType[JavaMethodDescriptor]

'!' @ [127:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'locations' @ [127:22] ==> val locations: (MutableList<(Location..Location?)>..List<(Location..Location?)>?) defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider.getLastSourcePosition[LocalVariableDescriptor]

'isEmpty' @ [127:32] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'locations' @ [128:40] ==> val locations: (MutableList<(Location..Location?)>..List<(Location..Location?)>?) defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider.getLastSourcePosition[LocalVariableDescriptor]

'get' @ [128:50] ==> public abstract fun get(index: Int): (Location..Location?) defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'locations' @ [128:54] ==> val locations: (MutableList<(Location..Location?)>..List<(Location..Location?)>?) defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider.getLastSourcePosition[LocalVariableDescriptor]

'size' @ [128:64] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'debugProcess' @ [129:28] ==> val debugProcess: DebugProcessImpl? defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider.getLastSourcePosition[LocalVariableDescriptor]

'positionManager' @ [129:41] ==> public final val DebugProcessImpl.positionManager: CompoundPositionManager[MyPropertyDescriptor]

'getSourcePosition' @ [129:57] ==> @Nullable public open fun getSourcePosition(p0: Location?): SourcePosition? defined in com.intellij.debugger.engine.CompoundPositionManager[JavaMethodDescriptor]

'lastLocation' @ [129:75] ==> val lastLocation: (Location..Location?) defined in org.jetbrains.kotlin.idea.debugger.KotlinSourcePositionProvider.getLastSourcePosition[LocalVariableDescriptor]

