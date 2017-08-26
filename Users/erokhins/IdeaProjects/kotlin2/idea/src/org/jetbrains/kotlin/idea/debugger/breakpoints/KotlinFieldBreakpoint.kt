'BreakpointWithHighlighter<KotlinPropertyBreakpointProperties>' @ [60:4] ==> protected/*protected and package*/ constructor BreakpointWithHighlighter<P : raw (JavaBreakpointProperties<(JavaBreakpointProperties<*>..JavaBreakpointProperties<*>?)>..JavaBreakpointProperties<out (JavaBreakpointProperties<*>..JavaBreakpointProperties<*>?)>?)>(@NotNull p0: Project, p1: raw (XBreakpoint<(XBreakpointProperties<*>..XBreakpointProperties<*>?)>..XBreakpoint<out (XBreakpointProperties<*>..XBreakpointProperties<*>?)>?)) defined in com.intellij.debugger.ui.breakpoints.BreakpointWithHighlighter[JavaClassConstructorDescriptor]
Inferred types:
    <P : raw (JavaBreakpointProperties<(JavaBreakpointProperties<*>..JavaBreakpointProperties<*>?)>..JavaBreakpointProperties<out (JavaBreakpointProperties<*>..JavaBreakpointProperties<*>?)>?)> -> KotlinPropertyBreakpointProperties

'project' @ [60:66] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.<init>[ValueParameterDescriptorImpl]

'breakpoint' @ [60:75] ==> value-parameter breakpoint: XBreakpoint<KotlinPropertyBreakpointProperties> defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.<init>[ValueParameterDescriptorImpl]

'getInstance' @ [62:34] ==> @NotNull public open fun getInstance(@NotNull @NonNls p0: String): Logger defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'lookup' @ [63:73] ==> @NotNull public open fun <T : raw (Breakpoint<(JavaBreakpointProperties<*>..JavaBreakpointProperties<*>?)>..Breakpoint<out (JavaBreakpointProperties<*>..JavaBreakpointProperties<*>?)>?)> lookup(p0: (String..String?)): Key<(FieldBreakpoint..FieldBreakpoint?)> defined in com.intellij.debugger.ui.breakpoints.BreakpointCategory[JavaMethodDescriptor]
Inferred types:
    <T : raw (Breakpoint<(JavaBreakpointProperties<*>..JavaBreakpointProperties<*>?)>..Breakpoint<out (JavaBreakpointProperties<*>..JavaBreakpointProperties<*>?)>?)> -> FieldBreakpoint

'FIELD' @ [71:65] ==> enum entry FIELD defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.BreakpointType[FakeCallableDescriptorForObject]

'!' @ [74:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isPositionValid' @ [74:40] ==> protected/*protected static*/ open fun isPositionValid(@Nullable p0: XSourcePosition?): Boolean defined in com.intellij.debugger.ui.breakpoints.BreakpointWithHighlighter[JavaMethodDescriptor]

'xBreakpoint' @ [74:56] ==> public final val KotlinFieldBreakpoint.xBreakpoint: (XBreakpoint<(KotlinPropertyBreakpointProperties..KotlinPropertyBreakpointProperties?)>..XBreakpoint<(KotlinPropertyBreakpointProperties..KotlinPropertyBreakpointProperties?)>?)[MyPropertyDescriptor]

'sourcePosition' @ [74:68] ==> public final val <P : raw (XBreakpointProperties<(Any..Any?)>..XBreakpointProperties<*>?)> XBreakpoint<(KotlinPropertyBreakpointProperties..KotlinPropertyBreakpointProperties?)>.sourcePosition: XSourcePosition?[MyPropertyDescriptor]
Inferred types:
    <P : raw (XBreakpointProperties<(Any..Any?)>..XBreakpointProperties<*>?)> -> (org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinPropertyBreakpointProperties..org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinPropertyBreakpointProperties?)

'runReadAction' @ [76:16] ==> public fun <T> runReadAction(action: () -> Boolean): Boolean defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Boolean

'getField' @ [77:25] ==> public final fun getField(): KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint[SimpleFunctionDescriptorImpl]

'field' @ [78:13] ==> val field: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.isValid.<anonymous>[LocalVariableDescriptor]

'field' @ [78:30] ==> val field: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.isValid.<anonymous>[LocalVariableDescriptor]

'isValid' @ [78:36] ==> public final val KtCallableDeclaration.isValid: Boolean[MyPropertyDescriptor]

'sourcePosition' @ [83:30] ==> public final val KotlinFieldBreakpoint.sourcePosition: SourcePosition?[MyPropertyDescriptor]

'getProperty' @ [84:16] ==> private final fun getProperty(sourcePosition: SourcePosition?): KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint[SimpleFunctionDescriptorImpl]

'sourcePosition' @ [84:28] ==> val sourcePosition: SourcePosition? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.getField[LocalVariableDescriptor]

'getPsiElementAt' @ [88:50] ==> @Nullable public open fun <T : (PsiElement..PsiElement?)> getPsiElementAt(p0: (Project..Project?), p1: (Class<(KtProperty..KtProperty?)>..Class<(KtProperty..KtProperty?)>?), p2: (SourcePosition..SourcePosition?)): KtProperty? defined in com.intellij.debugger.impl.PositionUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtProperty..org.jetbrains.kotlin.psi.KtProperty?)

'project' @ [88:66] ==> public final val KotlinFieldBreakpoint.project: Project[MyPropertyDescriptor]

'java' @ [88:93] ==> public val <T> KClass<KtProperty>.java: Class<KtProperty> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtProperty

'sourcePosition' @ [88:99] ==> value-parameter sourcePosition: SourcePosition? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.getProperty[ValueParameterDescriptorImpl]

'property' @ [89:13] ==> val property: KtProperty? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.getProperty[LocalVariableDescriptor]

'property' @ [90:20] ==> val property: KtProperty? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.getProperty[LocalVariableDescriptor]

'getPsiElementAt' @ [92:52] ==> @Nullable public open fun <T : (PsiElement..PsiElement?)> getPsiElementAt(p0: (Project..Project?), p1: (Class<(KtParameter..KtParameter?)>..Class<(KtParameter..KtParameter?)>?), p2: (SourcePosition..SourcePosition?)): KtParameter? defined in com.intellij.debugger.impl.PositionUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)

'project' @ [92:68] ==> public final val KotlinFieldBreakpoint.project: Project[MyPropertyDescriptor]

'java' @ [92:96] ==> public val <T> KClass<KtParameter>.java: Class<KtParameter> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtParameter

'sourcePosition' @ [92:102] ==> value-parameter sourcePosition: SourcePosition? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.getProperty[ValueParameterDescriptorImpl]

'parameter' @ [93:13] ==> val parameter: KtParameter? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.getProperty[LocalVariableDescriptor]

'parameter' @ [94:20] ==> val parameter: KtParameter? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.getProperty[LocalVariableDescriptor]

'getProperty' @ [100:24] ==> private final fun getProperty(sourcePosition: SourcePosition?): KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint[SimpleFunctionDescriptorImpl]

'sourcePosition' @ [100:36] ==> public final val KotlinFieldBreakpoint.sourcePosition: SourcePosition?[MyPropertyDescriptor]

'property' @ [101:13] ==> val property: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.reload[LocalVariableDescriptor]

'setFieldName' @ [102:13] ==> public final fun setFieldName(fieldName: String): Unit defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint[SimpleFunctionDescriptorImpl]

'property' @ [102:26] ==> val property: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.reload[LocalVariableDescriptor]

'name' @ [102:35] ==> public final val KtCallableDeclaration.name: String?[MyPropertyDescriptor]

'if (property is KtProperty && property.isTopLevel) {
                properties.myClassName = JvmFileClassUtil.getFileClassInfoNoResolve(property.getContainingKtFile()).fileClassFqName.asString()
            }
            else {
                val ktClass: KtClassOrObject? = PsiTreeUtil.getParentOfType(property, KtClassOrObject::class.java)
                if (ktClass is KtClassOrObject) {
                    val fqName = ktClass.fqName
                    if (fqName != null) {
                        properties.myClassName = fqName.asString()
                    }
                }
            }' @ [104:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'property' @ [104:17] ==> val property: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.reload[LocalVariableDescriptor]

'property' @ [104:43] ==> val property: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.reload[LocalVariableDescriptor]

'isTopLevel' @ [104:52] ==> public final val KtProperty.isTopLevel: Boolean[MyPropertyDescriptor]

'properties' @ [105:17] ==> protected/*protected and package*/ for synthetic extension final val KotlinFieldBreakpoint.properties: KotlinPropertyBreakpointProperties[MyPropertyDescriptor]

'myClassName' @ [105:28] ==> @Attribute public final var myClassName: String defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinPropertyBreakpointProperties[PropertyDescriptorImpl]

'JvmFileClassUtil' @ [105:42] ==> public object JvmFileClassUtil defined in org.jetbrains.kotlin.fileClasses[FakeCallableDescriptorForObject]

'getFileClassInfoNoResolve' @ [105:59] ==> @JvmStatic public final fun getFileClassInfoNoResolve(file: KtFile): JvmFileClassInfo defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil[DeserializedSimpleFunctionDescriptor]

'property' @ [105:85] ==> val property: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.reload[LocalVariableDescriptor]

'getContainingKtFile' @ [105:94] ==> @NotNull public abstract fun getContainingKtFile(): KtFile defined in org.jetbrains.kotlin.psi.KtCallableDeclaration[JavaMethodDescriptor]

'fileClassFqName' @ [105:117] ==> public abstract val fileClassFqName: FqName defined in org.jetbrains.kotlin.fileClasses.JvmFileClassInfo[DeserializedPropertyDescriptor]

'asString' @ [105:133] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'getParentOfType' @ [108:61] ==> @Nullable @Contract public open fun <T : (PsiElement..PsiElement?)> getParentOfType(@Nullable p0: PsiElement?, @NotNull p1: Class<(KtClassOrObject..KtClassOrObject?)>): KtClassOrObject? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtClassOrObject..org.jetbrains.kotlin.psi.KtClassOrObject?)

'property' @ [108:77] ==> val property: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.reload[LocalVariableDescriptor]

'java' @ [108:110] ==> public val <T> KClass<KtClassOrObject>.java: Class<KtClassOrObject> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtClassOrObject

'ktClass' @ [109:21] ==> val ktClass: KtClassOrObject? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.reload[LocalVariableDescriptor]

'ktClass' @ [110:34] ==> val ktClass: KtClassOrObject? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.reload[LocalVariableDescriptor]

'fqName' @ [110:42] ==> public final val KtClassOrObject.fqName: FqName?[MyPropertyDescriptor]

'fqName' @ [111:25] ==> val fqName: FqName? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.reload[LocalVariableDescriptor]

'properties' @ [112:25] ==> protected/*protected and package*/ for synthetic extension final val KotlinFieldBreakpoint.properties: KotlinPropertyBreakpointProperties[MyPropertyDescriptor]

'myClassName' @ [112:36] ==> @Attribute public final var myClassName: String defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinPropertyBreakpointProperties[PropertyDescriptorImpl]

'fqName' @ [112:50] ==> val fqName: FqName? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.reload[LocalVariableDescriptor]

'asString' @ [112:57] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'isInstanceFiltersEnabled' @ [116:13] ==> public final var KotlinFieldBreakpoint.isInstanceFiltersEnabled: Boolean[MyPropertyDescriptor]

'debugProcess' @ [121:13] ==> value-parameter debugProcess: DebugProcessImpl? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.createRequestForPreparedClass[ValueParameterDescriptorImpl]

'refType' @ [121:37] ==> value-parameter refType: ReferenceType? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.createRequestForPreparedClass[ValueParameterDescriptorImpl]

'getProperty' @ [123:24] ==> private final fun getProperty(sourcePosition: SourcePosition?): KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint[SimpleFunctionDescriptorImpl]

'sourcePosition' @ [123:36] ==> public final val KotlinFieldBreakpoint.sourcePosition: SourcePosition?[MyPropertyDescriptor]

'breakpointType' @ [125:9] ==> private final var breakpointType: KotlinFieldBreakpoint.BreakpointType defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint[PropertyDescriptorImpl]

'computeBreakpointType' @ [125:27] ==> private final fun computeBreakpointType(property: KtCallableDeclaration): KotlinFieldBreakpoint.BreakpointType? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint[SimpleFunctionDescriptorImpl]

'property' @ [125:49] ==> val property: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.createRequestForPreparedClass[LocalVariableDescriptor]

'debugProcess' @ [127:18] ==> value-parameter debugProcess: DebugProcessImpl? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.createRequestForPreparedClass[ValueParameterDescriptorImpl]

'virtualMachineProxy' @ [127:31] ==> public final val DebugProcessImpl.virtualMachineProxy: VirtualMachineProxyImpl[MyPropertyDescriptor]

'properties' @ [129:17] ==> protected/*protected and package*/ for synthetic extension final val KotlinFieldBreakpoint.properties: KotlinPropertyBreakpointProperties[MyPropertyDescriptor]

'WATCH_INITIALIZATION' @ [129:28] ==> public final var WATCH_INITIALIZATION: Boolean defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinPropertyBreakpointProperties[PropertyDescriptorImpl]

'sourcePosition' @ [130:38] ==> public final val KotlinFieldBreakpoint.sourcePosition: SourcePosition?[MyPropertyDescriptor]

'sourcePosition' @ [131:21] ==> val sourcePosition: SourcePosition? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.createRequestForPreparedClass[LocalVariableDescriptor]

'debugProcess' @ [132:21] ==> value-parameter debugProcess: DebugProcessImpl? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.createRequestForPreparedClass[ValueParameterDescriptorImpl]

'positionManager' @ [132:34] ==> public final val DebugProcessImpl.positionManager: CompoundPositionManager[MyPropertyDescriptor]

'locationsOfLine' @ [133:30] ==> @NotNull public open fun locationsOfLine(@NotNull p0: ReferenceType, @NotNull p1: SourcePosition): (MutableList<(Location..Location?)>..List<(Location..Location?)>) defined in com.intellij.debugger.engine.CompoundPositionManager[JavaMethodDescriptor]

'refType' @ [133:46] ==> value-parameter refType: ReferenceType? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.createRequestForPreparedClass[ValueParameterDescriptorImpl]

'sourcePosition' @ [133:55] ==> val sourcePosition: SourcePosition? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.createRequestForPreparedClass[LocalVariableDescriptor]

'filter' @ [134:30] ==> public inline fun <T> Iterable<(Location..Location?)>.filter(predicate: ((Location..Location?)) -> Boolean): List<(Location..Location?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.sun.jdi.Location..com.sun.jdi.Location?)

'it' @ [134:39] ==> value-parameter it: (Location..Location?) defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.createRequestForPreparedClass.<anonymous>[ValueParameterDescriptorImpl]

'method' @ [134:42] ==> public abstract fun method(): (Method..Method?) defined in com.sun.jdi.Location[JavaMethodDescriptor]

'isConstructor' @ [134:51] ==> public final val Method.isConstructor: Boolean[MyPropertyDescriptor]

'it' @ [134:68] ==> value-parameter it: (Location..Location?) defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.createRequestForPreparedClass.<anonymous>[ValueParameterDescriptorImpl]

'method' @ [134:71] ==> public abstract fun method(): (Method..Method?) defined in com.sun.jdi.Location[JavaMethodDescriptor]

'isStaticInitializer' @ [134:80] ==> public final val Method.isStaticInitializer: Boolean[MyPropertyDescriptor]

'forEach' @ [135:30] ==> @HidesMembers public inline fun <T> Iterable<(Location..Location?)>.forEach(action: ((Location..Location?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.sun.jdi.Location..com.sun.jdi.Location?)

'debugProcess' @ [136:47] ==> value-parameter debugProcess: DebugProcessImpl? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.createRequestForPreparedClass[ValueParameterDescriptorImpl]

'requestsManager' @ [136:60] ==> public final val DebugProcessImpl.requestsManager: (RequestManagerImpl..RequestManagerImpl?)[MyPropertyDescriptor]

'createBreakpointRequest' @ [136:76] ==> public open fun createBreakpointRequest(p0: (FilteredRequestor..FilteredRequestor?), p1: (Location..Location?)): (BreakpointRequest..BreakpointRequest?) defined in com.intellij.debugger.engine.requests.RequestManagerImpl[JavaMethodDescriptor]

'this' @ [136:100] ==> <this> defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint[LazyClassReceiverParameterDescriptor]

'it' @ [136:106] ==> value-parameter it: (Location..Location?) defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.createRequestForPreparedClass.<anonymous>[ValueParameterDescriptorImpl]

'debugProcess' @ [137:33] ==> value-parameter debugProcess: DebugProcessImpl? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.createRequestForPreparedClass[ValueParameterDescriptorImpl]

'requestsManager' @ [137:46] ==> public final val DebugProcessImpl.requestsManager: (RequestManagerImpl..RequestManagerImpl?)[MyPropertyDescriptor]

'enableRequest' @ [137:62] ==> public open fun enableRequest(p0: (EventRequest..EventRequest?)): Unit defined in com.intellij.debugger.engine.requests.RequestManagerImpl[JavaMethodDescriptor]

'request' @ [137:76] ==> val request: (BreakpointRequest..BreakpointRequest?) defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.createRequestForPreparedClass.<anonymous>[LocalVariableDescriptor]

'LOG' @ [138:37] ==> private final val LOG: Logger defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.Companion[PropertyDescriptorImpl]

'isDebugEnabled' @ [138:41] ==> public final val Logger.isDebugEnabled: Boolean[MyPropertyDescriptor]

'LOG' @ [139:37] ==> private final val LOG: Logger defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.Companion[PropertyDescriptorImpl]

'debug' @ [139:41] ==> public abstract fun debug(@NonNls p0: (String..String?)): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'when (breakpointType) {
                BreakpointType.FIELD -> {
                    val field = refType.fieldByName(getFieldName())
                    if (field != null) {
                        val manager = debugProcess.requestsManager
                        if (properties.WATCH_MODIFICATION && vm.canWatchFieldModification()) {
                            val request = manager.createModificationWatchpointRequest(this, field)
                            debugProcess.requestsManager.enableRequest(request)
                            if (LOG.isDebugEnabled) {
                                LOG.debug("Modification request added")
                            }
                        }
                        if (properties.WATCH_ACCESS && vm.canWatchFieldAccess()) {
                            val request = manager.createAccessWatchpointRequest(this, field)
                            debugProcess.requestsManager.enableRequest(request)
                            if (LOG.isDebugEnabled) {
                                LOG.debug("Field access request added (field = ${field.name()}; refType = ${refType.name()})")
                            }
                        }
                    }
                }
                BreakpointType.METHOD -> {
                    val fieldName = getFieldName()

                    if (properties.WATCH_ACCESS) {
                        val getter = refType.methodsByName(JvmAbi.getterName(fieldName)).firstOrNull()
                        if (getter != null) {
                            createMethodBreakpoint(debugProcess, refType, getter)
                        }
                    }

                    if (properties.WATCH_MODIFICATION) {
                        val setter = refType.methodsByName(JvmAbi.setterName(fieldName)).firstOrNull()
                        if (setter != null) {
                            createMethodBreakpoint(debugProcess, refType, setter)
                        }
                    }
                }
            }' @ [145:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'breakpointType' @ [145:19] ==> private final var breakpointType: KotlinFieldBreakpoint.BreakpointType defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint[PropertyDescriptorImpl]

'FIELD' @ [146:32] ==> enum entry FIELD defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.BreakpointType[FakeCallableDescriptorForObject]

'refType' @ [147:33] ==> value-parameter refType: ReferenceType? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.createRequestForPreparedClass[ValueParameterDescriptorImpl]

'fieldByName' @ [147:41] ==> public abstract fun fieldByName(p0: (String..String?)): (Field..Field?) defined in com.sun.jdi.ReferenceType[JavaMethodDescriptor]

'getFieldName' @ [147:53] ==> private final fun getFieldName(): String defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint[SimpleFunctionDescriptorImpl]

'field' @ [148:25] ==> val field: (Field..Field?) defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.createRequestForPreparedClass[LocalVariableDescriptor]

'debugProcess' @ [149:39] ==> value-parameter debugProcess: DebugProcessImpl? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.createRequestForPreparedClass[ValueParameterDescriptorImpl]

'requestsManager' @ [149:52] ==> public final val DebugProcessImpl.requestsManager: (RequestManagerImpl..RequestManagerImpl?)[MyPropertyDescriptor]

'properties' @ [150:29] ==> protected/*protected and package*/ for synthetic extension final val KotlinFieldBreakpoint.properties: KotlinPropertyBreakpointProperties[MyPropertyDescriptor]

'WATCH_MODIFICATION' @ [150:40] ==> public final var WATCH_MODIFICATION: Boolean defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinPropertyBreakpointProperties[PropertyDescriptorImpl]

'vm' @ [150:62] ==> val vm: VirtualMachineProxyImpl defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.createRequestForPreparedClass[LocalVariableDescriptor]

'canWatchFieldModification' @ [150:65] ==> public open fun canWatchFieldModification(): Boolean defined in com.intellij.debugger.jdi.VirtualMachineProxyImpl[JavaMethodDescriptor]

'manager' @ [151:43] ==> val manager: (RequestManagerImpl..RequestManagerImpl?) defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.createRequestForPreparedClass[LocalVariableDescriptor]

'createModificationWatchpointRequest' @ [151:51] ==> public open fun createModificationWatchpointRequest(p0: (FilteredRequestor..FilteredRequestor?), p1: (Field..Field?)): (ModificationWatchpointRequest..ModificationWatchpointRequest?) defined in com.intellij.debugger.engine.requests.RequestManagerImpl[JavaMethodDescriptor]

'this' @ [151:87] ==> <this> defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint[LazyClassReceiverParameterDescriptor]

'field' @ [151:93] ==> val field: (Field..Field?) defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.createRequestForPreparedClass[LocalVariableDescriptor]

'debugProcess' @ [152:29] ==> value-parameter debugProcess: DebugProcessImpl? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.createRequestForPreparedClass[ValueParameterDescriptorImpl]

'requestsManager' @ [152:42] ==> public final val DebugProcessImpl.requestsManager: (RequestManagerImpl..RequestManagerImpl?)[MyPropertyDescriptor]

'enableRequest' @ [152:58] ==> public open fun enableRequest(p0: (EventRequest..EventRequest?)): Unit defined in com.intellij.debugger.engine.requests.RequestManagerImpl[JavaMethodDescriptor]

'request' @ [152:72] ==> val request: (ModificationWatchpointRequest..ModificationWatchpointRequest?) defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.createRequestForPreparedClass[LocalVariableDescriptor]

'LOG' @ [153:33] ==> private final val LOG: Logger defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.Companion[PropertyDescriptorImpl]

'isDebugEnabled' @ [153:37] ==> public final val Logger.isDebugEnabled: Boolean[MyPropertyDescriptor]

'LOG' @ [154:33] ==> private final val LOG: Logger defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.Companion[PropertyDescriptorImpl]

'debug' @ [154:37] ==> public abstract fun debug(@NonNls p0: (String..String?)): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'properties' @ [157:29] ==> protected/*protected and package*/ for synthetic extension final val KotlinFieldBreakpoint.properties: KotlinPropertyBreakpointProperties[MyPropertyDescriptor]

'WATCH_ACCESS' @ [157:40] ==> public final var WATCH_ACCESS: Boolean defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinPropertyBreakpointProperties[PropertyDescriptorImpl]

'vm' @ [157:56] ==> val vm: VirtualMachineProxyImpl defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.createRequestForPreparedClass[LocalVariableDescriptor]

'canWatchFieldAccess' @ [157:59] ==> public open fun canWatchFieldAccess(): Boolean defined in com.intellij.debugger.jdi.VirtualMachineProxyImpl[JavaMethodDescriptor]

'manager' @ [158:43] ==> val manager: (RequestManagerImpl..RequestManagerImpl?) defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.createRequestForPreparedClass[LocalVariableDescriptor]

'createAccessWatchpointRequest' @ [158:51] ==> public open fun createAccessWatchpointRequest(p0: (FilteredRequestor..FilteredRequestor?), p1: (Field..Field?)): (AccessWatchpointRequest..AccessWatchpointRequest?) defined in com.intellij.debugger.engine.requests.RequestManagerImpl[JavaMethodDescriptor]

'this' @ [158:81] ==> <this> defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint[LazyClassReceiverParameterDescriptor]

'field' @ [158:87] ==> val field: (Field..Field?) defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.createRequestForPreparedClass[LocalVariableDescriptor]

'debugProcess' @ [159:29] ==> value-parameter debugProcess: DebugProcessImpl? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.createRequestForPreparedClass[ValueParameterDescriptorImpl]

'requestsManager' @ [159:42] ==> public final val DebugProcessImpl.requestsManager: (RequestManagerImpl..RequestManagerImpl?)[MyPropertyDescriptor]

'enableRequest' @ [159:58] ==> public open fun enableRequest(p0: (EventRequest..EventRequest?)): Unit defined in com.intellij.debugger.engine.requests.RequestManagerImpl[JavaMethodDescriptor]

'request' @ [159:72] ==> val request: (AccessWatchpointRequest..AccessWatchpointRequest?) defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.createRequestForPreparedClass[LocalVariableDescriptor]

'LOG' @ [160:33] ==> private final val LOG: Logger defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.Companion[PropertyDescriptorImpl]

'isDebugEnabled' @ [160:37] ==> public final val Logger.isDebugEnabled: Boolean[MyPropertyDescriptor]

'LOG' @ [161:33] ==> private final val LOG: Logger defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.Companion[PropertyDescriptorImpl]

'debug' @ [161:37] ==> public abstract fun debug(@NonNls p0: (String..String?)): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'field' @ [161:82] ==> val field: (Field..Field?) defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.createRequestForPreparedClass[LocalVariableDescriptor]

'name' @ [161:88] ==> public abstract fun name(): (String..String?) defined in com.sun.jdi.Field[JavaMethodDescriptor]

'refType' @ [161:109] ==> value-parameter refType: ReferenceType? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.createRequestForPreparedClass[ValueParameterDescriptorImpl]

'name' @ [161:117] ==> public abstract fun name(): (String..String?) defined in com.sun.jdi.ReferenceType[JavaMethodDescriptor]

'METHOD' @ [166:32] ==> enum entry METHOD defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.BreakpointType[FakeCallableDescriptorForObject]

'getFieldName' @ [167:37] ==> private final fun getFieldName(): String defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint[SimpleFunctionDescriptorImpl]

'properties' @ [169:25] ==> protected/*protected and package*/ for synthetic extension final val KotlinFieldBreakpoint.properties: KotlinPropertyBreakpointProperties[MyPropertyDescriptor]

'WATCH_ACCESS' @ [169:36] ==> public final var WATCH_ACCESS: Boolean defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinPropertyBreakpointProperties[PropertyDescriptorImpl]

'refType' @ [170:38] ==> value-parameter refType: ReferenceType? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.createRequestForPreparedClass[ValueParameterDescriptorImpl]

'methodsByName' @ [170:46] ==> public abstract fun methodsByName(p0: (String..String?)): (MutableList<(Method..Method?)>..List<(Method..Method?)>?) defined in com.sun.jdi.ReferenceType[JavaMethodDescriptor]

'getterName' @ [170:67] ==> @NotNull public open fun getterName(@NotNull p0: String): String defined in org.jetbrains.kotlin.load.java.JvmAbi[JavaMethodDescriptor]

'fieldName' @ [170:78] ==> val fieldName: String defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.createRequestForPreparedClass[LocalVariableDescriptor]

'firstOrNull' @ [170:90] ==> public fun <T> List<(Method..Method?)>.firstOrNull(): Method? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.sun.jdi.Method..com.sun.jdi.Method?)

'getter' @ [171:29] ==> val getter: Method? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.createRequestForPreparedClass[LocalVariableDescriptor]

'createMethodBreakpoint' @ [172:29] ==> private final fun createMethodBreakpoint(debugProcess: DebugProcessImpl, refType: ReferenceType, accessor: Method): Unit defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint[SimpleFunctionDescriptorImpl]

'debugProcess' @ [172:52] ==> value-parameter debugProcess: DebugProcessImpl? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.createRequestForPreparedClass[ValueParameterDescriptorImpl]

'refType' @ [172:66] ==> value-parameter refType: ReferenceType? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.createRequestForPreparedClass[ValueParameterDescriptorImpl]

'getter' @ [172:75] ==> val getter: Method? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.createRequestForPreparedClass[LocalVariableDescriptor]

'properties' @ [176:25] ==> protected/*protected and package*/ for synthetic extension final val KotlinFieldBreakpoint.properties: KotlinPropertyBreakpointProperties[MyPropertyDescriptor]

'WATCH_MODIFICATION' @ [176:36] ==> public final var WATCH_MODIFICATION: Boolean defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinPropertyBreakpointProperties[PropertyDescriptorImpl]

'refType' @ [177:38] ==> value-parameter refType: ReferenceType? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.createRequestForPreparedClass[ValueParameterDescriptorImpl]

'methodsByName' @ [177:46] ==> public abstract fun methodsByName(p0: (String..String?)): (MutableList<(Method..Method?)>..List<(Method..Method?)>?) defined in com.sun.jdi.ReferenceType[JavaMethodDescriptor]

'setterName' @ [177:67] ==> @NotNull public open fun setterName(@NotNull p0: String): String defined in org.jetbrains.kotlin.load.java.JvmAbi[JavaMethodDescriptor]

'fieldName' @ [177:78] ==> val fieldName: String defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.createRequestForPreparedClass[LocalVariableDescriptor]

'firstOrNull' @ [177:90] ==> public fun <T> List<(Method..Method?)>.firstOrNull(): Method? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.sun.jdi.Method..com.sun.jdi.Method?)

'setter' @ [178:29] ==> val setter: Method? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.createRequestForPreparedClass[LocalVariableDescriptor]

'createMethodBreakpoint' @ [179:29] ==> private final fun createMethodBreakpoint(debugProcess: DebugProcessImpl, refType: ReferenceType, accessor: Method): Unit defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint[SimpleFunctionDescriptorImpl]

'debugProcess' @ [179:52] ==> value-parameter debugProcess: DebugProcessImpl? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.createRequestForPreparedClass[ValueParameterDescriptorImpl]

'refType' @ [179:66] ==> value-parameter refType: ReferenceType? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.createRequestForPreparedClass[ValueParameterDescriptorImpl]

'setter' @ [179:75] ==> val setter: Method? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.createRequestForPreparedClass[LocalVariableDescriptor]

'LOG' @ [186:13] ==> private final val LOG: Logger defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.Companion[PropertyDescriptorImpl]

'debug' @ [186:17] ==> public abstract fun debug(@Nullable p0: Throwable?): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'ex' @ [186:23] ==> val ex: Exception /* = Exception */ defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.createRequestForPreparedClass[LocalVariableDescriptor]

'runReadAction' @ [191:16] ==> public fun <T> runReadAction(action: () -> KotlinFieldBreakpoint.BreakpointType?): KotlinFieldBreakpoint.BreakpointType? defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BreakpointType?

'property' @ [192:34] ==> value-parameter property: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.computeBreakpointType[ValueParameterDescriptorImpl]

'analyze' @ [192:43] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [193:30] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.computeBreakpointType.<anonymous>[LocalVariableDescriptor]

'get' @ [193:45] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?), p1: (PsiElement..PsiElement?)): DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.DeclarationDescriptor..org.jetbrains.kotlin.descriptors.DeclarationDescriptor?)

'DECLARATION_TO_DESCRIPTOR' @ [193:64] ==> public final val DECLARATION_TO_DESCRIPTOR: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'property' @ [193:91] ==> value-parameter property: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.computeBreakpointType[ValueParameterDescriptorImpl]

'descriptor' @ [194:17] ==> var descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.computeBreakpointType.<anonymous>[LocalVariableDescriptor]

'descriptor' @ [195:17] ==> var descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.computeBreakpointType.<anonymous>[LocalVariableDescriptor]

'bindingContext' @ [195:30] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.computeBreakpointType.<anonymous>[LocalVariableDescriptor]

'get' @ [195:45] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(ValueParameterDescriptor..ValueParameterDescriptor?), (PropertyDescriptor..PropertyDescriptor?)>..ReadOnlySlice<(ValueParameterDescriptor..ValueParameterDescriptor?), (PropertyDescriptor..PropertyDescriptor?)>?), p1: (ValueParameterDescriptor..ValueParameterDescriptor?)): PropertyDescriptor? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.PropertyDescriptor..org.jetbrains.kotlin.descriptors.PropertyDescriptor?)

'VALUE_PARAMETER_AS_PROPERTY' @ [195:64] ==> public final val VALUE_PARAMETER_AS_PROPERTY: (WritableSlice<(ValueParameterDescriptor..ValueParameterDescriptor?), (PropertyDescriptor..PropertyDescriptor?)>..WritableSlice<(ValueParameterDescriptor..ValueParameterDescriptor?), (PropertyDescriptor..PropertyDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'descriptor' @ [195:93] ==> var descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.computeBreakpointType.<anonymous>[LocalVariableDescriptor]

'if (descriptor != null) {
                if (bindingContext.get(BindingContext.BACKING_FIELD_REQUIRED, descriptor as PropertyDescriptor)!!) {
                    BreakpointType.FIELD
                }
                else {
                    BreakpointType.METHOD
                }
            }
            else {
                null
            }' @ [198:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinFieldBreakpoint.BreakpointType?, elseBranch: KotlinFieldBreakpoint.BreakpointType?): KotlinFieldBreakpoint.BreakpointType?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> BreakpointType?

'descriptor' @ [198:17] ==> var descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.computeBreakpointType.<anonymous>[LocalVariableDescriptor]

'if (bindingContext.get(BindingContext.BACKING_FIELD_REQUIRED, descriptor as PropertyDescriptor)!!) {
                    BreakpointType.FIELD
                }
                else {
                    BreakpointType.METHOD
                }' @ [199:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinFieldBreakpoint.BreakpointType, elseBranch: KotlinFieldBreakpoint.BreakpointType): KotlinFieldBreakpoint.BreakpointType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> BreakpointType

'bindingContext' @ [199:21] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.computeBreakpointType.<anonymous>[LocalVariableDescriptor]

'get' @ [199:36] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(PropertyDescriptor..PropertyDescriptor?), (Boolean..Boolean?)>..ReadOnlySlice<(PropertyDescriptor..PropertyDescriptor?), (Boolean..Boolean?)>?), p1: (PropertyDescriptor..PropertyDescriptor?)): Boolean? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.PropertyDescriptor..org.jetbrains.kotlin.descriptors.PropertyDescriptor?)
    <V : (Any..Any?)> -> (kotlin.Boolean..kotlin.Boolean?)

'BACKING_FIELD_REQUIRED' @ [199:55] ==> public final val BACKING_FIELD_REQUIRED: (WritableSlice<(PropertyDescriptor..PropertyDescriptor?), (Boolean..Boolean?)>..WritableSlice<(PropertyDescriptor..PropertyDescriptor?), (Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'descriptor' @ [199:79] ==> var descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.computeBreakpointType.<anonymous>[LocalVariableDescriptor]

'FIELD' @ [200:36] ==> enum entry FIELD defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.BreakpointType[FakeCallableDescriptorForObject]

'METHOD' @ [203:36] ==> enum entry METHOD defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.BreakpointType[FakeCallableDescriptorForObject]

'debugProcess' @ [213:23] ==> value-parameter debugProcess: DebugProcessImpl defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.createMethodBreakpoint[ValueParameterDescriptorImpl]

'requestsManager' @ [213:36] ==> public final val DebugProcessImpl.requestsManager: (RequestManagerImpl..RequestManagerImpl?)[MyPropertyDescriptor]

'accessor' @ [214:20] ==> value-parameter accessor: Method defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.createMethodBreakpoint[ValueParameterDescriptorImpl]

'allLineLocations' @ [214:29] ==> public abstract fun allLineLocations(): (MutableList<(Location..Location?)>..List<(Location..Location?)>?) defined in com.sun.jdi.Method[JavaMethodDescriptor]

'firstOrNull' @ [214:48] ==> public fun <T> List<(Location..Location?)>.firstOrNull(): Location? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.sun.jdi.Location..com.sun.jdi.Location?)

'if (line != null) {
            val request = manager.createBreakpointRequest(this, line)
            debugProcess.requestsManager.enableRequest(request)
            if (LOG.isDebugEnabled) {
                LOG.debug("Breakpoint request added")
            }
        }
        else {
            var entryRequest: MethodEntryRequest? = findRequest(debugProcess, MethodEntryRequest::class.java, this)
            if (entryRequest == null) {
                entryRequest = manager.createMethodEntryRequest(this)!!
                if (LOG.isDebugEnabled) {
                    LOG.debug("Method entry request added (method = ${accessor.name()}; refType = ${refType.name()})")
                }
            }
            else {
                entryRequest.disable()
            }
            entryRequest.addClassFilter(refType)
            manager.enableRequest(entryRequest)
        }' @ [215:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'line' @ [215:13] ==> val line: Location? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.createMethodBreakpoint[LocalVariableDescriptor]

'manager' @ [216:27] ==> val manager: (RequestManagerImpl..RequestManagerImpl?) defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.createMethodBreakpoint[LocalVariableDescriptor]

'createBreakpointRequest' @ [216:35] ==> public open fun createBreakpointRequest(p0: (FilteredRequestor..FilteredRequestor?), p1: (Location..Location?)): (BreakpointRequest..BreakpointRequest?) defined in com.intellij.debugger.engine.requests.RequestManagerImpl[JavaMethodDescriptor]

'this' @ [216:59] ==> <this> defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint[LazyClassReceiverParameterDescriptor]

'line' @ [216:65] ==> val line: Location? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.createMethodBreakpoint[LocalVariableDescriptor]

'debugProcess' @ [217:13] ==> value-parameter debugProcess: DebugProcessImpl defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.createMethodBreakpoint[ValueParameterDescriptorImpl]

'requestsManager' @ [217:26] ==> public final val DebugProcessImpl.requestsManager: (RequestManagerImpl..RequestManagerImpl?)[MyPropertyDescriptor]

'enableRequest' @ [217:42] ==> public open fun enableRequest(p0: (EventRequest..EventRequest?)): Unit defined in com.intellij.debugger.engine.requests.RequestManagerImpl[JavaMethodDescriptor]

'request' @ [217:56] ==> val request: (BreakpointRequest..BreakpointRequest?) defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.createMethodBreakpoint[LocalVariableDescriptor]

'LOG' @ [218:17] ==> private final val LOG: Logger defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.Companion[PropertyDescriptorImpl]

'isDebugEnabled' @ [218:21] ==> public final val Logger.isDebugEnabled: Boolean[MyPropertyDescriptor]

'LOG' @ [219:17] ==> private final val LOG: Logger defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.Companion[PropertyDescriptorImpl]

'debug' @ [219:21] ==> public abstract fun debug(@NonNls p0: (String..String?)): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'findRequest' @ [223:53] ==> private final inline fun <reified T : EventRequest> findRequest(debugProcess: DebugProcessImpl, requestClass: Class<MethodEntryRequest>, requestor: Requestor): MethodEntryRequest? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : EventRequest> -> MethodEntryRequest

'debugProcess' @ [223:65] ==> value-parameter debugProcess: DebugProcessImpl defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.createMethodBreakpoint[ValueParameterDescriptorImpl]

'java' @ [223:105] ==> public val <T> KClass<MethodEntryRequest>.java: Class<MethodEntryRequest> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> MethodEntryRequest

'this' @ [223:111] ==> <this> defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint[LazyClassReceiverParameterDescriptor]

'if (entryRequest == null) {
                entryRequest = manager.createMethodEntryRequest(this)!!
                if (LOG.isDebugEnabled) {
                    LOG.debug("Method entry request added (method = ${accessor.name()}; refType = ${refType.name()})")
                }
            }
            else {
                entryRequest.disable()
            }' @ [224:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'entryRequest' @ [224:17] ==> var entryRequest: MethodEntryRequest? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.createMethodBreakpoint[LocalVariableDescriptor]

'entryRequest' @ [225:17] ==> var entryRequest: MethodEntryRequest? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.createMethodBreakpoint[LocalVariableDescriptor]

'manager' @ [225:32] ==> val manager: (RequestManagerImpl..RequestManagerImpl?) defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.createMethodBreakpoint[LocalVariableDescriptor]

'createMethodEntryRequest' @ [225:40] ==> public open fun createMethodEntryRequest(p0: (FilteredRequestor..FilteredRequestor?)): (MethodEntryRequest..MethodEntryRequest?) defined in com.intellij.debugger.engine.requests.RequestManagerImpl[JavaMethodDescriptor]

'this' @ [225:65] ==> <this> defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint[LazyClassReceiverParameterDescriptor]

'LOG' @ [226:21] ==> private final val LOG: Logger defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.Companion[PropertyDescriptorImpl]

'isDebugEnabled' @ [226:25] ==> public final val Logger.isDebugEnabled: Boolean[MyPropertyDescriptor]

'LOG' @ [227:21] ==> private final val LOG: Logger defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.Companion[PropertyDescriptorImpl]

'debug' @ [227:25] ==> public abstract fun debug(@NonNls p0: (String..String?)): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'accessor' @ [227:71] ==> value-parameter accessor: Method defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.createMethodBreakpoint[ValueParameterDescriptorImpl]

'name' @ [227:80] ==> public abstract fun name(): (String..String?) defined in com.sun.jdi.Method[JavaMethodDescriptor]

'refType' @ [227:101] ==> value-parameter refType: ReferenceType defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.createMethodBreakpoint[ValueParameterDescriptorImpl]

'name' @ [227:109] ==> public abstract fun name(): (String..String?) defined in com.sun.jdi.ReferenceType[JavaMethodDescriptor]

'entryRequest' @ [231:17] ==> var entryRequest: MethodEntryRequest? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.createMethodBreakpoint[LocalVariableDescriptor]

'disable' @ [231:30] ==> public abstract fun disable(): Unit defined in com.sun.jdi.request.MethodEntryRequest[JavaMethodDescriptor]

'entryRequest' @ [233:13] ==> var entryRequest: MethodEntryRequest? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.createMethodBreakpoint[LocalVariableDescriptor]

'addClassFilter' @ [233:26] ==> public abstract fun addClassFilter(p0: (ReferenceType..ReferenceType?)): Unit defined in com.sun.jdi.request.MethodEntryRequest[JavaMethodDescriptor]

'refType' @ [233:41] ==> value-parameter refType: ReferenceType defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.createMethodBreakpoint[ValueParameterDescriptorImpl]

'manager' @ [234:13] ==> val manager: (RequestManagerImpl..RequestManagerImpl?) defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.createMethodBreakpoint[LocalVariableDescriptor]

'enableRequest' @ [234:21] ==> public open fun enableRequest(p0: (EventRequest..EventRequest?)): Unit defined in com.intellij.debugger.engine.requests.RequestManagerImpl[JavaMethodDescriptor]

'entryRequest' @ [234:35] ==> var entryRequest: MethodEntryRequest? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.createMethodBreakpoint[LocalVariableDescriptor]

'debugProcess' @ [239:24] ==> value-parameter debugProcess: DebugProcessImpl defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.findRequest[ValueParameterDescriptorImpl]

'requestsManager' @ [239:37] ==> public final val DebugProcessImpl.requestsManager: (RequestManagerImpl..RequestManagerImpl?)[MyPropertyDescriptor]

'findRequests' @ [239:53] ==> public open fun findRequests(p0: (Requestor..Requestor?)): (MutableSet<(EventRequest..EventRequest?)>..Set<(EventRequest..EventRequest?)>?) defined in com.intellij.debugger.engine.requests.RequestManagerImpl[JavaMethodDescriptor]

'requestor' @ [239:66] ==> value-parameter requestor: Requestor defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.findRequest[ValueParameterDescriptorImpl]

'requests' @ [240:30] ==> val requests: (MutableSet<(EventRequest..EventRequest?)>..Set<(EventRequest..EventRequest?)>?) defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.findRequest[LocalVariableDescriptor]

'eventRequest' @ [241:17] ==> val eventRequest: (EventRequest..EventRequest?) defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.findRequest[LocalVariableDescriptor]

'java' @ [241:37] ==> public val <T> KClass<out (EventRequest..EventRequest?)>.java: Class<out (EventRequest..EventRequest?)> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out (com.sun.jdi.request.EventRequest..com.sun.jdi.request.EventRequest?))

'requestClass' @ [241:45] ==> value-parameter requestClass: Class<T> defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.findRequest[ValueParameterDescriptorImpl]

'eventRequest' @ [242:24] ==> val eventRequest: (EventRequest..EventRequest?) defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.findRequest[LocalVariableDescriptor]

'breakpointType' @ [249:13] ==> private final var breakpointType: KotlinFieldBreakpoint.BreakpointType defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint[PropertyDescriptorImpl]

'METHOD' @ [249:46] ==> enum entry METHOD defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.BreakpointType[FakeCallableDescriptorForObject]

'!' @ [249:56] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'matchesEvent' @ [249:57] ==> public final fun matchesEvent(event: LocatableEvent): Boolean defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint[SimpleFunctionDescriptorImpl]

'event' @ [249:70] ==> value-parameter event: LocatableEvent defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.evaluateCondition[ValueParameterDescriptorImpl]

'super' @ [252:16] ==> <this> defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint[LazyClassReceiverParameterDescriptor]

'evaluateCondition' @ [252:22] ==> public open fun evaluateCondition(p0: (EvaluationContextImpl..EvaluationContextImpl?), p1: (LocatableEvent..LocatableEvent?)): Boolean defined in com.intellij.debugger.ui.breakpoints.BreakpointWithHighlighter[JavaMethodDescriptor]

'context' @ [252:40] ==> value-parameter context: EvaluationContextImpl defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.evaluateCondition[ValueParameterDescriptorImpl]

'event' @ [252:49] ==> value-parameter event: LocatableEvent defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.evaluateCondition[ValueParameterDescriptorImpl]

'event' @ [256:22] ==> value-parameter event: LocatableEvent defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.matchesEvent[ValueParameterDescriptorImpl]

'location' @ [256:28] ==> public abstract fun location(): (Location..Location?) defined in com.sun.jdi.event.LocatableEvent[JavaMethodDescriptor]

'method' @ [256:39] ==> public abstract fun method(): (Method..Method?) defined in com.sun.jdi.Location[JavaMethodDescriptor]

'method' @ [258:16] ==> val method: (Method..Method?) defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.matchesEvent[LocalVariableDescriptor]

'method' @ [258:34] ==> val method: (Method..Method?) defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.matchesEvent[LocalVariableDescriptor]

'name' @ [258:41] ==> public abstract fun name(): (String..String?) defined in com.sun.jdi.Method[JavaMethodDescriptor]

'getMethodsName' @ [258:51] ==> private final fun getMethodsName(): List<String> defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint[SimpleFunctionDescriptorImpl]

'getFieldName' @ [262:25] ==> private final fun getFieldName(): String defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint[SimpleFunctionDescriptorImpl]

'listOf' @ [263:16] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'getterName' @ [263:30] ==> @NotNull public open fun getterName(@NotNull p0: String): String defined in org.jetbrains.kotlin.load.java.JvmAbi[JavaMethodDescriptor]

'fieldName' @ [263:41] ==> val fieldName: String defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.getMethodsName[LocalVariableDescriptor]

'setterName' @ [263:60] ==> @NotNull public open fun setterName(@NotNull p0: String): String defined in org.jetbrains.kotlin.load.java.JvmAbi[JavaMethodDescriptor]

'fieldName' @ [263:71] ==> val fieldName: String defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.getMethodsName[LocalVariableDescriptor]

'event' @ [267:24] ==> value-parameter event: LocatableEvent defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.getEventMessage[ValueParameterDescriptorImpl]

'location' @ [267:30] ==> public abstract fun location(): (Location..Location?) defined in com.sun.jdi.event.LocatableEvent[JavaMethodDescriptor]

'location' @ [268:29] ==> val location: (Location..Location?) defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.getEventMessage[LocalVariableDescriptor]

'declaringType' @ [268:38] ==> public abstract fun declaringType(): (ReferenceType..ReferenceType?) defined in com.sun.jdi.Location[JavaMethodDescriptor]

'name' @ [268:54] ==> public abstract fun name(): (String..String?) defined in com.sun.jdi.ReferenceType[JavaMethodDescriptor]

'location' @ [268:69] ==> val location: (Location..Location?) defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.getEventMessage[LocalVariableDescriptor]

'method' @ [268:78] ==> public abstract fun method(): (Method..Method?) defined in com.sun.jdi.Location[JavaMethodDescriptor]

'name' @ [268:87] ==> public abstract fun name(): (String..String?) defined in com.sun.jdi.Method[JavaMethodDescriptor]

'location' @ [270:13] ==> val location: (Location..Location?) defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.getEventMessage[LocalVariableDescriptor]

'sourceName' @ [270:22] ==> public abstract fun sourceName(): (String..String?) defined in com.sun.jdi.Location[JavaMethodDescriptor]

'fileName' @ [273:13] ==> protected/*protected and package*/ for synthetic extension final val KotlinFieldBreakpoint.fileName: (String..String?)[MyPropertyDescriptor]

'fileName' @ [276:13] ==> protected/*protected and package*/ for synthetic extension final val KotlinFieldBreakpoint.fileName: (String..String?)[MyPropertyDescriptor]

'location' @ [279:28] ==> val location: (Location..Location?) defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.getEventMessage[LocalVariableDescriptor]

'lineNumber' @ [279:37] ==> public abstract fun lineNumber(): Int defined in com.sun.jdi.Location[JavaMethodDescriptor]

'when (event) {
            is ModificationWatchpointEvent-> {
                val field = event.field()
                return DebuggerBundle.message(
                        "status.static.field.watchpoint.reached.access",
                        field.declaringType().name(),
                        field.name(),
                        locationQName,
                        locationFileName,
                        locationLine)
            }
            is AccessWatchpointEvent -> {
                val field = event.field()
                return DebuggerBundle.message(
                        "status.static.field.watchpoint.reached.access",
                        field.declaringType().name(),
                        field.name(),
                        locationQName,
                        locationFileName,
                        locationLine)
            }
            is MethodEntryEvent -> {
                val method = event.method()
                return DebuggerBundle.message(
                        "status.method.entry.breakpoint.reached",
                        method.declaringType().name() + "." + method.name() + "()",
                        locationQName,
                        locationFileName,
                        locationLine)
            }
            is MethodExitEvent -> {
                val method = event.method()
                return DebuggerBundle.message(
                        "status.method.exit.breakpoint.reached",
                        method.declaringType().name() + "." + method.name() + "()",
                        locationQName,
                        locationFileName,
                        locationLine)
            }
        }' @ [280:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing, entry2: Nothing, entry3: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'event' @ [280:15] ==> value-parameter event: LocatableEvent defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.getEventMessage[ValueParameterDescriptorImpl]

'event' @ [282:29] ==> value-parameter event: LocatableEvent defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.getEventMessage[ValueParameterDescriptorImpl]

'field' @ [282:35] ==> public abstract fun field(): (Field..Field?) defined in com.sun.jdi.event.ModificationWatchpointEvent[JavaMethodDescriptor]

'message' @ [283:39] ==> public open fun message(@NotNull @PropertyKey p0: String, @NotNull vararg p1: (Any..Any?)): (String..String?) defined in com.intellij.debugger.DebuggerBundle[JavaMethodDescriptor]

'field' @ [285:25] ==> val field: (Field..Field?) defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.getEventMessage[LocalVariableDescriptor]

'declaringType' @ [285:31] ==> public abstract fun declaringType(): (ReferenceType..ReferenceType?) defined in com.sun.jdi.Field[JavaMethodDescriptor]

'name' @ [285:47] ==> public abstract fun name(): (String..String?) defined in com.sun.jdi.ReferenceType[JavaMethodDescriptor]

'field' @ [286:25] ==> val field: (Field..Field?) defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.getEventMessage[LocalVariableDescriptor]

'name' @ [286:31] ==> public abstract fun name(): (String..String?) defined in com.sun.jdi.Field[JavaMethodDescriptor]

'locationQName' @ [287:25] ==> val locationQName: String defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.getEventMessage[LocalVariableDescriptor]

'locationFileName' @ [288:25] ==> val locationFileName: (String..String?) defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.getEventMessage[LocalVariableDescriptor]

'locationLine' @ [289:25] ==> val locationLine: Int defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.getEventMessage[LocalVariableDescriptor]

'event' @ [292:29] ==> value-parameter event: LocatableEvent defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.getEventMessage[ValueParameterDescriptorImpl]

'field' @ [292:35] ==> public abstract fun field(): (Field..Field?) defined in com.sun.jdi.event.AccessWatchpointEvent[JavaMethodDescriptor]

'message' @ [293:39] ==> public open fun message(@NotNull @PropertyKey p0: String, @NotNull vararg p1: (Any..Any?)): (String..String?) defined in com.intellij.debugger.DebuggerBundle[JavaMethodDescriptor]

'field' @ [295:25] ==> val field: (Field..Field?) defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.getEventMessage[LocalVariableDescriptor]

'declaringType' @ [295:31] ==> public abstract fun declaringType(): (ReferenceType..ReferenceType?) defined in com.sun.jdi.Field[JavaMethodDescriptor]

'name' @ [295:47] ==> public abstract fun name(): (String..String?) defined in com.sun.jdi.ReferenceType[JavaMethodDescriptor]

'field' @ [296:25] ==> val field: (Field..Field?) defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.getEventMessage[LocalVariableDescriptor]

'name' @ [296:31] ==> public abstract fun name(): (String..String?) defined in com.sun.jdi.Field[JavaMethodDescriptor]

'locationQName' @ [297:25] ==> val locationQName: String defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.getEventMessage[LocalVariableDescriptor]

'locationFileName' @ [298:25] ==> val locationFileName: (String..String?) defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.getEventMessage[LocalVariableDescriptor]

'locationLine' @ [299:25] ==> val locationLine: Int defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.getEventMessage[LocalVariableDescriptor]

'event' @ [302:30] ==> value-parameter event: LocatableEvent defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.getEventMessage[ValueParameterDescriptorImpl]

'method' @ [302:36] ==> public abstract fun method(): (Method..Method?) defined in com.sun.jdi.event.MethodEntryEvent[JavaMethodDescriptor]

'message' @ [303:39] ==> public open fun message(@NotNull @PropertyKey p0: String, @NotNull vararg p1: (Any..Any?)): (String..String?) defined in com.intellij.debugger.DebuggerBundle[JavaMethodDescriptor]

'method' @ [305:25] ==> val method: (Method..Method?) defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.getEventMessage[LocalVariableDescriptor]

'declaringType' @ [305:32] ==> public abstract fun declaringType(): (ReferenceType..ReferenceType?) defined in com.sun.jdi.Method[JavaMethodDescriptor]

'name' @ [305:48] ==> public abstract fun name(): (String..String?) defined in com.sun.jdi.ReferenceType[JavaMethodDescriptor]

'method' @ [305:63] ==> val method: (Method..Method?) defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.getEventMessage[LocalVariableDescriptor]

'name' @ [305:70] ==> public abstract fun name(): (String..String?) defined in com.sun.jdi.Method[JavaMethodDescriptor]

'locationQName' @ [306:25] ==> val locationQName: String defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.getEventMessage[LocalVariableDescriptor]

'locationFileName' @ [307:25] ==> val locationFileName: (String..String?) defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.getEventMessage[LocalVariableDescriptor]

'locationLine' @ [308:25] ==> val locationLine: Int defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.getEventMessage[LocalVariableDescriptor]

'event' @ [311:30] ==> value-parameter event: LocatableEvent defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.getEventMessage[ValueParameterDescriptorImpl]

'method' @ [311:36] ==> public abstract fun method(): (Method..Method?) defined in com.sun.jdi.event.MethodExitEvent[JavaMethodDescriptor]

'message' @ [312:39] ==> public open fun message(@NotNull @PropertyKey p0: String, @NotNull vararg p1: (Any..Any?)): (String..String?) defined in com.intellij.debugger.DebuggerBundle[JavaMethodDescriptor]

'method' @ [314:25] ==> val method: (Method..Method?) defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.getEventMessage[LocalVariableDescriptor]

'declaringType' @ [314:32] ==> public abstract fun declaringType(): (ReferenceType..ReferenceType?) defined in com.sun.jdi.Method[JavaMethodDescriptor]

'name' @ [314:48] ==> public abstract fun name(): (String..String?) defined in com.sun.jdi.ReferenceType[JavaMethodDescriptor]

'method' @ [314:63] ==> val method: (Method..Method?) defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.getEventMessage[LocalVariableDescriptor]

'name' @ [314:70] ==> public abstract fun name(): (String..String?) defined in com.sun.jdi.Method[JavaMethodDescriptor]

'locationQName' @ [315:25] ==> val locationQName: String defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.getEventMessage[LocalVariableDescriptor]

'locationFileName' @ [316:25] ==> val locationFileName: (String..String?) defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.getEventMessage[LocalVariableDescriptor]

'locationLine' @ [317:25] ==> val locationLine: Int defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.getEventMessage[LocalVariableDescriptor]

'message' @ [320:31] ==> public open fun message(@NotNull @PropertyKey p0: String, @NotNull vararg p1: (Any..Any?)): (String..String?) defined in com.intellij.debugger.DebuggerBundle[JavaMethodDescriptor]

'locationQName' @ [322:17] ==> val locationQName: String defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.getEventMessage[LocalVariableDescriptor]

'locationFileName' @ [323:17] ==> val locationFileName: (String..String?) defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.getEventMessage[LocalVariableDescriptor]

'locationLine' @ [324:17] ==> val locationLine: Int defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.getEventMessage[LocalVariableDescriptor]

'properties' @ [328:9] ==> protected/*protected and package*/ for synthetic extension final val KotlinFieldBreakpoint.properties: KotlinPropertyBreakpointProperties[MyPropertyDescriptor]

'myFieldName' @ [328:20] ==> @Attribute public final var myFieldName: String defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinPropertyBreakpointProperties[PropertyDescriptorImpl]

'fieldName' @ [328:34] ==> value-parameter fieldName: String defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.setFieldName[ValueParameterDescriptorImpl]

'TestOnly' @ [331:5] ==> public constructor TestOnly() defined in org.jetbrains.annotations.TestOnly[JavaClassConstructorDescriptor]

'properties' @ [333:9] ==> protected/*protected and package*/ for synthetic extension final val KotlinFieldBreakpoint.properties: KotlinPropertyBreakpointProperties[MyPropertyDescriptor]

'WATCH_ACCESS' @ [333:20] ==> public final var WATCH_ACCESS: Boolean defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinPropertyBreakpointProperties[PropertyDescriptorImpl]

'value' @ [333:35] ==> value-parameter value: Boolean defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.setWatchAccess[ValueParameterDescriptorImpl]

'TestOnly' @ [336:5] ==> public constructor TestOnly() defined in org.jetbrains.annotations.TestOnly[JavaClassConstructorDescriptor]

'properties' @ [338:9] ==> protected/*protected and package*/ for synthetic extension final val KotlinFieldBreakpoint.properties: KotlinPropertyBreakpointProperties[MyPropertyDescriptor]

'WATCH_MODIFICATION' @ [338:20] ==> public final var WATCH_MODIFICATION: Boolean defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinPropertyBreakpointProperties[PropertyDescriptorImpl]

'value' @ [338:41] ==> value-parameter value: Boolean defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.setWatchModification[ValueParameterDescriptorImpl]

'TestOnly' @ [341:5] ==> public constructor TestOnly() defined in org.jetbrains.annotations.TestOnly[JavaClassConstructorDescriptor]

'properties' @ [343:9] ==> protected/*protected and package*/ for synthetic extension final val KotlinFieldBreakpoint.properties: KotlinPropertyBreakpointProperties[MyPropertyDescriptor]

'WATCH_INITIALIZATION' @ [343:20] ==> public final var WATCH_INITIALIZATION: Boolean defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinPropertyBreakpointProperties[PropertyDescriptorImpl]

'value' @ [343:43] ==> value-parameter value: Boolean defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.setWatchInitialization[ValueParameterDescriptorImpl]

'getInstanceEx' @ [347:40] ==> public open fun getInstanceEx(p0: (Project..Project?)): (DebuggerManagerEx..DebuggerManagerEx?) defined in com.intellij.debugger.DebuggerManagerEx[JavaMethodDescriptor]

'myProject' @ [347:54] ==> protected/*protected and package*/ final val myProject: (Project..Project?) defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint[JavaPropertyDescriptor]

'breakpointManager' @ [347:65] ==> public final val DebuggerManagerEx.breakpointManager: BreakpointManager[MyPropertyDescriptor]

'findMasterBreakpoint' @ [347:83] ==> @Nullable public open fun findMasterBreakpoint(@NotNull p0: raw (Breakpoint<(JavaBreakpointProperties<*>..JavaBreakpointProperties<*>?)>..Breakpoint<out (JavaBreakpointProperties<*>..JavaBreakpointProperties<*>?)>)): raw (Breakpoint<(JavaBreakpointProperties<*>..JavaBreakpointProperties<*>?)>?..Breakpoint<out (JavaBreakpointProperties<*>..JavaBreakpointProperties<*>?)>?) defined in com.intellij.debugger.ui.breakpoints.BreakpointManager[JavaMethodDescriptor]

'this' @ [347:104] ==> <this> defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint[LazyClassReceiverParameterDescriptor]

'when {
            isMuted && master == null -> AllIcons.Debugger.Db_muted_disabled_field_breakpoint
            isMuted && master != null -> AllIcons.Debugger.Db_muted_dep_field_breakpoint
            master != null -> AllIcons.Debugger.Db_dep_field_breakpoint
            else -> AllIcons.Debugger.Db_disabled_field_breakpoint
        }' @ [348:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Icon, entry1: Icon, entry2: Icon, entry3: Icon): Icon[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Icon

'isMuted' @ [349:13] ==> value-parameter isMuted: Boolean defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.getDisabledIcon[ValueParameterDescriptorImpl]

'master' @ [349:24] ==> val master: raw (Breakpoint<(JavaBreakpointProperties<*>..JavaBreakpointProperties<*>?)>?..Breakpoint<out (JavaBreakpointProperties<*>..JavaBreakpointProperties<*>?)>?) defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.getDisabledIcon[LocalVariableDescriptor]

'Db_muted_disabled_field_breakpoint' @ [349:60] ==> public final val Db_muted_disabled_field_breakpoint: (Icon..Icon?) defined in com.intellij.icons.AllIcons.Debugger[JavaPropertyDescriptor]

'isMuted' @ [350:13] ==> value-parameter isMuted: Boolean defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.getDisabledIcon[ValueParameterDescriptorImpl]

'master' @ [350:24] ==> val master: raw (Breakpoint<(JavaBreakpointProperties<*>..JavaBreakpointProperties<*>?)>?..Breakpoint<out (JavaBreakpointProperties<*>..JavaBreakpointProperties<*>?)>?) defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.getDisabledIcon[LocalVariableDescriptor]

'Db_muted_dep_field_breakpoint' @ [350:60] ==> public final val Db_muted_dep_field_breakpoint: (Icon..Icon?) defined in com.intellij.icons.AllIcons.Debugger[JavaPropertyDescriptor]

'master' @ [351:13] ==> val master: raw (Breakpoint<(JavaBreakpointProperties<*>..JavaBreakpointProperties<*>?)>?..Breakpoint<out (JavaBreakpointProperties<*>..JavaBreakpointProperties<*>?)>?) defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.getDisabledIcon[LocalVariableDescriptor]

'Db_dep_field_breakpoint' @ [351:49] ==> public final val Db_dep_field_breakpoint: (Icon..Icon?) defined in com.intellij.icons.AllIcons.Debugger[JavaPropertyDescriptor]

'Db_disabled_field_breakpoint' @ [352:39] ==> public final val Db_disabled_field_breakpoint: (Icon..Icon?) defined in com.intellij.icons.AllIcons.Debugger[JavaPropertyDescriptor]

'when {
            isMuted -> AllIcons.Debugger.Db_muted_field_breakpoint
            else -> AllIcons.Debugger.Db_field_breakpoint
        }' @ [357:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Icon, entry1: Icon): Icon[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Icon

'isMuted' @ [358:13] ==> value-parameter isMuted: Boolean defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.getSetIcon[ValueParameterDescriptorImpl]

'Db_muted_field_breakpoint' @ [358:42] ==> public final val Db_muted_field_breakpoint: (Icon..Icon?) defined in com.intellij.icons.AllIcons.Debugger[JavaPropertyDescriptor]

'Db_field_breakpoint' @ [359:39] ==> public final val Db_field_breakpoint: (Icon..Icon?) defined in com.intellij.icons.AllIcons.Debugger[JavaPropertyDescriptor]

'when {
            isMuted -> AllIcons.Debugger.Db_muted_invalid_field_breakpoint
            else -> AllIcons.Debugger.Db_invalid_field_breakpoint
        }' @ [364:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Icon, entry1: Icon): Icon[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Icon

'isMuted' @ [365:13] ==> value-parameter isMuted: Boolean defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.getInvalidIcon[ValueParameterDescriptorImpl]

'Db_muted_invalid_field_breakpoint' @ [365:42] ==> public final val Db_muted_invalid_field_breakpoint: (Icon..Icon?) defined in com.intellij.icons.AllIcons.Debugger[JavaPropertyDescriptor]

'Db_invalid_field_breakpoint' @ [366:39] ==> public final val Db_invalid_field_breakpoint: (Icon..Icon?) defined in com.intellij.icons.AllIcons.Debugger[JavaPropertyDescriptor]

'when {
            isMuted -> AllIcons.Debugger.Db_muted_verified_field_breakpoint
            else -> AllIcons.Debugger.Db_verified_field_breakpoint
        }' @ [371:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Icon, entry1: Icon): Icon[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Icon

'isMuted' @ [372:13] ==> value-parameter isMuted: Boolean defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.getVerifiedIcon[ValueParameterDescriptorImpl]

'Db_muted_verified_field_breakpoint' @ [372:42] ==> public final val Db_muted_verified_field_breakpoint: (Icon..Icon?) defined in com.intellij.icons.AllIcons.Debugger[JavaPropertyDescriptor]

'Db_verified_field_breakpoint' @ [373:39] ==> public final val Db_verified_field_breakpoint: (Icon..Icon?) defined in com.intellij.icons.AllIcons.Debugger[JavaPropertyDescriptor]

'when {
            isMuted -> AllIcons.Debugger.Db_muted_field_warning_breakpoint
            else -> AllIcons.Debugger.Db_field_warning_breakpoint
        }' @ [378:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Icon, entry1: Icon): Icon[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Icon

'isMuted' @ [379:13] ==> value-parameter isMuted: Boolean defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.getVerifiedWarningsIcon[ValueParameterDescriptorImpl]

'Db_muted_field_warning_breakpoint' @ [379:42] ==> public final val Db_muted_field_warning_breakpoint: (Icon..Icon?) defined in com.intellij.icons.AllIcons.Debugger[JavaPropertyDescriptor]

'Db_field_warning_breakpoint' @ [380:39] ==> public final val Db_field_warning_breakpoint: (Icon..Icon?) defined in com.intellij.icons.AllIcons.Debugger[JavaPropertyDescriptor]

'CATEGORY' @ [384:34] ==> private final val CATEGORY: Key<FieldBreakpoint> defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.Companion[PropertyDescriptorImpl]

'!' @ [387:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isValid' @ [387:14] ==> public final val KotlinFieldBreakpoint.isValid: Boolean[MyPropertyDescriptor]

'message' @ [388:35] ==> public open fun message(@NotNull @PropertyKey p0: String, @NotNull vararg p1: (Any..Any?)): (String..String?) defined in com.intellij.debugger.DebuggerBundle[JavaMethodDescriptor]

'className' @ [390:25] ==> public final val KotlinFieldBreakpoint.className: String?[MyPropertyDescriptor]

'if (className != null && !className.isEmpty()) className + "." + getFieldName() else getFieldName()' @ [391:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'className' @ [391:20] ==> val className: String? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.getDisplayName[LocalVariableDescriptor]

'!' @ [391:41] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'className' @ [391:42] ==> val className: String? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.getDisplayName[LocalVariableDescriptor]

'isEmpty' @ [391:52] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'className' @ [391:63] ==> val className: String? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.getDisplayName[LocalVariableDescriptor]

'getFieldName' @ [391:81] ==> private final fun getFieldName(): String defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint[SimpleFunctionDescriptorImpl]

'getFieldName' @ [391:101] ==> private final fun getFieldName(): String defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint[SimpleFunctionDescriptorImpl]

'getField' @ [395:27] ==> public final fun getField(): KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint[SimpleFunctionDescriptorImpl]

'runReadAction' @ [396:16] ==> public fun <T> runReadAction(action: () -> String?): String? defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String?

'declaration' @ [396:32] ==> val declaration: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint.getFieldName[LocalVariableDescriptor]

'name' @ [396:45] ==> public final val KtCallableDeclaration.name: String?[MyPropertyDescriptor]

'getField' @ [400:16] ==> public final fun getField(): KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint[SimpleFunctionDescriptorImpl]

