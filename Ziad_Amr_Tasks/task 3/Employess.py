
import pandas as pd

df= pd.read_csv('C:\\Users\\Ziad\\Desktop\\voda\\task 3\\Employees.csv')

df=df.drop_duplicates()

df['Age'] = df['Age'].astype(int)

df['Salary(EG)']=df['Salary(USD)'] * 48.854

print("avrage Age",df['Age'].mean())

print("Median Salary(USD):", df['Salary(USD)'].median())

print("Median Salary(EG):", df['Salary(EG)'].median())

print("Ratio between males and female employees",df['Gender'].value_counts(normalize = True))

df.to_csv('C:\\Users\\Ziad\\Desktop\\voda\\task 3\\New_Employees_Data.csv', index = False)