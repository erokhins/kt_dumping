'create' @ [27:55] ==> public open fun <E : (JpsElement..JpsElement?)> create(p0: (String..String?)): (JpsElementChildRoleBase<(JpsSimpleElement<out TestingContext>..JpsSimpleElement<out TestingContext>?)>..JpsElementChildRoleBase<(JpsSimpleElement<out TestingContext>..JpsSimpleElement<out TestingContext>?)>?) defined in org.jetbrains.jps.model.ex.JpsElementChildRoleBase[JavaMethodDescriptor]
Inferred types:
    <E : (JpsElement..JpsElement?)> -> JpsSimpleElement<out TestingContext>

'TestOnly' @ [29:1] ==> public constructor TestOnly() defined in org.jetbrains.annotations.TestOnly[JavaClassConstructorDescriptor]

'getInstance' @ [31:43] ==> public open fun getInstance(): (JpsElementFactory..JpsElementFactory?) defined in org.jetbrains.jps.model.JpsElementFactory[JavaMethodDescriptor]

'createSimpleElement' @ [31:57] ==> @NotNull public abstract fun <D : (Any..Any?)> createSimpleElement(@NotNull p0: TestingContext): JpsSimpleElement<(TestingContext..TestingContext?)> defined in org.jetbrains.jps.model.JpsElementFactory[JavaMethodDescriptor]
Inferred types:
    <D : (Any..Any?)> -> TestingContext

'context' @ [31:77] ==> value-parameter context: TestingContext defined in org.jetbrains.kotlin.jps.build.setTestingContext[ValueParameterDescriptorImpl]

'container' @ [32:5] ==> public final val JpsProject.container: JpsElementContainer[MyPropertyDescriptor]

'setChild' @ [32:15] ==> public abstract fun <T : (JpsElement..JpsElement?)> setChild(p0: (JpsElementChildRole<(JpsSimpleElement<out TestingContext>..JpsSimpleElement<out TestingContext>?)>..JpsElementChildRole<(JpsSimpleElement<out TestingContext>..JpsSimpleElement<out TestingContext>?)>?), p1: (JpsSimpleElement<out TestingContext>..JpsSimpleElement<out TestingContext>?)): (JpsSimpleElement<out TestingContext>..JpsSimpleElement<out TestingContext>?) defined in org.jetbrains.jps.model.JpsElementContainer[JavaMethodDescriptor]
Inferred types:
    <T : (JpsElement..JpsElement?)> -> JpsSimpleElement<out TestingContext>

'TESTING_CONTEXT' @ [32:24] ==> private val TESTING_CONTEXT: (JpsElementChildRoleBase<(JpsSimpleElement<out TestingContext>..JpsSimpleElement<out TestingContext>?)>..JpsElementChildRoleBase<(JpsSimpleElement<out TestingContext>..JpsSimpleElement<out TestingContext>?)>?) defined in org.jetbrains.kotlin.jps.build in file TestingContext.kt[PropertyDescriptorImpl]

'dataContainer' @ [32:41] ==> val dataContainer: JpsSimpleElement<(TestingContext..TestingContext?)> defined in org.jetbrains.kotlin.jps.build.setTestingContext[LocalVariableDescriptor]

'container' @ [36:13] ==> public final val JpsProject.container: JpsElementContainer[MyPropertyDescriptor]

'getChild' @ [36:23] ==> public abstract fun <T : (JpsElement..JpsElement?)> getChild(@NotNull p0: JpsElementChildRole<(JpsSimpleElement<out TestingContext>..JpsSimpleElement<out TestingContext>?)>): (JpsSimpleElement<out TestingContext>..JpsSimpleElement<out TestingContext>?) defined in org.jetbrains.jps.model.JpsElementContainer[JavaMethodDescriptor]
Inferred types:
    <T : (JpsElement..JpsElement?)> -> JpsSimpleElement<out TestingContext>

'TESTING_CONTEXT' @ [36:32] ==> private val TESTING_CONTEXT: (JpsElementChildRoleBase<(JpsSimpleElement<out TestingContext>..JpsSimpleElement<out TestingContext>?)>..JpsElementChildRoleBase<(JpsSimpleElement<out TestingContext>..JpsSimpleElement<out TestingContext>?)>?) defined in org.jetbrains.kotlin.jps.build in file TestingContext.kt[PropertyDescriptorImpl]

'data' @ [36:50] ==> public final var <D : (Any..Any?)> JpsSimpleElement<out TestingContext>.data: TestingContext[MyPropertyDescriptor]
Inferred types:
    <D : (Any..Any?)> -> TestingContext

'projectDescriptor' @ [39:13] ==> public final val CompileContext.projectDescriptor: (ProjectDescriptor..ProjectDescriptor?)[MyPropertyDescriptor]

'project' @ [39:32] ==> public final val ProjectDescriptor.project: (JpsProject..JpsProject?)[MyPropertyDescriptor]

'testingContext' @ [39:41] ==> public val JpsProject.testingContext: TestingContext? defined in org.jetbrains.kotlin.jps.build in file TestingContext.kt[PropertyDescriptorImpl]

